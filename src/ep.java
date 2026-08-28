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

public class ep implements er<ep>, eu {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("permissions.requires.entity"));
   private final eo c;
   private final evm d;
   private final arb e;
   private final int f;
   private final String g;
   private final xl h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bsp k;
   private final em l;
   private final fb.a m;
   private final evl n;
   private final en o;
   private final azr p;

   public ep(eo $$0, evm $$1, evl $$2, arb $$3, int $$4, String $$5, xl $$6, MinecraftServer $$7, @Nullable bsp $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, em.a, fb.a.a, en.a, azr.immediate($$7));
   }

   protected ep(
      eo $$0,
      evm $$1,
      evl $$2,
      arb $$3,
      int $$4,
      String $$5,
      xl $$6,
      MinecraftServer $$7,
      @Nullable bsp $$8,
      boolean $$9,
      em $$10,
      fb.a $$11,
      en $$12,
      azr $$13
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

   public ep a(eo $$0) {
      return this.c == $$0 ? this : new ep($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(bsp $$0) {
      return this.k == $$0
         ? this
         : new ep(this.c, this.d, this.n, this.e, this.f, $$0.af().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(evm $$0) {
      return this.d.equals($$0) ? this : new ep(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(evl $$0) {
      return this.n.c($$0) ? this : new ep(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(em $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ep(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public ep a(em $$0, BinaryOperator<em> $$1) {
      em $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ep a() {
      return !this.j && !this.c.m_()
         ? new ep(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public ep a(int $$0) {
      return $$0 == this.f ? this : new ep(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep b(int $$0) {
      return $$0 <= this.f ? this : new ep(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ep a(fb.a $$0) {
      return $$0 == this.m ? this : new ep(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public ep a(arb $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dvp.a(this.e.D_(), $$0.D_());
         evm $$2 = new evm(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new ep(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public ep a(bsp $$0, fb.a $$1) {
      return this.b($$1.a($$0));
   }

   public ep b(evm $$0) {
      evm $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = ayu.g((float)(-(ayu.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = ayu.g((float)(ayu.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new evl($$6, $$7));
   }

   public ep a(en $$0, azr $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new ep(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public xl b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public evm d() {
      return this.d;
   }

   public arb e() {
      return this.e;
   }

   @Nullable
   public bsp f() {
      return this.k;
   }

   public bsp g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public arc h() throws CommandSyntaxException {
      bsp var2 = this.k;
      if (var2 instanceof arc) {
         return (arc)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public arc i() {
      return this.k instanceof arc $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof arc;
   }

   public evl k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public fb.a m() {
      return this.m;
   }

   public en n() {
      return this.o;
   }

   public azr o() {
      return this.p;
   }

   public boolean a(arc $$0) {
      arc $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(ya $$0, boolean $$1, xh.a $$2) {
      if (!this.j) {
         arc $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(xl $$0) {
      if (!this.j) {
         arc $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<xl> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         xl $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(xl $$0) {
      xl $$1 = xl.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aM().b(dbp.p)) {
         for (arc $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.gb())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aM().b(dbp.m)) {
         this.i.a($$1);
      }
   }

   public void b(xl $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(xl.i().b($$0).a(n.m));
      }
   }

   @Override
   public em p() {
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
   public Stream<alb> s() {
      return lp.b.s().map(avv::a);
   }

   @Override
   public Stream<alb> t() {
      return this.i.aJ().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(ala<? extends jv<?>> $$0, eu.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<ala<dbt>> u() {
      return this.i.J();
   }

   @Override
   public jw v() {
      return this.i.bc();
   }

   @Override
   public cpg w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<ep> x() {
      return this.l().aF().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hr $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(xo.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
