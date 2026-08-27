import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsj<E extends bpq> extends brg<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bmn p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bsj.a> h = Lists.newArrayList();
   protected Optional<epr> i = Optional.empty();
   @Nullable
   protected epr j;
   protected int k;
   protected long l;
   private final Function<E, atx> q;
   private final BiPredicate<E, ib> r;

   public bsj(bmn $$0, int $$1, int $$2, float $$3, Function<E, atx> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bsj::a);
   }

   public static <E extends bpq> boolean a(E $$0, ib $$1) {
      cwz $$2 = $$0.dM();
      ib $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(ejh.a($$2, $$1.j())) == 0.0F;
   }

   public bsj(bmn $$0, int $$1, int $$2, float $$3, Function<E, atx> $$4, BiPredicate<E, ib> $$5) {
      super(ImmutableMap.of(byr.n, bys.c, byr.S, bys.b, byr.T, bys.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(apf $$0, bpq $$1) {
      boolean $$2 = $$1.aC() && !$$1.bc() && !$$1.bq() && !$$0.a_($$1.dm()).a(dac.pg);
      if (!$$2) {
         $$1.dP().a(byr.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(apf $$0, bpq $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dk()) && this.k > 0 && !$$1.bf() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dP().c(byr.T).isEmpty()) {
         $$1.dP().a(byr.S, this.p.a($$0.z) / 2);
         $$1.dP().b(byr.n);
      }

      return $$3;
   }

   protected void a(apf $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dk());
      ib $$3 = $$1.dm();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = ib.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bsj.a($$1x.i(), aww.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(apf $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aX);
            $$1.p(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.ff();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dP().a(byr.T, true);
            $$0.a(null, $$1, this.q.apply($$1), atz.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(apf $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bsj.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bsj.a $$4 = $$3.get();
            ib $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               epr $$6 = epr.b($$5);
               epr $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dP().a(byr.n, new brj($$5));
                  byz $$8 = $$1.K();
                  ejc $$9 = $$8.a($$5, 0, 8);
                  if ($$9 == null || !$$9.j()) {
                     this.j = $$7;
                     this.l = $$2;
                     return;
                  }
               }
            }
         }
      }
   }

   protected Optional<bsj.a> a(apf $$0) {
      Optional<bsj.a> $$1 = blp.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(apf $$0, E $$1, ib $$2) {
      ib $$3 = $$1.dm();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected epr a(bpq $$0, epr $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(bqv.m) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<epr> $$5 = bsk.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends blo.a {
      private final ib a;

      public a(ib $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public ib b() {
         return this.a;
      }
   }
}
