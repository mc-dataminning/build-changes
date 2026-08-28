import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvu extends bvf<cmi> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cml, akp<erq>> g = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cml.c, erh.aH);
      $$0.put(cml.d, erh.aI);
      $$0.put(cml.e, erh.aJ);
      $$0.put(cml.f, erh.aK);
      $$0.put(cml.g, erh.aL);
      $$0.put(cml.h, erh.aM);
      $$0.put(cml.i, erh.aN);
      $$0.put(cml.j, erh.aO);
      $$0.put(cml.k, erh.aP);
      $$0.put(cml.l, erh.aQ);
      $$0.put(cml.n, erh.aR);
      $$0.put(cml.o, erh.aS);
      $$0.put(cml.p, erh.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvu(int $$0) {
      super(ImmutableMap.of(ccq.m, ccr.c, ccq.n, ccr.c, ccq.q, ccr.c, ccq.k, ccr.a), $$0);
   }

   protected boolean a(aqt $$0, cmi $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqt $$0, cmi $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmv $$3 = this.c($$1).get();
      $$1.dU().a(ccq.q, $$3);
      bvh.a($$1, $$3);
   }

   protected boolean b(aqt $$0, cmi $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      cmv $$3 = this.c($$1).get();
      bvh.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btl)$$3);
            this.j = true;
         }
      } else {
         bvh.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqt $$0, cmi $$1, long $$2) {
      this.i = a($$0);
      $$1.dU().b(ccq.q);
      $$1.dU().b(ccq.m);
      $$1.dU().b(ccq.n);
   }

   private void a(cmi $$0, btl $$1) {
      for (cuo $$3 : this.a($$0)) {
         bvh.a($$0, $$3, $$1.do());
      }
   }

   private List<cuo> a(cmi $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cuo(cur.dl));
      } else {
         cml $$1 = $$0.gx().b();
         if (g.containsKey($$1)) {
            erq $$2 = $$0.dQ().o().be().b(g.get($$1));
            ero $$3 = new ero.a((aqt)$$0.dQ()).a(euh.f, $$0.do()).a(euh.a, $$0).a(eug.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cuo(cur.pv));
         }
      }
   }

   private boolean b(cmi $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmv> c(cmi $$0) {
      return $$0.dU().c(ccq.k).filter(this::a);
   }

   private boolean a(cmv $$0) {
      return $$0.b(bsa.F);
   }

   private boolean a(cmi $$0, cmv $$1) {
      jd $$2 = $$1.dq();
      jd $$3 = $$0.dq();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqt $$0) {
      return 600 + $$0.z.a(6001);
   }
}
