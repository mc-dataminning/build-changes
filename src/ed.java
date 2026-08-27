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

public class ed implements ef<ed>, ei {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("permissions.requires.entity"));
   private final ec c;
   private final etp d;
   private final aqh e;
   private final int f;
   private final String g;
   private final wu h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final brh k;
   private final ea l;
   private final ep.a m;
   private final eto n;
   private final eb o;
   private final ayv p;

   public ed(ec $$0, etp $$1, eto $$2, aqh $$3, int $$4, String $$5, wu $$6, MinecraftServer $$7, @Nullable brh $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, ea.a, ep.a.a, eb.a, ayv.immediate($$7));
   }

   protected ed(
      ec $$0,
      etp $$1,
      eto $$2,
      aqh $$3,
      int $$4,
      String $$5,
      wu $$6,
      MinecraftServer $$7,
      @Nullable brh $$8,
      boolean $$9,
      ea $$10,
      ep.a $$11,
      eb $$12,
      ayv $$13
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

   public ed a(ec $$0) {
      return this.c == $$0 ? this : new ed($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ed a(brh $$0) {
      return this.k == $$0
         ? this
         : new ed(this.c, this.d, this.n, this.e, this.f, $$0.ad().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public ed a(etp $$0) {
      return this.d.equals($$0) ? this : new ed(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ed a(eto $$0) {
      return this.n.c($$0) ? this : new ed(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ed a(ea $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ed(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public ed a(ea $$0, BinaryOperator<ea> $$1) {
      ea $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ed a() {
      return !this.j && !this.c.m_()
         ? new ed(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public ed a(int $$0) {
      return $$0 == this.f ? this : new ed(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ed b(int $$0) {
      return $$0 <= this.f ? this : new ed(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public ed a(ep.a $$0) {
      return $$0 == this.m ? this : new ed(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public ed a(aqh $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dtz.a(this.e.D_(), $$0.D_());
         etp $$2 = new etp(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new ed(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public ed a(brh $$0, ep.a $$1) {
      return this.b($$1.a($$0));
   }

   public ed b(etp $$0) {
      etp $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = axz.g((float)(-(axz.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = axz.g((float)(axz.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new eto($$6, $$7));
   }

   public ed a(eb $$0, ayv $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new ed(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
   }

   public wu b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public etp d() {
      return this.d;
   }

   public aqh e() {
      return this.e;
   }

   @Nullable
   public brh f() {
      return this.k;
   }

   public brh g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public aqi h() throws CommandSyntaxException {
      brh var2 = this.k;
      if (var2 instanceof aqi) {
         return (aqi)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public aqi i() {
      return this.k instanceof aqi $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof aqi;
   }

   public eto k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public ep.a m() {
      return this.m;
   }

   public eb n() {
      return this.o;
   }

   public ayv o() {
      return this.p;
   }

   public boolean a(aqi $$0) {
      aqi $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(xj $$0, boolean $$1, wq.a $$2) {
      if (!this.j) {
         aqi $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wu $$0) {
      if (!this.j) {
         aqi $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<wu> $$0, boolean $$1) {
      boolean $$2 = this.c.l_() && !this.j;
      boolean $$3 = $$1 && this.c.U_() && !this.j;
      if ($$2 || $$3) {
         wu $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(wu $$0) {
      wu $$1 = wu.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aM().b(czz.p)) {
         for (aqi $$2 : this.i.ah().t()) {
            if ($$2 != this.c && this.i.ah().f($$2.fZ())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aM().b(czz.m)) {
         this.i.a($$1);
      }
   }

   public void b(wu $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(wu.i().b($$0).a(n.m));
      }
   }

   @Override
   public ea p() {
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
   public Stream<akh> s() {
      return ld.b.s().map(avb::a);
   }

   @Override
   public Stream<akh> t() {
      return this.i.aJ().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(akg<? extends jj<?>> $$0, ei.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<akg<dad>> u() {
      return this.i.J();
   }

   @Override
   public jk v() {
      return this.i.bc();
   }

   @Override
   public cnu w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<ed> x() {
      return this.l().aF().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hf $$3) {
      if ($$3 != null) {
         $$3.a($$1.getString());
      }

      if (!$$2) {
         this.b(wx.a($$1));
      }
   }

   @Override
   public boolean y() {
      return this.j;
   }
}
