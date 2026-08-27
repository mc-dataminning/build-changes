import com.google.common.collect.Lists;
import com.mojang.brigadier.ResultConsumer;
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

public class ds implements dv {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("permissions.requires.entity"));
   private final dr c;
   private final ehf d;
   private final aki e;
   private final int f;
   private final String g;
   private final te h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final big k;
   @Nullable
   private final ResultConsumer<ds> l;
   private final ec.a m;
   private final ehe n;
   private final dq o;
   private final ash p;
   private final IntConsumer q;

   public ds(dr $$0, ehf $$1, ehe $$2, aki $$3, int $$4, String $$5, te $$6, MinecraftServer $$7, @Nullable big $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, ($$0x, $$1x, $$2x) -> {
      }, ec.a.a, dq.a, ash.immediate($$7), $$0x -> {
      });
   }

   protected ds(
      dr $$0,
      ehf $$1,
      ehe $$2,
      aki $$3,
      int $$4,
      String $$5,
      te $$6,
      MinecraftServer $$7,
      @Nullable big $$8,
      boolean $$9,
      @Nullable ResultConsumer<ds> $$10,
      ec.a $$11,
      dq $$12,
      ash $$13,
      IntConsumer $$14
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
      this.q = $$14;
   }

   public ds a(dr $$0) {
      return this.c == $$0 ? this : new ds($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public ds a(big $$0) {
      return this.k == $$0
         ? this
         : new ds(this.c, this.d, this.n, this.e, this.f, $$0.ab().getString(), $$0.H_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public ds a(ehf $$0) {
      return this.d.equals($$0)
         ? this
         : new ds(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public ds a(ehe $$0) {
      return this.n.c($$0) ? this : new ds(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public ds a(ResultConsumer<ds> $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p, this.q);
   }

   public ds a(ResultConsumer<ds> $$0, BinaryOperator<ResultConsumer<ds>> $$1) {
      ResultConsumer<ds> $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public ds a() {
      return !this.j && !this.c.g_()
         ? new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p, this.q)
         : this;
   }

   public ds a(int $$0) {
      return $$0 == this.f ? this : new ds(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public ds b(int $$0) {
      return $$0 <= this.f ? this : new ds(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public ds a(ec.a $$0) {
      return $$0 == this.m ? this : new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p, this.q);
   }

   public ds a(aki $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = dih.a(this.e.x_(), $$0.x_());
         ehf $$2 = new ehf(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new ds(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
      }
   }

   public ds a(big $$0, ec.a $$1) {
      return this.b($$1.a($$0));
   }

   public ds b(ehf $$0) {
      ehf $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = aro.g((float)(-(aro.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = aro.g((float)(aro.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new ehe($$6, $$7));
   }

   public ds a(dq $$0) {
      return $$0 == this.o ? this : new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, this.p, this.q);
   }

   public ds a(ash $$0) {
      return $$0 == this.p ? this : new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, $$0, this.q);
   }

   public ds a(IntConsumer $$0) {
      return $$0 == this.q ? this : new ds(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, $$0);
   }

   public te b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public ehf d() {
      return this.d;
   }

   public aki e() {
      return this.e;
   }

   @Nullable
   public big f() {
      return this.k;
   }

   public big g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public akj h() throws CommandSyntaxException {
      big var2 = this.k;
      if (var2 instanceof akj) {
         return (akj)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public akj i() {
      return this.k instanceof akj $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof akj;
   }

   public ehe k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public ec.a m() {
      return this.m;
   }

   public dq n() {
      return this.o;
   }

   public ash o() {
      return this.p;
   }

   public IntConsumer p() {
      return this.q;
   }

   public boolean a(akj $$0) {
      akj $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.W() || $$0.W();
   }

   public void a(ts $$0, boolean $$1, ta.a $$2) {
      if (!this.j) {
         akj $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(te $$0) {
      if (!this.j) {
         akj $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<te> $$0, boolean $$1) {
      boolean $$2 = this.c.f_() && !this.j;
      boolean $$3 = $$1 && this.c.N_() && !this.j;
      if ($$2 || $$3) {
         te $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(te $$0) {
      te $$1 = te.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aI().b(cpg.o)) {
         for (akj $$2 : this.i.ac().t()) {
            if ($$2 != this.c && this.i.ac().g($$2.fP())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aI().b(cpg.l)) {
         this.i.a($$1);
      }
   }

   public void b(te $$0) {
      if (this.c.q_() && !this.j) {
         this.c.a(te.h().b($$0).a(n.m));
      }
   }

   public void a(CommandContext<ds> $$0, boolean $$1, int $$2) {
      if (this.l != null) {
         this.l.onCommandComplete($$0, $$1, $$2);
      }
   }

   @Override
   public Collection<String> q() {
      return Lists.newArrayList(this.i.J());
   }

   @Override
   public Collection<String> r() {
      return this.i.aF().f();
   }

   @Override
   public Stream<aep> s() {
      return jc.c.s().map(aot::a);
   }

   @Override
   public Stream<aep> t() {
      return this.i.aE().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(aeo<? extends hs<?>> $$0, dv.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<aeo<cpk>> u() {
      return this.i.E();
   }

   @Override
   public ht v() {
      return this.i.aV();
   }

   @Override
   public cdt w() {
      return this.e.G();
   }
}
