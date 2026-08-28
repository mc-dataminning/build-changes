import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bwu extends bwf<cnk> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cnn, ald<etq>> g = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cnn.c, eth.ar);
      $$0.put(cnn.d, eth.as);
      $$0.put(cnn.e, eth.at);
      $$0.put(cnn.f, eth.au);
      $$0.put(cnn.g, eth.av);
      $$0.put(cnn.h, eth.aw);
      $$0.put(cnn.i, eth.ax);
      $$0.put(cnn.j, eth.ay);
      $$0.put(cnn.k, eth.az);
      $$0.put(cnn.l, eth.aA);
      $$0.put(cnn.n, eth.aB);
      $$0.put(cnn.o, eth.aC);
      $$0.put(cnn.p, eth.aD);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bwu(int $$0) {
      super(ImmutableMap.of(cdq.m, cdr.c, cdq.n, cdr.c, cdq.q, cdr.c, cdq.k, cdr.a), $$0);
   }

   protected boolean a(arj $$0, cnk $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arj $$0, cnk $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cnx $$3 = this.c($$1).get();
      $$1.dY().a(cdq.q, $$3);
      bwh.a($$1, $$3);
   }

   protected boolean b(arj $$0, cnk $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      cnx $$3 = this.c($$1).get();
      bwh.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bun)$$3);
            this.j = true;
         }
      } else {
         bwh.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arj $$0, cnk $$1, long $$2) {
      this.i = a($$0);
      $$1.dY().b(cdq.q);
      $$1.dY().b(cdq.m);
      $$1.dY().b(cdq.n);
   }

   private void a(cnk $$0, bun $$1) {
      for (cvs $$3 : this.a($$0)) {
         bwh.a($$0, $$3, $$1.dq());
      }
   }

   private List<cvs> a(cnk $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cvs(cvw.dl));
      } else {
         cnn $$1 = $$0.gy().b();
         if (g.containsKey($$1)) {
            etq $$2 = $$0.dS().o().bd().b(g.get($$1));
            eto $$3 = new eto.a((arj)$$0.dS()).a(ewh.f, $$0.dq()).a(ewh.a, $$0).a(ewg.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cvs(cvw.pw));
         }
      }
   }

   private boolean b(cnk $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cnx> c(cnk $$0) {
      return $$0.dY().c(cdq.k).filter(this::a);
   }

   private boolean a(cnx $$0) {
      return $$0.b(bta.F);
   }

   private boolean a(cnk $$0, cnx $$1) {
      jf $$2 = $$1.ds();
      jf $$3 = $$0.ds();
      return $$3.a($$2, 5.0);
   }

   private static int a(arj $$0) {
      return 600 + $$0.z.a(6001);
   }
}
