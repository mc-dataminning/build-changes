import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bwk<E extends btp> extends bvh<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bqc p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<bwk.a> h = Lists.newArrayList();
   protected Optional<exc> i = Optional.empty();
   @Nullable
   protected exc j;
   protected int k;
   protected long l;
   private final Function<E, avo> q;
   private final BiPredicate<E, jd> r;

   public bwk(bqc $$0, int $$1, int $$2, float $$3, Function<E, avo> $$4) {
      this($$0, $$1, $$2, $$3, $$4, bwk::a);
   }

   public static <E extends btp> boolean a(E $$0, jd $$1) {
      dcw $$2 = $$0.dO();
      jd $$3 = $$1.e();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(eqa.b($$0, $$1)) == 0.0F;
   }

   public bwk(bqc $$0, int $$1, int $$2, float $$3, Function<E, avo> $$4, BiPredicate<E, jd> $$5) {
      super(ImmutableMap.of(ccs.n, cct.c, ccs.S, cct.b, ccs.T, cct.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aqu $$0, btp $$1) {
      boolean $$2 = $$1.aF() && !$$1.bf() && !$$1.bt() && !$$0.a_($$1.do()).a(dga.pg);
      if (!$$2) {
         $$1.dT().a(ccs.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(aqu $$0, btp $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dm()) && this.k > 0 && !$$1.bi() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dT().c(ccs.T).isEmpty()) {
         $$1.dT().a(ccs.S, this.p.a($$0.z) / 2);
         $$1.dT().b(ccs.n);
      }

      return $$3;
   }

   protected void a(aqu $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dm());
      jd $$3 = $$1.do();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = jd.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new bwk.a($$1x.j(), ayo.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aqu $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.t($$1.aY);
            $$1.r(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fe();
            $$1.i(this.j.a($$4 / $$3));
            $$1.dT().a(ccs.T, true);
            $$0.a(null, $$1, this.q.apply($$1), avq.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aqu $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<bwk.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            bwk.a $$4 = $$3.get();
            jd $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               exc $$6 = exc.b($$5);
               exc $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dT().a(ccs.n, new bvk($$5));
                  cda $$8 = $$1.N();
                  eps $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<bwk.a> a(aqu $$0) {
      Optional<bwk.a> $$1 = bpe.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aqu $$0, E $$1, jd $$2) {
      jd $$3 = $$1.do();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected exc a(btp $$0, exc $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(buw.o) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<exc> $$5 = bwl.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bpd.a {
      private final jd a;

      public a(jd $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public jd b() {
         return this.a;
      }
   }
}
