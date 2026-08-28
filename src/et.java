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
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("permissions.requires.entity"));
   private final es c;
   private final eye d;
   private final arg e;
   private final int f;
   private final String g;
   private final xd h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final btj k;
   private final eq l;
   private final ff.a m;
   private final eyd n;
   private final er o;
   private final baa p;

   public et(es $$0, eye $$1, eyd $$2, arg $$3, int $$4, String $$5, xd $$6, MinecraftServer $$7, @Nullable btj $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, eq.a, ff.a.a, er.a, baa.immediate($$7));
   }

   protected et(
      es $$0,
      eye $$1,
      eyd $$2,
      arg $$3,
      int $$4,
      String $$5,
      xd $$6,
      MinecraftServer $$7,
      @Nullable btj $$8,
      boolean $$9,
      eq $$10,
      ff.a $$11,
      er $$12,
      baa $$13
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

   public et a(btj $$0) {
      return this.k == $$0
         ? this
         : new et(this.c, this.d, this.n, this.e, this.f, $$0.aj().getString(), $$0.Q_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public et a(eye $$0) {
      return this.d.equals($$0) ? this : new et(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public et a(eyd $$0) {
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

   public et a(arg $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dxw.a(this.e.B_(), $$0.B_());
         eye $$2 = new eye(this.d.d * $$1, this.d.e, this.d.f * $$1);
         return new et(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public et a(btj $$0, ff.a $$1) {
      return this.b($$1.a($$0));
   }

   public et b(eye $$0) {
      eye $$1 = this.m.a(this);
      double $$2 = $$0.d - $$1.d;
      double $$3 = $$0.e - $$1.e;
      double $$4 = $$0.f - $$1.f;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = azc.g((float)(-(azc.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = azc.g((float)(azc.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new eyd($$6, $$7));
   }

   public et a(er $$0, baa $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new et(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public xd b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public eye d() {
      return this.d;
   }

   public arg e() {
      return this.e;
   }

   @Nullable
   public btj f() {
      return this.k;
   }

   public btj g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public arh h() throws CommandSyntaxException {
      btj var2 = this.k;
      if (var2 instanceof arh) {
         return (arh)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public arh i() {
      return this.k instanceof arh $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof arh;
   }

   public eyd k() {
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

   public baa o() {
      return this.p;
   }

   public boolean a(arh $$0) {
      arh $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.ab() || $$0.ab();
   }

   public void a(xs $$0, boolean $$1, wz.a $$2) {
      if (!this.j) {
         arh $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(xd $$0) {
      if (!this.j) {
         arh $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<xd> $$0, boolean $$1) {
      boolean $$2 = this.c.k_() && !this.j;
      boolean $$3 = $$1 && this.c.J_() && !this.j;
      if ($$2 || $$3) {
         xd $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(xd $$0) {
      xd $$1 = xd.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aL().b(ddo.p)) {
         for (arh $$2 : this.i.ag().t()) {
            if ($$2 != this.c && this.i.ag().f($$2.gb())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aL().b(ddo.m)) {
         this.i.a($$1);
      }
   }

   public void b(xd $$0) {
      if (this.c.v_() && !this.j) {
         this.c.a(xd.i().b($$0).a(n.m));
      }
   }

   @Override
   public eq p() {
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
   public Stream<alb> s() {
      return lu.b.s().map(awc::a);
   }

   @Override
   public Stream<alb> t() {
      return this.i.aI().g();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(ala<? extends ka<?>> $$0, ey.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<ala<dds>> u() {
      return this.i.K();
   }

   @Override
   public kb v() {
      return this.i.bb();
   }

   @Override
   public cqh w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<et> x() {
      return this.l().aE().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hw $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xg.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
