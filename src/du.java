import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class du implements dw<du>, dz {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("permissions.requires.entity"));
   private final dt c;
   private final epr d;
   private final apf e;
   private final int f;
   private final String g;
   private final vu h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bow k;
   private final dr l;
   private final eg.a m;
   private final epq n;
   private final ds o;
   private final axs p;

   public du(dt $$0, epr $$1, epq $$2, apf $$3, int $$4, String $$5, vu $$6, MinecraftServer $$7, @Nullable bow $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, dr.a, eg.a.a, ds.a, axs.immediate($$7));
   }

   protected du(
      dt $$0,
      epr $$1,
      epq $$2,
      apf $$3,
      int $$4,
      String $$5,
      vu $$6,
      MinecraftServer $$7,
      @Nullable bow $$8,
      boolean $$9,
      dr $$10,
      eg.a $$11,
      ds $$12,
      axs $$13
   ) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
      this.j = $$9;
      this.k = $$8;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.l = $$10;
      this.m = $$11;
      this.n = $$2;
      this.o = $$12;
      this.p = $$13;
   }

   public du a(dt $$0) {
      return this.c == $$0 ? this : new du($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public du a(bow $$0) {
      return this.k == $$0
         ? this
         : new du(this.c, this.d, this.n, this.e, this.f, $$0.ad().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public du a(epr $$0) {
      return this.d.equals($$0) ? this : new du(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public du a(epq $$0) {
      return this.n.c($$0) ? this : new du(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public du a(dr $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new du(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public du a(dr $$0, BinaryOperator<dr> $$1) {
      dr $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public du a() {
      return !this.j && !this.c.l_()
         ? new du(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public du a(int $$0) {
      return $$0 == this.f ? this : new du(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public du b(int $$0) {
      return $$0 <= this.f ? this : new du(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public du a(eg.a $$0) {
      return $$0 == this.m ? this : new du(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public du a(apf $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dqm.a(this.e.D_(), $$0.D_());
         epr $$2 = new epr(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new du(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public du a(bow $$0, eg.a $$1) {
      return this.b($$1.a($$0));
   }

   public du b(epr $$0) {
      epr $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = aww.g((float)(-(aww.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = aww.g((float)(aww.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new epq($$6, $$7));
   }

   public du a(ds $$0, axs $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new du(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public vu b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public epr d() {
      return this.d;
   }

   public apf e() {
      return this.e;
   }

   @Nullable
   public bow f() {
      return this.k;
   }

   public bow g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public apg h() throws CommandSyntaxException {
      bow var2 = this.k;
      if (var2 instanceof apg) {
         return (apg)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public apg i() {
      return this.k instanceof apg $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof apg;
   }

   public epq k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public eg.a m() {
      return this.m;
   }

   public ds n() {
      return this.o;
   }

   public axs o() {
      return this.p;
   }

   public boolean a(apg $$0) {
      apg $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(wj $$0, boolean $$1, vq.a $$2) {
      if (!this.j) {
         apg $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(vu $$0) {
      if (!this.j) {
         apg $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<vu> $$0, boolean $$1) {
      boolean $$2 = this.c.k_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         vu $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(vu $$0) {
      vu $$1 = vu.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aN().b(cwv.p)) {
         for (apg $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.fY())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aN().b(cwv.m)) {
         this.i.a($$1);
      }
   }

   public void b(vu $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(vu.i().b($$0).a(n.m));
      }
   }

   @Override
   public dr p() {
      return this.l;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.i.O());
   }

   @Override
   public Collection<String> r() {
      return this.i.aK().f();
   }

   @Override
   public Stream<ajh> s() {
      return ki.b.s().map(atx::a);
   }

   @Override
   public Stream<ajh> t() {
      return this.i.aJ().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(ajg<? extends iy<?>> $$0, dz.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<ajg<cwz>> u() {
      return this.i.J();
   }

   @Override
   public iz v() {
      return this.i.bd();
   }

   @Override
   public clf w() {
      return this.e.I();
   }

   @Override
   public CommandDispatcher<du> x() {
      return this.l().aF().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable gv $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(vx.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
