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

public class eq implements es<eq>, ev {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("permissions.requires.entity"));
   private final ep c;
   private final ewf d;
   private final aqm e;
   private final int f;
   private final String g;
   private final wu h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bsg k;
   private final en l;
   private final fc.a m;
   private final ewe n;
   private final eo o;
   private final aze p;

   public eq(ep $$0, ewf $$1, ewe $$2, aqm $$3, int $$4, String $$5, wu $$6, MinecraftServer $$7, @Nullable bsg $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, en.a, fc.a.a, eo.a, aze.immediate($$7));
   }

   protected eq(
      ep $$0,
      ewf $$1,
      ewe $$2,
      aqm $$3,
      int $$4,
      String $$5,
      wu $$6,
      MinecraftServer $$7,
      @Nullable bsg $$8,
      boolean $$9,
      en $$10,
      fc.a $$11,
      eo $$12,
      aze $$13
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

   public eq a(ep $$0) {
      return this.c == $$0 ? this : new eq($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eq a(bsg $$0) {
      return this.k == $$0
         ? this
         : new eq(this.c, this.d, this.n, this.e, this.f, $$0.ag().getString(), $$0.O_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p);
   }

   public eq a(ewf $$0) {
      return this.d.equals($$0) ? this : new eq(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eq a(ewe $$0) {
      return this.n.c($$0) ? this : new eq(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eq a(en $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new eq(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p);
   }

   public eq a(en $$0, BinaryOperator<en> $$1) {
      en $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public eq a() {
      return !this.j && !this.c.m_()
         ? new eq(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p)
         : this;
   }

   public eq a(int $$0) {
      return $$0 == this.f ? this : new eq(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eq b(int $$0) {
      return $$0 <= this.f ? this : new eq(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
   }

   public eq a(fc.a $$0) {
      return $$0 == this.m ? this : new eq(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p);
   }

   public eq a(aqm $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dwf.a(this.e.D_(), $$0.D_());
         ewf $$2 = new ewf(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new eq(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p);
      }
   }

   public eq a(bsg $$0, fc.a $$1) {
      return this.b($$1.a($$0));
   }

   public eq b(ewf $$0) {
      ewf $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = ayg.g((float)(-(ayg.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = ayg.g((float)(ayg.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new ewe($$6, $$7));
   }

   public eq a(eo $$0, aze $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new eq(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1);
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

   public ewf d() {
      return this.d;
   }

   public aqm e() {
      return this.e;
   }

   @Nullable
   public bsg f() {
      return this.k;
   }

   public bsg g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public aqn h() throws CommandSyntaxException {
      bsg var2 = this.k;
      if (var2 instanceof aqn) {
         return (aqn)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public aqn i() {
      return this.k instanceof aqn $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof aqn;
   }

   public ewe k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public fc.a m() {
      return this.m;
   }

   public eo n() {
      return this.o;
   }

   public aze o() {
      return this.p;
   }

   public boolean a(aqn $$0) {
      aqn $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.Y() || $$0.Y();
   }

   public void a(xj $$0, boolean $$1, wq.a $$2) {
      if (!this.j) {
         aqn $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(wu $$0) {
      if (!this.j) {
         aqn $$1 = this.i();
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
      if (this.i.aN().b(dcb.p)) {
         for (aqn $$2 : this.i.ai().t()) {
            if ($$2 != this.c && this.i.ai().f($$2.fY())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aN().b(dcb.m)) {
         this.i.a($$1);
      }
   }

   public void b(wu $$0) {
      if (this.c.w_() && !this.j) {
         this.c.a(wu.i().b($$0).a(n.m));
      }
   }

   @Override
   public en p() {
      return this.l;
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.i.P());
   }

   @Override
   public Collection<String> r() {
      return this.i.aL().f();
   }

   @Override
   public Stream<akk> s() {
      return lq.b.t().map(avg::a);
   }

   @Override
   public Stream<akk> t() {
      return this.i.aK().e();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(akj<? extends jw<?>> $$0, ev.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<akj<dcf>> u() {
      return this.i.K();
   }

   @Override
   public jx v() {
      return this.i.bd();
   }

   @Override
   public coy w() {
      return this.e.J();
   }

   @Override
   public CommandDispatcher<eq> x() {
      return this.l().aG().a();
   }

   @Override
   public void a(CommandExceptionType $$0, Message $$1, boolean $$2, @Nullable hs $$3) {
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
