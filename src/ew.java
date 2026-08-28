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

public class ew implements ey<ew>, fb {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("permissions.requires.entity"));
   private final ev c;
   private final fbr d;
   private final arx e;
   private final int f;
   private final String g;
   private final xk h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bvb k;
   private final et l;
   private final fi.a m;
   private final fbq n;
   private final eu o;
   private final bas p;

   public ew(ev $$0, fbr $$1, fbq $$2, arx $$3, int $$4, String $$5, xk $$6, MinecraftServer $$7, @Nullable bvb $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, et.a, fi.a.a, eu.a, bas.immediate($$7));
   }

   protected ew(
      ev $$0,
      fbr $$1,
      fbq $$2,
      arx $$3,
      int $$4,
      String $$5,
      xk $$6,
      MinecraftServer $$7,
      @Nullable bvb $$8,
      boolean $$9,
      et $$10,
      fi.a $$11,
      eu $$12,
      bas $$13
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

   public ew a(ev $$0) {
      return this.c == $$0 ? this : new ew($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ew a(bvb $$0) {
      return this.k == $$0
         ? this
         : new ew(this.c, this.d, this.n, this.e, this.f, $$0.al().getString(), $$0.p_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public ew a(fbr $$0) {
      return this.d.equals($$0) ? this : new ew(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ew a(fbq $$0) {
      return this.n.c($$0) ? this : new ew(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ew a(et $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ew(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public ew a(et $$0, BinaryOperator<et> $$1) {
      et $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ew a() {
      return !this.j && !this.c.t_()
         ? new ew(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public ew a(int $$0) {
      return $$0 == this.f ? this : new ew(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ew b(int $$0) {
      return $$0 <= this.f ? this : new ew(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ew a(fi.a $$0) {
      return $$0 == this.m ? this : new ew(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public ew a(arx $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = ebj.a(this.e.G_(), $$0.G_());
         fbr $$2 = new fbr(this.d.d * $$1, this.d.e, this.d.f * $$1);
         return new ew(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public ew a(bvb $$0, fi.a $$1) {
      return this.b($$1.a($$0));
   }

   public ew b(fbr $$0) {
      fbr $$1 = this.m.a(this);
      double $$2 = $$0.d - $$1.d;
      double $$3 = $$0.e - $$1.e;
      double $$4 = $$0.f - $$1.f;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = azu.h((float)(-(azu.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = azu.h((float)(azu.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new fbq($$6, $$7));
   }

   public ew a(eu $$0, bas $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new ew(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public xk b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public fbr d() {
      return this.d;
   }

   public arx e() {
      return this.e;
   }

   @Nullable
   public bvb f() {
      return this.k;
   }

   public bvb g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public ary h() throws CommandSyntaxException {
      bvb var2 = this.k;
      if (var2 instanceof ary) {
         return (ary)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public ary i() {
      return this.k instanceof ary $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof ary;
   }

   public fbq k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public fi.a m() {
      return this.m;
   }

   public eu n() {
      return this.o;
   }

   public bas o() {
      return this.p;
   }

   public boolean a(ary $$0) {
      ary $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.aa() || $$0.aa();
   }

   public void a(xz $$0, boolean $$1, xg.a $$2) {
      if (!this.j) {
         ary $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(xk $$0) {
      if (!this.j) {
         ary $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<xk> $$0, boolean $$1) {
      boolean $$2 = this.c.y_() && !this.j;
      boolean $$3 = $$1 && this.c.c() && !this.j;
      if ($$2 || $$3) {
         xk $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(xk $$0) {
      xk $$1 = xk.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aL().b(dgv.p)) {
         for (ary $$2 : this.i.ag().t()) {
            if ($$2.z() != this.c && this.i.ag().f($$2.gh())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aL().b(dgv.m)) {
         this.i.a($$1);
      }
   }

   public void b(xk $$0) {
      if (this.c.z_() && !this.j) {
         this.c.a(xk.i().b($$0).a(n.m));
      }
   }

   @Override
   public et p() {
      return this.l;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.i.P());
   }

   @Override
   public Collection<String> r() {
      return this.i.aJ().f();
   }

   @Override
   public Stream<alp> s() {
      return ma.b.s().map(awu::a);
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(alo<? extends kd<?>> $$0, fb.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      if ($$0 == mb.bk) {
         return fb.a(this.i.aI().e().stream().map($$0x -> $$0x.a().a()), $$2);
      } else if ($$0 == mb.bj) {
         Collection<ah> $$4 = this.i.aD().b();
         return fb.a($$4.stream().map(ah::a), $$2);
      } else {
         return this.u().a($$0).map($$2x -> {
            this.a($$2x, $$1, $$2);
            return $$2.buildFuture();
         }).orElseGet(Suggestions::empty);
      }
   }

   @Override
   public Set<alo<dgz>> t() {
      return this.i.K();
   }

   @Override
   public ke u() {
      return this.i.ba();
   }

   @Override
   public csk v() {
      return this.e.K();
   }

   @Override
   public CommandDispatcher<ew> w() {
      return this.l().aE().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hz $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xn.a($$1));
      }
   }

   @Override
   public boolean x() {
      return this.j;
   }
}
