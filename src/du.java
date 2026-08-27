import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class du implements dw<du>, dy {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ui.c("permissions.requires.entity"));
   private static final dq<du> c = ($$0, $$1, $$2) -> {
   };
   private final dt d;
   private final eif e;
   private final alq f;
   private final int g;
   private final String h;
   private final ui i;
   private final MinecraftServer j;
   private final boolean k;
   @Nullable
   private final bjt l;
   private final dq<du> m;
   private final ef.a n;
   private final eie o;
   private final ds p;
   private final att q;
   private final IntConsumer r;

   public du(dt $$0, eif $$1, eie $$2, alq $$3, int $$4, String $$5, ui $$6, MinecraftServer $$7, @Nullable bjt $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, c, ef.a.a, ds.a, att.immediate($$7), $$0x -> {
      });
   }

   protected du(
      dt $$0,
      eif $$1,
      eie $$2,
      alq $$3,
      int $$4,
      String $$5,
      ui $$6,
      MinecraftServer $$7,
      @Nullable bjt $$8,
      boolean $$9,
      dq<du> $$10,
      ef.a $$11,
      ds $$12,
      att $$13,
      IntConsumer $$14
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
      this.r = $$14;
   }

   public du a(dt $$0) {
      return this.d == $$0 ? this : new du($$0, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q, this.r);
   }

   public du a(bjt $$0) {
      return this.l == $$0
         ? this
         : new du(this.d, this.e, this.o, this.f, this.g, $$0.ab().getString(), $$0.O_(), this.j, $$0, this.k, this.m, this.n, this.p, this.q, this.r);
   }

   public du a(eif $$0) {
      return this.e.equals($$0)
         ? this
         : new du(this.d, $$0, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q, this.r);
   }

   public du a(eie $$0) {
      return this.o.c($$0) ? this : new du(this.d, this.e, $$0, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q, this.r);
   }

   public du a(dq<du> $$0) {
      return Objects.equals(this.m, $$0)
         ? this
         : new du(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, $$0, this.n, this.p, this.q, this.r);
   }

   public du a() {
      return this.a(c);
   }

   public du a(dq<du> $$0, BinaryOperator<dq<du>> $$1) {
      dq<du> $$2 = $$1.apply(this.m, $$0);
      return this.a($$2);
   }

   public du b() {
      return !this.k && !this.d.l_()
         ? new du(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, true, this.m, this.n, this.p, this.q, this.r)
         : this;
   }

   public du a(int $$0) {
      return $$0 == this.g ? this : new du(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q, this.r);
   }

   public du b(int $$0) {
      return $$0 <= this.g ? this : new du(this.d, this.e, this.o, this.f, $$0, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q, this.r);
   }

   public du a(ef.a $$0) {
      return $$0 == this.n ? this : new du(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, $$0, this.p, this.q, this.r);
   }

   public du a(alq $$0) {
      if ($$0 == this.f) {
         return this;
      } else {
         double $$1 = djk.a(this.f.D_(), $$0.D_());
         eif $$2 = new eif(this.e.c * $$1, this.e.d, this.e.e * $$1);
         return new du(this.d, $$2, this.o, $$0, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q, this.r);
      }
   }

   public du a(bjt $$0, ef.a $$1) {
      return this.b($$1.a($$0));
   }

   public du b(eif $$0) {
      eif $$1 = this.n.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = asy.g((float)(-(asy.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = asy.g((float)(asy.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new eie($$6, $$7));
   }

   public du a(ds $$0, att $$1) {
      return $$0 == this.p && $$1 == this.q
         ? this
         : new du(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, $$0, $$1, this.r);
   }

   public du a(IntConsumer $$0) {
      return $$0 == this.r ? this : new du(this.d, this.e, this.o, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m, this.n, this.p, this.q, $$0);
   }

   public ui c() {
      return this.i;
   }

   public String d() {
      return this.h;
   }

   @Override
   public boolean c(int $$0) {
      return this.g >= $$0;
   }

   public eif e() {
      return this.e;
   }

   public alq f() {
      return this.f;
   }

   @Nullable
   public bjt g() {
      return this.l;
   }

   public bjt h() throws CommandSyntaxException {
      if (this.l == null) {
         throw b.create();
      } else {
         return this.l;
      }
   }

   public alr i() throws CommandSyntaxException {
      bjt var2 = this.l;
      if (var2 instanceof alr) {
         return (alr)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public alr j() {
      return this.l instanceof alr $$0 ? $$0 : null;
   }

   public boolean k() {
      return this.l instanceof alr;
   }

   public eie l() {
      return this.o;
   }

   public MinecraftServer m() {
      return this.j;
   }

   public ef.a n() {
      return this.n;
   }

   public ds o() {
      return this.p;
   }

   public att p() {
      return this.q;
   }

   public boolean a(alr $$0) {
      alr $$1 = this.j();
      return $$0 == $$1 ? false : $$1 != null && $$1.W() || $$0.W();
   }

   public void a(ux $$0, boolean $$1, ue.a $$2) {
      if (!this.k) {
         alr $$3 = this.j();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.d.a($$2.a($$0.a()));
         }
      }
   }

   public void a(ui $$0) {
      if (!this.k) {
         alr $$1 = this.j();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.d.a($$0);
         }
      }
   }

   public void a(Supplier<ui> $$0, boolean $$1) {
      boolean $$2 = this.d.k_() && !this.k;
      boolean $$3 = $$1 && this.d.U_() && !this.k;
      if ($$2 || $$3) {
         ui $$4 = $$0.get();
         if ($$2) {
            this.d.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(ui $$0) {
      ui $$1 = ui.a("chat.type.admin", this.c(), $$0).a(n.h, n.u);
      if (this.j.aI().b(cqv.o)) {
         for (alr $$2 : this.j.ac().t()) {
            if ($$2 != this.d && this.j.ac().f($$2.fR())) {
               $$2.a($$1);
            }
         }
      }

      if (this.d != this.j && this.j.aI().b(cqv.l)) {
         this.j.a($$1);
      }
   }

   public void b(ui $$0) {
      if (this.d.w_() && !this.k) {
         this.d.a(ui.i().b($$0).a(n.m));
      }
   }

   @Override
   public void a(boolean $$0, int $$1) {
      this.m.storeResult(this, $$0, $$1);
   }

   @Override
   public void d(int $$0) {
      this.r.accept($$0);
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.j.J());
   }

   @Override
   public Collection<String> r() {
      return this.j.aF().f();
   }

   @Override
   public Stream<afw> s() {
      return jy.c.s().map(aqc::a);
   }

   @Override
   public Stream<afw> t() {
      return this.j.aE().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(afv<? extends io<?>> $$0, dy.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<afv<cqz>> u() {
      return this.j.E();
   }

   @Override
   public ip v() {
      return this.j.aU();
   }

   @Override
   public cfg w() {
      return this.f.G();
   }

   @Override
   public CommandDispatcher<du> x() {
      return this.m().aA().a();
   }
}
