import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bop<E extends blx> extends bnm<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final biw p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bop.a> h = Lists.newArrayList();
   protected Optional<elb> i = Optional.empty();
   @Nullable
   protected elb j;
   protected int k;
   protected long l;
   private final Function<E, arb> q;
   private final BiPredicate<E, hv> r;

   public bop(biw $$0, int $$1, int $$2, float $$3, Function<E, arb> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bop::a);
   }

   public static <E extends blx> boolean a(E $$0, hv $$1) {
      csy $$2 = $$0.dM();
      hv $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(eet.a($$2, $$1.j())) == 0.0F;
   }

   public bop(biw $$0, int $$1, int $$2, float $$3, Function<E, arb> $$4, BiPredicate<E, hv> $$5) {
      super(ImmutableMap.of(bux.n, buy.c, bux.R, buy.b, bux.S, buy.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(amp $$0, blx $$1) {
      boolean $$2 = $$1.aC() && !$$1.aZ() && !$$1.bn() && !$$0.a_($$1.dm()).a(cwb.pg);
      if (!$$2) {
         $$1.dO().a(bux.R, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(amp $$0, blx $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dk()) && this.k > 0 && !$$1.bc() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dO().c(bux.S).isEmpty()) {
         $$1.dO().a(bux.R, this.p.a($$0.z) / 2);
         $$1.dO().b(bux.n);
      }

      return $$3;
   }

   protected void a(amp $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dk());
      hv $$3 = $$1.dm();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = hv.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bop.a($$1x.i(), aty.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(amp $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aU);
            $$1.p(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fa();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dO().a(bux.S, true);
            $$0.a(null, $$1, this.q.apply($$1), ard.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(amp $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bop.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bop.a $$4 = $$3.get();
            hv $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               elb $$6 = elb.b($$5);
               elb $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dO().a(bux.n, new bnp($$5));
                  bvf $$8 = $$1.N();
                  eeo $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bop.a> a(amp $$0) {
      Optional<bop.a> $$1 = bhy.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(amp $$0, E $$1, hv $$2) {
      hv $$3 = $$1.dm();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected elb a(blx $$0, elb $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);

      for (int $$3 : $$2) {
         Optional<elb> $$4 = boq.a($$0, $$1, this.g, $$3, true);
         if ($$4.isPresent()) {
            return $$4.get();
         }
      }

      return null;
   }

   public static class a extends bhx.a {
      private final hv a;

      public a(hv $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public hv b() {
         return this.a;
      }
   }
}
