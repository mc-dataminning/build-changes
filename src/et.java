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

public class et implements ev<et>, ey {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("permissions.requires.entity"));
   private final es c;
   private final eww d;
   private final aqt e;
   private final int f;
   private final String g;
   private final wy h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bsq k;
   private final eq l;
   private final ff.a m;
   private final ewv n;
   private final er o;
   private final azl p;

   public et(es $$0, eww $$1, ewv $$2, aqt $$3, int $$4, String $$5, wy $$6, MinecraftServer $$7, @Nullable bsq $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, eq.a, ff.a.a, er.a, azl.immediate($$7));
   }

   protected et(
      es $$0,
      eww $$1,
      ewv $$2,
      aqt $$3,
      int $$4,
      String $$5,
      wy $$6,
      MinecraftServer $$7,
      @Nullable bsq $$8,
      boolean $$9,
      eq $$10,
      ff.a $$11,
      er $$12,
      azl $$13
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

   public et a(es $$0) {
      return this.c == $$0 ? this : new et($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public et a(bsq $$0) {
      return this.k == $$0
         ? this
         : new et(this.c, this.d, this.n, this.e, this.f, $$0.ah().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public et a(eww $$0) {
      return this.d.equals($$0) ? this : new et(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public et a(ewv $$0) {
      return this.n.c($$0) ? this : new et(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public et a(eq $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new et(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public et a(eq $$0, BinaryOperator<eq> $$1) {
      eq $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public et a() {
      return !this.j && !this.c.l_()
         ? new et(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public et a(int $$0) {
      return $$0 == this.f ? this : new et(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public et b(int $$0) {
      return $$0 <= this.f ? this : new et(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public et a(ff.a $$0) {
      return $$0 == this.m ? this : new et(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public et a(aqt $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dwv.a(this.e.D_(), $$0.D_());
         eww $$2 = new eww(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new et(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public et a(bsq $$0, ff.a $$1) {
      return this.b($$1.a($$0));
   }

   public et b(eww $$0) {
      eww $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = ayn.g((float)(-(ayn.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = ayn.g((float)(ayn.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new ewv($$6, $$7));
   }

   public et a(er $$0, azl $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new et(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public wy b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public eww d() {
      return this.d;
   }

   public aqt e() {
      return this.e;
   }

   @Nullable
   public bsq f() {
      return this.k;
   }

   public bsq g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public aqu h() throws CommandSyntaxException {
      bsq var2 = this.k;
      if (var2 instanceof aqu) {
         return (aqu)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public aqu i() {
      return this.k instanceof aqu $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof aqu;
   }

   public ewv k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public ff.a m() {
      return this.m;
   }

   public er n() {
      return this.o;
   }

   public azl o() {
      return this.p;
   }

   public boolean a(aqu $$0) {
      aqu $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Z() || $$0.Z();
   }

   public void a(xn $$0, boolean $$1, wu.a $$2) {
      if (!this.j) {
         aqu $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wy $$0) {
      if (!this.j) {
         aqu $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<wy> $$0, boolean $$1) {
      boolean $$2 = this.c.k_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         wy $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(wy $$0) {
      wy $$1 = wy.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aM().b(dcq.p)) {
         for (aqu $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.fY())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aM().b(dcq.m)) {
         this.i.a($$1);
      }
   }

   public void b(wy $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(wy.i().b($$0).a(n.m));
      }
   }

   @Override
   public eq p() {
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
   public Stream<akq> s() {
      return lt.b.t().map(avn::a);
   }

   @Override
   public Stream<akq> t() {
      return this.i.aJ().e();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(akp<? extends jz<?>> $$0, ey.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<akp<dcu>> u() {
      return this.i.J();
   }

   @Override
   public ka v() {
      return this.i.bc();
   }

   @Override
   public cpj w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<et> x() {
      return this.l().aF().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hv $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xb.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
