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

public class ec implements ee<ec>, eh {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("permissions.requires.entity"));
   private final eb c;
   private final etf d;
   private final aqe e;
   private final int f;
   private final String g;
   private final ws h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bql k;
   private final dz l;
   private final eo.a m;
   private final ete n;
   private final ea o;
   private final ays p;

   public ec(eb $$0, etf $$1, ete $$2, aqe $$3, int $$4, String $$5, ws $$6, MinecraftServer $$7, @Nullable bql $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, dz.a, eo.a.a, ea.a, ays.immediate($$7));
   }

   protected ec(
      eb $$0,
      etf $$1,
      ete $$2,
      aqe $$3,
      int $$4,
      String $$5,
      ws $$6,
      MinecraftServer $$7,
      @Nullable bql $$8,
      boolean $$9,
      dz $$10,
      eo.a $$11,
      ea $$12,
      ays $$13
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

   public ec a(eb $$0) {
      return this.c == $$0 ? this : new ec($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ec a(bql $$0) {
      return this.k == $$0
         ? this
         : new ec(this.c, this.d, this.n, this.e, this.f, $$0.ad().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public ec a(etf $$0) {
      return this.d.equals($$0) ? this : new ec(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ec a(ete $$0) {
      return this.n.c($$0) ? this : new ec(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ec a(dz $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ec(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public ec a(dz $$0, BinaryOperator<dz> $$1) {
      dz $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ec a() {
      return !this.j && !this.c.m_()
         ? new ec(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public ec a(int $$0) {
      return $$0 == this.f ? this : new ec(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ec b(int $$0) {
      return $$0 <= this.f ? this : new ec(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ec a(eo.a $$0) {
      return $$0 == this.m ? this : new ec(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public ec a(aqe $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dtq.a(this.e.D_(), $$0.D_());
         etf $$2 = new etf(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new ec(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public ec a(bql $$0, eo.a $$1) {
      return this.b($$1.a($$0));
   }

   public ec b(etf $$0) {
      etf $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = axw.g((float)(-(axw.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = axw.g((float)(axw.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new ete($$6, $$7));
   }

   public ec a(ea $$0, ays $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new ec(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public ws b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public etf d() {
      return this.d;
   }

   public aqe e() {
      return this.e;
   }

   @Nullable
   public bql f() {
      return this.k;
   }

   public bql g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public aqf h() throws CommandSyntaxException {
      bql var2 = this.k;
      if (var2 instanceof aqf) {
         return (aqf)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public aqf i() {
      return this.k instanceof aqf $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof aqf;
   }

   public ete k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public eo.a m() {
      return this.m;
   }

   public ea n() {
      return this.o;
   }

   public ays o() {
      return this.p;
   }

   public boolean a(aqf $$0) {
      aqf $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(xh $$0, boolean $$1, wo.a $$2) {
      if (!this.j) {
         aqf $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(ws $$0) {
      if (!this.j) {
         aqf $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<ws> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         ws $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(ws $$0) {
      ws $$1 = ws.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aN().b(czq.p)) {
         for (aqf $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.fZ())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aN().b(czq.m)) {
         this.i.a($$1);
      }
   }

   public void b(ws $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(ws.i().b($$0).a(n.m));
      }
   }

   @Override
   public dz p() {
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
   public Stream<akf> s() {
      return lc.b.s().map(auy::a);
   }

   @Override
   public Stream<akf> t() {
      return this.i.aJ().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(ake<? extends ji<?>> $$0, eh.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<ake<czu>> u() {
      return this.i.J();
   }

   @Override
   public jj v() {
      return this.i.bd();
   }

   @Override
   public cmy w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<ec> x() {
      return this.l().aF().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable he $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(wv.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
