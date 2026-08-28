import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bwr extends bwc<cnh> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cnk, alb<etm>> g = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cnk.c, etd.at);
      $$0.put(cnk.d, etd.au);
      $$0.put(cnk.e, etd.av);
      $$0.put(cnk.f, etd.aw);
      $$0.put(cnk.g, etd.ax);
      $$0.put(cnk.h, etd.ay);
      $$0.put(cnk.i, etd.az);
      $$0.put(cnk.j, etd.aA);
      $$0.put(cnk.k, etd.aB);
      $$0.put(cnk.l, etd.aC);
      $$0.put(cnk.n, etd.aD);
      $$0.put(cnk.o, etd.aE);
      $$0.put(cnk.p, etd.aF);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bwr(int $$0) {
      super(ImmutableMap.of(cdn.m, cdo.c, cdn.n, cdo.c, cdn.q, cdo.c, cdn.k, cdo.a), $$0);
   }

   protected boolean a(arh $$0, cnh $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arh $$0, cnh $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cnu $$3 = this.c($$1).get();
      $$1.dX().a(cdn.q, $$3);
      bwe.a($$1, $$3);
   }

   protected boolean b(arh $$0, cnh $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      cnu $$3 = this.c($$1).get();
      bwe.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (buk)$$3);
            this.j = true;
         }
      } else {
         bwe.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arh $$0, cnh $$1, long $$2) {
      this.i = a($$0);
      $$1.dX().b(cdn.q);
      $$1.dX().b(cdn.m);
      $$1.dX().b(cdn.n);
   }

   private void a(cnh $$0, buk $$1) {
      for (cvp $$3 : this.a($$0)) {
         bwe.a($$0, $$3, $$1.dq());
      }
   }

   private List<cvp> a(cnh $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cvp(cvt.dl));
      } else {
         cnk $$1 = $$0.gz().b();
         if (g.containsKey($$1)) {
            etm $$2 = $$0.dS().o().bd().b(g.get($$1));
            etk $$3 = new etk.a((arh)$$0.dS()).a(ewd.f, $$0.dq()).a(ewd.a, $$0).a(ewc.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cvp(cvt.pw));
         }
      }
   }

   private boolean b(cnh $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cnu> c(cnh $$0) {
      return $$0.dX().c(cdn.k).filter(this::a);
   }

   private boolean a(cnu $$0) {
      return $$0.b(bsx.F);
   }

   private boolean a(cnh $$0, cnu $$1) {
      je $$2 = $$1.ds();
      je $$3 = $$0.ds();
      return $$3.a($$2, 5.0);
   }

   private static int a(arh $$0) {
      return 600 + $$0.z.a(6001);
   }
}
