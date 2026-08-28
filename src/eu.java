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

public class eu implements ew<eu>, ez {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("permissions.requires.entity"));
   private final et c;
   private final eyw d;
   private final arj e;
   private final int f;
   private final String g;
   private final xe h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final btr k;
   private final er l;
   private final fg.a m;
   private final eyv n;
   private final es o;
   private final bad p;

   public eu(et $$0, eyw $$1, eyv $$2, arj $$3, int $$4, String $$5, xe $$6, MinecraftServer $$7, @Nullable btr $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, er.a, fg.a.a, es.a, bad.immediate($$7));
   }

   protected eu(
      et $$0,
      eyw $$1,
      eyv $$2,
      arj $$3,
      int $$4,
      String $$5,
      xe $$6,
      MinecraftServer $$7,
      @Nullable btr $$8,
      boolean $$9,
      er $$10,
      fg.a $$11,
      es $$12,
      bad $$13
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

   public eu a(et $$0) {
      return this.c == $$0 ? this : new eu($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eu a(btr $$0) {
      return this.k == $$0
         ? this
         : new eu(this.c, this.d, this.n, this.e, this.f, $$0.aj().getString(), $$0.R_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public eu a(eyw $$0) {
      return this.d.equals($$0) ? this : new eu(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eu a(eyv $$0) {
      return this.n.c($$0) ? this : new eu(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eu a(er $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new eu(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public eu a(er $$0, BinaryOperator<er> $$1) {
      er $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public eu a() {
      return !this.j && !this.c.m_()
         ? new eu(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public eu a(int $$0) {
      return $$0 == this.f ? this : new eu(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eu b(int $$0) {
      return $$0 <= this.f ? this : new eu(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eu a(fg.a $$0) {
      return $$0 == this.m ? this : new eu(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public eu a(arj $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dyo.a(this.e.C_(), $$0.C_());
         eyw $$2 = new eyw(this.d.d * $$1, this.d.e, this.d.f * $$1);
         return new eu(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public eu a(btr $$0, fg.a $$1) {
      return this.b($$1.a($$0));
   }

   public eu b(eyw $$0) {
      eyw $$1 = this.m.a(this);
      double $$2 = $$0.d - $$1.d;
      double $$3 = $$0.e - $$1.e;
      double $$4 = $$0.f - $$1.f;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = azf.h((float)(-(azf.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = azf.h((float)(azf.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new eyv($$6, $$7));
   }

   public eu a(es $$0, bad $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new eu(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public xe b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public eyw d() {
      return this.d;
   }

   public arj e() {
      return this.e;
   }

   @Nullable
   public btr f() {
      return this.k;
   }

   public btr g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public ark h() throws CommandSyntaxException {
      btr var2 = this.k;
      if (var2 instanceof ark) {
         return (ark)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public ark i() {
      return this.k instanceof ark $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof ark;
   }

   public eyv k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public fg.a m() {
      return this.m;
   }

   public es n() {
      return this.o;
   }

   public bad o() {
      return this.p;
   }

   public boolean a(ark $$0) {
      ark $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.ab() || $$0.ab();
   }

   public void a(xt $$0, boolean $$1, xa.a $$2) {
      if (!this.j) {
         ark $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(xe $$0) {
      if (!this.j) {
         ark $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<xe> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.K_() && !this.j;
      if ($$2 || $$3) {
         xe $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(xe $$0) {
      xe $$1 = xe.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aL().b(def.p)) {
         for (ark $$2 : this.i.ag().t()) {
            if ($$2 != this.c && this.i.ag().f($$2.gc())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aL().b(def.m)) {
         this.i.a($$1);
      }
   }

   public void b(xe $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(xe.i().b($$0).a(n.m));
      }
   }

   @Override
   public er p() {
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
   public Stream<ale> s() {
      return lv.b.s().map(awf::a);
   }

   @Override
   public Stream<ale> t() {
      return this.i.aI().g();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(ald<? extends kb<?>> $$0, ez.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().a($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<ald<dej>> u() {
      return this.i.K();
   }

   @Override
   public kc v() {
      return this.i.bb();
   }

   @Override
   public cqq w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<eu> x() {
      return this.l().aE().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hx $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xh.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
