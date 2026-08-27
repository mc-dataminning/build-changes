import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class btz<E extends brg> extends bsw<E> {
   protected static final int c = 20;
   private static final int m = 40;
   protected static final int d = 8;
   private static final int n = 200;
   private static final List<Integer> o = Lists.newArrayList(new Integer[]{65, 70, 75, 80});
   private final bob p;
   protected final int e;
   protected final int f;
   protected final float g;
   protected List<btz.a> h = Lists.newArrayList();
   protected Optional<etf> i = Optional.empty();
   @Nullable
   protected etf j;
   protected int k;
   protected long l;
   private final Function<E, auy> q;
   private final BiPredicate<E, im> r;

   public btz(bob $$0, int $$1, int $$2, float $$3, Function<E, auy> $$4) {
      this($$0, $$1, $$2, $$3, $$4, btz::a);
   }

   public static <E extends brg> boolean a(E $$0, im $$1) {
      czu $$2 = $$0.dN();
      im $$3 = $$1.d();
      return $$2.a_($$3).i($$2, $$3) && $$0.a(emn.b($$0, $$1)) == 0.0F;
   }

   public btz(bob $$0, int $$1, int $$2, float $$3, Function<E, auy> $$4, BiPredicate<E, im> $$5) {
      super(ImmutableMap.of(cah.n, cai.c, cah.S, cai.b, cah.T, cai.b), 200);
      this.p = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.q = $$4;
      this.r = $$5;
   }

   protected boolean a(aqe $$0, brg $$1) {
      boolean $$2 = $$1.aC() && !$$1.bc() && !$$1.bq() && !$$0.a_($$1.dn()).a(dcx.pg);
      if (!$$2) {
         $$1.dQ().a(cah.S, this.p.a($$0.z) / 2);
      }

      return $$2;
   }

   protected boolean b(aqe $$0, brg $$1, long $$2) {
      boolean $$3 = this.i.isPresent() && this.i.get().equals($$1.dl()) && this.k > 0 && !$$1.bf() && (this.j != null || !this.h.isEmpty());
      if (!$$3 && $$1.dQ().c(cah.T).isEmpty()) {
         $$1.dQ().a(cah.S, this.p.a($$0.z) / 2);
         $$1.dQ().b(cah.n);
      }

      return $$3;
   }

   protected void a(aqe $$0, E $$1, long $$2) {
      this.j = null;
      this.k = 20;
      this.i = Optional.of($$1.dl());
      im $$3 = $$1.dn();
      int $$4 = $$3.u();
      int $$5 = $$3.v();
      int $$6 = $$3.w();
      this.h = im.a($$4 - this.f, $$5 - this.e, $$6 - this.f, $$4 + this.f, $$5 + this.e, $$6 + this.f)
         .filter($$1x -> !$$1x.equals($$3))
         .map($$1x -> new btz.a($$1x.i(), axw.c($$3.j($$1x))))
         .collect(Collectors.toCollection(Lists::newArrayList));
   }

   protected void c(aqe $$0, E $$1, long $$2) {
      if (this.j != null) {
         if ($$2 - this.l >= 40L) {
            $$1.r($$1.aZ);
            $$1.q(true);
            double $$3 = this.j.f();
            double $$4 = $$3 + (double)$$1.fg();
            $$1.g(this.j.a($$4 / $$3));
            $$1.dQ().a(cah.T, true);
            $$0.a(null, $$1, this.q.apply($$1), ava.g, 1.0F, 1.0F);
         }
      } else {
         this.k--;
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(aqe $$0, E $$1, long $$2) {
      while (!this.h.isEmpty()) {
         Optional<btz.a> $$3 = this.a($$0);
         if (!$$3.isEmpty()) {
            btz.a $$4 = $$3.get();
            im $$5 = $$4.b();
            if (this.a($$0, $$1, $$5)) {
               etf $$6 = etf.b($$5);
               etf $$7 = this.a($$1, $$6);
               if ($$7 != null) {
                  $$1.dQ().a(cah.n, new bsz($$5));
                  cap $$8 = $$1.K();
                  emf $$9 = $$8.a($$5, 0, 8);
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

   protected Optional<btz.a> a(aqe $$0) {
      Optional<btz.a> $$1 = bnd.a($$0.z, this.h);
      $$1.ifPresent(this.h::remove);
      return $$1;
   }

   private boolean a(aqe $$0, E $$1, im $$2) {
      im $$3 = $$1.dn();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      return $$4 == $$2.u() && $$5 == $$2.w() ? false : this.r.test($$1, $$2);
   }

   @Nullable
   protected etf a(brg $$0, etf $$1) {
      List<Integer> $$2 = Lists.newArrayList(o);
      Collections.shuffle($$2);
      float $$3 = (float)($$0.g(bsl.m) * (double)this.g);

      for (int $$4 : $$2) {
         Optional<etf> $$5 = bua.a($$0, $$1, $$3, $$4, true);
         if ($$5.isPresent()) {
            return $$5.get();
         }
      }

      return null;
   }

   public static class a extends bnc.a {
      private final im a;

      public a(im $$0, int $$1) {
         super($$1);
         this.a = $$0;
      }

      public im b() {
         return this.a;
      }
   }
}
