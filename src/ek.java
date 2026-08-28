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

public class ek implements em<ek>, ep {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("permissions.requires.entity"));
   private final ej d;
   private final fgc e;
   private final asb f;
   private final int g;
   private final String h;
   private final xg i;
   private final MinecraftServer j;
   private final boolean k;
   @Nullable
   private final bxe l;
   private final eh m;
   private final ew.a n;
   private final fgb o;
   private final ei p;
   private final baz q;

   public ek(ej $$0, fgc $$1, fgb $$2, asb $$3, int $$4, String $$5, xg $$6, MinecraftServer $$7, @Nullable bxe $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, eh.a, ew.a.a, ei.a, baz.immediate($$7));
   }

   protected ek(
      ej $$0,
      fgc $$1,
      fgb $$2,
      asb $$3,
      int $$4,
      String $$5,
      xg $$6,
      MinecraftServer $$7,
      @Nullable bxe $$8,
      boolean $$9,
      eh $$10,
      ew.a $$11,
      ei $$12,
      baz $$13
   ) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.k = $$9;
      this.l = $$8;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
      this.m = $$10;
      this.n = $$11;
      this.o = $$2;
      this.p = $$12;
      this.q = $$13;
   }

   public ek a(ej $$0) {
      return this.d == $$0 ? this : new ek($$0, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ek a(bxe $$0) {
      return this.l == $$0
         ? this
         : new ek(this.d, this.e, this.o, this.f, this.g, $$0.ah().getString(), $$0.P_(), this.j, $$0, this.k, this.m, this.n, this.p, this.q);
   }

   public ek a(fgc $$0) {
      return this.e.equals($$0) ? this : new ek(this.d, $$0, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ek a(fgb $$0) {
      return this.o.c($$0) ? this : new ek(this.d, this.e, $$0, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ek a(eh $$0) {
      return Objects.equals(this.m, $$0)
         ? this
         : new ek(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, $$0, this.n, this.p, this.q);
   }

   public ek a(eh $$0, BinaryOperator<eh> $$1) {
      eh $$2 = $$1.apply(this.m, $$0);
      return this.a($$2);
   }

   public ek a() {
      return !this.k && !this.d.o_()
         ? new ek(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, true, this.m, this.n, this.p, this.q)
         : this;
   }

   public ek a(int $$0) {
      return $$0 == this.g ? this : new ek(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ek b(int $$0) {
      return $$0 <= this.g ? this : new ek(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ek a(ew.a $$0) {
      return $$0 == this.n ? this : new ek(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, $$0, this.p, this.q);
   }

   public ek a(asb $$0) {
      if ($$0 == this.f) {
         return this;
      } else {
         double $$1 = efn.a(this.f.F_(), $$0.F_());
         fgc $$2 = new fgc(this.e.d * $$1, this.e.e, this.e.f * $$1);
         return new ek(this.d, $$2, this.o, $$0, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
      }
   }

   public ek a(bxe $$0, ew.a $$1) {
      return this.b($$1.a($$0));
   }

   public ek b(fgc $$0) {
      fgc $$1 = this.n.a(this);
      double $$2 = $$0.d - $$1.d;
      double $$3 = $$0.e - $$1.e;
      double $$4 = $$0.f - $$1.f;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = azz.h((float)(-(azz.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = azz.h((float)(azz.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new fgb($$6, $$7));
   }

   public ek a(ei $$0, baz $$1) {
      return $$0 == this.p && $$1 == this.q
         ? this
         : new ek(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, $$0, $$1);
   }

   public xg b() {
      return this.i;
   }

   public String c() {
      return this.h;
   }

   @Override
   public boolean c(int $$0) {
      return this.g >= $$0;
   }

   public fgc d() {
      return this.e;
   }

   public asb e() {
      return this.f;
   }

   @Nullable
   public bxe f() {
      return this.l;
   }

   public bxe g() throws CommandSyntaxException {
      if (this.l == null) {
         throw b.create();
      } else {
         return this.l;
      }
   }

   public asc h() throws CommandSyntaxException {
      bxe var2 = this.l;
      if (var2 instanceof asc) {
         return (asc)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public asc i() {
      return this.l instanceof asc $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.l instanceof asc;
   }

   public fgb k() {
      return this.o;
   }

   public MinecraftServer l() {
      return this.j;
   }

   public ew.a m() {
      return this.n;
   }

   public ei n() {
      return this.p;
   }

   public baz o() {
      return this.q;
   }

   public boolean a(asc $$0) {
      asc $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.W() || $$0.W();
   }

   public void a(xv $$0, boolean $$1, xc.a $$2) {
      if (!this.k) {
         asc $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.d.a($$2.a($$0.a()));
         }
      }
   }

   public void a(xg $$0) {
      if (!this.k) {
         asc $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.d.a($$0);
         }
      }
   }

   public void a(Supplier<xg> $$0, boolean $$1) {
      boolean $$2 = this.d.x_() && !this.k;
      boolean $$3 = $$1 && this.d.c() && !this.k;
      if ($$2 || $$3) {
         xg $$4 = $$0.get();
         if ($$2) {
            this.d.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(xg $$0) {
      xg $$1 = xg.a("chat.type.admin", this.b(), $$0).a(o.h, o.u);
      if (this.j.aL().c(dkf.q)) {
         for (asc $$2 : this.j.ag().t()) {
            if ($$2.y() != this.d && this.j.ag().f($$2.gi())) {
               $$2.a($$1);
            }
         }
      }

      if (this.d != this.j && this.j.aL().c(dkf.n)) {
         this.j.a($$1);
      }
   }

   public void b(xg $$0) {
      if (this.d.y_() && !this.k) {
         this.d.a(xg.i().b($$0).a(o.m));
      }
   }

   @Override
   public eh p() {
      return this.m;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.j.P());
   }

   @Override
   public Collection<String> r() {
      return this.j.aJ().e();
   }

   @Override
   public Stream<alr> s() {
      return mh.b.s().map(awx::a);
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(alq<? extends jt<?>> $$0, ep.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      if ($$0 == mi.bv) {
         return ep.a(this.j.aI().d().stream().map($$0x -> $$0x.a().a()), $$2);
      } else if ($$0 == mi.bu) {
         Collection<aj> $$4 = this.j.aD().b();
         return ep.a($$4.stream().map(aj::a), $$2);
      } else {
         return this.u().a($$0).map($$2x -> {
            this.a($$2x, $$1, $$2);
            return $$2.buildFuture();
         }).orElseGet(Suggestions::empty);
      }
   }

   @Override
   public Set<alq<dkj>> t() {
      return this.j.K();
   }

   @Override
   public ju u() {
      return this.j.ba();
   }

   @Override
   public cvs v() {
      return this.f.K();
   }

   @Override
   public CommandDispatcher<ek> w() {
      return this.l().aE().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable ho $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xj.a($$1));
      }
   }

   @Override
   public boolean x() {
      return this.k;
   }
}
