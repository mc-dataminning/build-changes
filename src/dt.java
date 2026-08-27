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

public class dt implements dw {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tn.c("permissions.requires.player"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tn.c("permissions.requires.entity"));
   private final ds c;
   private final ehp d;
   private final aks e;
   private final int f;
   private final String g;
   private final tn h;
   private final MinecraftServer i;
   private final boolean j;
   @Nullable
   private final bis k;
   @Nullable
   private final ResultConsumer<dt> l;
   private final ed.a m;
   private final eho n;
   private final dr o;
   private final ast p;
   private final IntConsumer q;

   public dt(ds $$0, ehp $$1, eho $$2, aks $$3, int $$4, String $$5, tn $$6, MinecraftServer $$7, @Nullable bis $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, ($$0x, $$1x, $$2x) -> {
      }, ed.a.a, dr.a, ast.immediate($$7), $$0x -> {
      });
   }

   protected dt(
      ds $$0,
      ehp $$1,
      eho $$2,
      aks $$3,
      int $$4,
      String $$5,
      tn $$6,
      MinecraftServer $$7,
      @Nullable bis $$8,
      boolean $$9,
      @Nullable ResultConsumer<dt> $$10,
      ed.a $$11,
      dr $$12,
      ast $$13,
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

   public dt a(ds $$0) {
      return this.c == $$0 ? this : new dt($$0, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public dt a(bis $$0) {
      return this.k == $$0
         ? this
         : new dt(this.c, this.d, this.n, this.e, this.f, $$0.ab().getString(), $$0.N_(), this.i, $$0, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public dt a(ehp $$0) {
      return this.d.equals($$0)
         ? this
         : new dt(this.c, $$0, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public dt a(eho $$0) {
      return this.n.c($$0) ? this : new dt(this.c, this.d, $$0, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public dt a(ResultConsumer<dt> $$0) {
      return Objects.equals(this.l, $$0)
         ? this
         : new dt(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, $$0, this.m, this.o, this.p, this.q);
   }

   public dt a(ResultConsumer<dt> $$0, BinaryOperator<ResultConsumer<dt>> $$1) {
      ResultConsumer<dt> $$2 = $$1.apply(this.l, $$0);
      return this.a($$2);
   }

   public dt a() {
      return !this.j && !this.c.k_()
         ? new dt(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m, this.o, this.p, this.q)
         : this;
   }

   public dt a(int $$0) {
      return $$0 == this.f ? this : new dt(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public dt b(int $$0) {
      return $$0 <= this.f ? this : new dt(this.c, this.d, this.n, this.e, $$0, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
   }

   public dt a(ed.a $$0) {
      return $$0 == this.m ? this : new dt(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, $$0, this.o, this.p, this.q);
   }

   public dt a(aks $$0) {
      if ($$0 == this.e) {
         return this;
      } else {
         double $$1 = diu.a(this.e.C_(), $$0.C_());
         ehp $$2 = new ehp(this.d.c * $$1, this.d.d, this.d.e * $$1);
         return new dt(this.c, $$2, this.n, $$0, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, this.q);
      }
   }

   public dt a(bis $$0, ed.a $$1) {
      return this.b($$1.a($$0));
   }

   public dt b(ehp $$0) {
      ehp $$1 = this.m.a(this);
      double $$2 = $$0.c - $$1.c;
      double $$3 = $$0.d - $$1.d;
      double $$4 = $$0.e - $$1.e;
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4);
      float $$6 = ary.g((float)(-(ary.d($$3, $$5) * 180.0F / (float)Math.PI)));
      float $$7 = ary.g((float)(ary.d($$4, $$2) * 180.0F / (float)Math.PI) - 90.0F);
      return this.a(new eho($$6, $$7));
   }

   public dt a(dr $$0, ast $$1) {
      return $$0 == this.o && $$1 == this.p
         ? this
         : new dt(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, $$0, $$1, this.q);
   }

   public dt a(IntConsumer $$0) {
      return $$0 == this.q ? this : new dt(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m, this.o, this.p, $$0);
   }

   public tn b() {
      return this.h;
   }

   public String c() {
      return this.g;
   }

   @Override
   public boolean c(int $$0) {
      return this.f >= $$0;
   }

   public ehp d() {
      return this.d;
   }

   public aks e() {
      return this.e;
   }

   @Nullable
   public bis f() {
      return this.k;
   }

   public bis g() throws CommandSyntaxException {
      if (this.k == null) {
         throw b.create();
      } else {
         return this.k;
      }
   }

   public akt h() throws CommandSyntaxException {
      bis var2 = this.k;
      if (var2 instanceof akt) {
         return (akt)var2;
      } else {
         throw a.create();
      }
   }

   @Nullable
   public akt i() {
      return this.k instanceof akt $$0 ? $$0 : null;
   }

   public boolean j() {
      return this.k instanceof akt;
   }

   public eho k() {
      return this.n;
   }

   public MinecraftServer l() {
      return this.i;
   }

   public ed.a m() {
      return this.m;
   }

   public dr n() {
      return this.o;
   }

   public ast o() {
      return this.p;
   }

   public IntConsumer p() {
      return this.q;
   }

   public boolean a(akt $$0) {
      akt $$1 = this.i();
      return $$0 == $$1 ? false : $$1 != null && $$1.W() || $$0.W();
   }

   public void a(ub $$0, boolean $$1, tj.a $$2) {
      if (!this.j) {
         akt $$3 = this.i();
         if ($$3 != null) {
            $$3.a($$0, $$1, $$2);
         } else {
            this.c.a($$2.a($$0.a()));
         }
      }
   }

   public void a(tn $$0) {
      if (!this.j) {
         akt $$1 = this.i();
         if ($$1 != null) {
            $$1.a($$0);
         } else {
            this.c.a($$0);
         }
      }
   }

   public void a(Supplier<tn> $$0, boolean $$1) {
      boolean $$2 = this.c.j_() && !this.j;
      boolean $$3 = $$1 && this.c.T_() && !this.j;
      if ($$2 || $$3) {
         tn $$4 = $$0.get();
         if ($$2) {
            this.c.a($$4);
         }

         if ($$3) {
            this.c($$4);
         }
      }
   }

   private void c(tn $$0) {
      tn $$1 = tn.a("chat.type.admin", this.b(), $$0).a(n.h, n.u);
      if (this.i.aI().b(cpt.o)) {
         for (akt $$2 : this.i.ac().t()) {
            if ($$2 != this.c && this.i.ac().f($$2.fQ())) {
               $$2.a($$1);
            }
         }
      }

      if (this.c != this.i && this.i.aI().b(cpt.l)) {
         this.i.a($$1);
      }
   }

   public void b(tn $$0) {
      if (this.c.v_() && !this.j) {
         this.c.a(tn.h().b($$0).a(n.m));
      }
   }

   public void a(CommandContext<dt> $$0, boolean $$1, int $$2) {
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
   public Stream<aey> s() {
      return jd.c.s().map(ape::a);
   }

   @Override
   public Stream<aey> t() {
      return this.i.aE().d();
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      return Suggestions.empty();
   }

   @Override
   public CompletableFuture<Suggestions> a(aex<? extends ht<?>> $$0, dw.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(Suggestions::empty);
   }

   @Override
   public Set<aex<cpx>> u() {
      return this.i.E();
   }

   @Override
   public hu v() {
      return this.i.aU();
   }

   @Override
   public cee w() {
      return this.e.G();
   }
}
