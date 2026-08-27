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
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wg.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wg.c("permissions.requires.entity"));
   private final dt c;
   private final esa d;
   private final aps e;
   private final int f;
   private final String g;
   private final wg h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bpv k;
   private final dr l;
   private final eg.a m;
   private final erz n;
   private final ds o;
   private final ayg p;

   public du(dt $$0, esa $$1, erz $$2, aps $$3, int $$4, String $$5, wg $$6, MinecraftServer $$7, @Nullable bpv $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, dr.a, eg.a.a, ds.a, ayg.immediate($$7));
   }

   protected du(
      dt $$0,
      esa $$1,
      erz $$2,
      aps $$3,
      int $$4,
      String $$5,
      wg $$6,
      MinecraftServer $$7,
      @Nullable bpv $$8,
      boolean $$9,
      dr $$10,
      eg.a $$11,
      ds $$12,
      ayg $$13
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

   public du a(bpv $$0) {
      return this.k == $$0
         ? this
         : new du(this.c, this.d, this.n, this.e, this.f, $$0.ad().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public du a(esa $$0) {
      return this.d.equals($$0) ? this : new du(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public du a(erz $$0) {
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
      return !this.j && !this.c.m_()
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

   public du a(aps $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dsr.a(this.e.D_(), $$0.D_());
         esa $$2 = new esa(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new du(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public du a(bpv $$0, eg.a $$1) {
      return this.b($$1.a($$0));
   }

   public du b(esa $$0) {
      esa $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = axk.g((float)(-(axk.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = axk.g((float)(axk.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new erz($$6, $$7));
   }

   public du a(ds $$0, ayg $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new du(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public wg b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public esa d() {
      return this.d;
   }

   public aps e() {
      return this.e;
   }

   @Nullable
   public bpv f() {
      return this.k;
   }

   public bpv g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public apt h() throws CommandSyntaxException {
      bpv var2 = this.k;
      if (var2 instanceof apt) {
         return (apt)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public apt i() {
      return this.k instanceof apt $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof apt;
   }

   public erz k() {
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

   public ayg o() {
      return this.p;
   }

   public boolean a(apt $$0) {
      apt $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(wv $$0, boolean $$1, wc.a $$2) {
      if (!this.j) {
         apt $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wg $$0) {
      if (!this.j) {
         apt $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<wg> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         wg $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(wg $$0) {
      wg $$1 = wg.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aN().b(cyt.p)) {
         for (apt $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.fY())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aN().b(cyt.m)) {
         this.i.a($$1);
      }
   }

   public void b(wg $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(wg.i().b($$0).a(n.m));
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
   public Stream<ajt> s() {
      return kr.b.s().map(aul::a);
   }

   @Override
   public Stream<ajt> t() {
      return this.i.aJ().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(ajs<? extends iy<?>> $$0, dz.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<ajs<cyx>> u() {
      return this.i.J();
   }

   @Override
   public iz v() {
      return this.i.bd();
   }

   @Override
   public cmg w() {
      return this.e.J();
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
         this.b(wj.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
