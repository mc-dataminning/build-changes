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

public class ex implements ez<ex>, fc {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("permissions.requires.entity"));
   private final ew d;
   private final fcu e;
   private final arn f;
   private final int g;
   private final String h;
   private final wv i;
   private final MinecraftServer j;
   private final boolean k;
   @Nullable
   private final bvs l;
   private final eu m;
   private final fj.a n;
   private final fct o;
   private final ev p;
   private final bai q;

   public ex(ew $$0, fcu $$1, fct $$2, arn $$3, int $$4, String $$5, wv $$6, MinecraftServer $$7, @Nullable bvs $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, eu.a, fj.a.a, ev.a, bai.immediate($$7));
   }

   protected ex(
      ew $$0,
      fcu $$1,
      fct $$2,
      arn $$3,
      int $$4,
      String $$5,
      wv $$6,
      MinecraftServer $$7,
      @Nullable bvs $$8,
      boolean $$9,
      eu $$10,
      fj.a $$11,
      ev $$12,
      bai $$13
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

   public ex a(ew $$0) {
      return this.d == $$0 ? this : new ex($$0, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(bvs $$0) {
      return this.l == $$0
         ? this
         : new ex(this.d, this.e, this.o, this.f, this.g, $$0.al().getString(), $$0.m_(), this.j, $$0, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(fcu $$0) {
      return this.e.equals($$0) ? this : new ex(this.d, $$0, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(fct $$0) {
      return this.o.c($$0) ? this : new ex(this.d, this.e, $$0, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(eu $$0) {
      return Objects.equals(this.m, $$0)
         ? this
         : new ex(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, $$0, this.n, this.p, this.q);
   }

   public ex a(eu $$0, BinaryOperator<eu> $$1) {
      eu $$2 = $$1.apply(this.m, $$0);
      return this.a($$2);
   }

   public ex a() {
      return !this.k && !this.d.o_()
         ? new ex(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, true, this.m, this.n, this.p, this.q)
         : this;
   }

   public ex a(int $$0) {
      return $$0 == this.g ? this : new ex(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex b(int $$0) {
      return $$0 <= this.g ? this : new ex(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
   }

   public ex a(fj.a $$0) {
      return $$0 == this.n ? this : new ex(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, $$0, this.p, this.q);
   }

   public ex a(arn $$0) {
      if ($$0 == this.f) {
         return this;
      } else {
         double $$1 = ecj.a(this.f.B_(), $$0.B_());
         fcu $$2 = new fcu(this.e.d * $$1, this.e.e, this.e.f * $$1);
         return new ex(this.d, $$2, this.o, $$0, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q);
      }
   }

   public ex a(bvs $$0, fj.a $$1) {
      return this.b($$1.a($$0));
   }

   public ex b(fcu $$0) {
      fcu $$1 = this.n.a(this);
      double $$2 = $$0.d - $$1.d;
      double $$3 = $$0.e - $$1.e;
      double $$4 = $$0.f - $$1.f;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = azk.h((float)(-(azk.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = azk.h((float)(azk.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new fct($$6, $$7));
   }

   public ex a(ev $$0, bai $$1) {
      return $$0 == this.p && $$1 == this.q
         ? this
         : new ex(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, $$0, $$1);
   }

   public wv b() {
      return this.i;
   }

   public String c() {
      return this.h;
   }

   @Override
   public boolean c(int $$0) {
      return this.g >= $$0;
   }

   public fcu d() {
      return this.e;
   }

   public arn e() {
      return this.f;
   }

   @Nullable
   public bvs f() {
      return this.l;
   }

   public bvs g() throws CommandSyntaxException {
      if (this.l == null) {
         throw b.create();
      } else {
         return this.l;
      }
   }

   public aro h() throws CommandSyntaxException {
      bvs var2 = this.l;
      if (var2 instanceof aro) {
         return (aro)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public aro i() {
      return this.l instanceof aro $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.l instanceof aro;
   }

   public fct k() {
      return this.o;
   }

   public MinecraftServer l() {
      return this.j;
   }

   public fj.a m() {
      return this.n;
   }

   public ev n() {
      return this.p;
   }

   public bai o() {
      return this.q;
   }

   public boolean a(aro $$0) {
      aro $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.aa() || $$0.aa();
   }

   public void a(xk $$0, boolean $$1, wr.a $$2) {
      if (!this.k) {
         aro $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.d.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wv $$0) {
      if (!this.k) {
         aro $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.d.a($$0);
         }
      }
   }

   public void a(Supplier<wv> $$0, boolean $$1) {
      boolean $$2 = this.d.t_() && !this.k;
      boolean $$3 = $$1 && this.d.c() && !this.k;
      if ($$2 || $$3) {
         wv $$4 = $$0.get();
         if ($$2) {
            this.d.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(wv $$0) {
      wv $$1 = wv.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.j.aL().c(dhl.p)) {
         for (aro $$2 : this.j.ag().t()) {
            if ($$2.z() != this.d && this.j.ag().f($$2.gh())) {
               $$2.a($$1);
            }
         }
      }

      if (this.d != this.j && this.j.aL().c(dhl.m)) {
         this.j.a($$1);
      }
   }

   public void b(wv $$0) {
      if (this.d.u_() && !this.k) {
         this.d.a(wv.i().b($$0).a(n.m));
      }
   }

   @Override
   public eu p() {
      return this.m;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.j.P());
   }

   @Override
   public Collection<String> r() {
      return this.j.aJ().f();
   }

   @Override
   public Stream<ald> s() {
      return md.b.s().map(awj::a);
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(alc<? extends kf<?>> $$0, fc.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      if ($$0 == me.br) {
         return fc.a(this.j.aI().e().stream().map($$0x -> $$0x.a().a()), $$2);
      } else if ($$0 == me.bq) {
         Collection<ai> $$4 = this.j.aD().b();
         return fc.a($$4.stream().map(ai::a), $$2);
      } else {
         return this.u().a($$0).map($$2x -> {
            this.a($$2x, $$1, $$2);
            return $$2.buildFuture();
         }).orElseGet(Suggestions::empty);
      }
   }

   @Override
   public Set<alc<dhp>> t() {
      return this.j.K();
   }

   @Override
   public kg u() {
      return this.j.ba();
   }

   @Override
   public cte v() {
      return this.f.K();
   }

   @Override
   public CommandDispatcher<ex> w() {
      return this.l().aE().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable ib $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(wy.a($$1));
      }
   }

   @Override
   public boolean x() {
      return this.k;
   }
}
