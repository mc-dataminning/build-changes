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

public class ev implements ex<ev>, fa {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("permissions.requires.entity"));
   private final eu c;
   private final ezh d;
   private final arm e;
   private final int f;
   private final String g;
   private final xh h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final btz k;
   private final es l;
   private final fh.a m;
   private final ezg n;
   private final et o;
   private final bah p;

   public ev(eu $$0, ezh $$1, ezg $$2, arm $$3, int $$4, String $$5, xh $$6, MinecraftServer $$7, @Nullable btz $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, es.a, fh.a.a, et.a, bah.immediate($$7));
   }

   protected ev(
      eu $$0,
      ezh $$1,
      ezg $$2,
      arm $$3,
      int $$4,
      String $$5,
      xh $$6,
      MinecraftServer $$7,
      @Nullable btz $$8,
      boolean $$9,
      es $$10,
      fh.a $$11,
      et $$12,
      bah $$13
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

   public ev a(eu $$0) {
      return this.c == $$0 ? this : new ev($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ev a(btz $$0) {
      return this.k == $$0
         ? this
         : new ev(this.c, this.d, this.n, this.e, this.f, $$0.al().getString(), $$0.S_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public ev a(ezh $$0) {
      return this.d.equals($$0) ? this : new ev(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ev a(ezg $$0) {
      return this.n.c($$0) ? this : new ev(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ev a(es $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ev(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public ev a(es $$0, BinaryOperator<es> $$1) {
      es $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ev a() {
      return !this.j && !this.c.m_()
         ? new ev(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public ev a(int $$0) {
      return $$0 == this.f ? this : new ev(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ev b(int $$0) {
      return $$0 <= this.f ? this : new ev(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ev a(fh.a $$0) {
      return $$0 == this.m ? this : new ev(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public ev a(arm $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dyz.a(this.e.D_(), $$0.D_());
         ezh $$2 = new ezh(this.d.d * $$1, this.d.e, this.d.f * $$1);
         return new ev(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public ev a(btz $$0, fh.a $$1) {
      return this.b($$1.a($$0));
   }

   public ev b(ezh $$0) {
      ezh $$1 = this.m.a(this);
      double $$2 = $$0.d - $$1.d;
      double $$3 = $$0.e - $$1.e;
      double $$4 = $$0.f - $$1.f;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = azj.h((float)(-(azj.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = azj.h((float)(azj.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new ezg($$6, $$7));
   }

   public ev a(et $$0, bah $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new ev(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public xh b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public ezh d() {
      return this.d;
   }

   public arm e() {
      return this.e;
   }

   @Nullable
   public btz f() {
      return this.k;
   }

   public btz g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public arn h() throws CommandSyntaxException {
      btz var2 = this.k;
      if (var2 instanceof arn) {
         return (arn)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public arn i() {
      return this.k instanceof arn $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof arn;
   }

   public ezg k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public fh.a m() {
      return this.m;
   }

   public et n() {
      return this.o;
   }

   public bah o() {
      return this.p;
   }

   public boolean a(arn $$0) {
      arn $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.ab() || $$0.ab();
   }

   public void a(xw $$0, boolean $$1, xd.a $$2) {
      if (!this.j) {
         arn $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(xh $$0) {
      if (!this.j) {
         arn $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<xh> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.L_() && !this.j;
      if ($$2 || $$3) {
         xh $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(xh $$0) {
      xh $$1 = xh.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aL().b(der.p)) {
         for (arn $$2 : this.i.ag().t()) {
            if ($$2 != this.c && this.i.ag().f($$2.gj())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aL().b(der.m)) {
         this.i.a($$1);
      }
   }

   public void b(xh $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(xh.i().b($$0).a(n.m));
      }
   }

   @Override
   public es p() {
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
   public Stream<alh> s() {
      return lx.b.s().map(awj::a);
   }

   @Override
   public Stream<alh> t() {
      return this.i.aI().g();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(alg<? extends kc<?>> $$0, fa.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().a($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<alg<dev>> u() {
      return this.i.K();
   }

   @Override
   public kd v() {
      return this.i.bb();
   }

   @Override
   public cra w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<ev> x() {
      return this.l().aE().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hy $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xk.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
