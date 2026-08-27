import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class blh extends bks<cbc> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cbf, aeu> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbf.c, ecj.an);
      $$0.put(cbf.d, ecj.ao);
      $$0.put(cbf.e, ecj.ap);
      $$0.put(cbf.f, ecj.aq);
      $$0.put(cbf.g, ecj.ar);
      $$0.put(cbf.h, ecj.as);
      $$0.put(cbf.i, ecj.at);
      $$0.put(cbf.j, ecj.au);
      $$0.put(cbf.k, ecj.av);
      $$0.put(cbf.l, ecj.aw);
      $$0.put(cbf.n, ecj.ax);
      $$0.put(cbf.o, ecj.ay);
      $$0.put(cbf.p, ecj.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public blh(int $$0) {
      super(ImmutableMap.of(bsc.m, bsd.c, bsc.n, bsd.c, bsc.q, bsd.c, bsc.k, bsd.a), $$0);
   }

   protected boolean a(akn $$0, cbc $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(akn $$0, cbc $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cbp $$3 = this.c($$1).get();
      $$1.dM().a(bsc.q, $$3);
      bku.a($$1, $$3);
   }

   protected boolean b(akn $$0, cbc $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      cbp $$3 = this.c($$1).get();
      bku.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bjb)$$3);
            this.j = true;
         }
      } else {
         bku.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(akn $$0, cbc $$1, long $$2) {
      this.i = a($$0);
      $$1.dM().b(bsc.q);
      $$1.dM().b(bsc.m);
      $$1.dM().b(bsc.n);
   }

   private void a(cbc $$0, bjb $$1) {
      for (cja $$3 : this.a($$0)) {
         bku.a($$0, $$3, $$1.di());
      }
   }

   private List<cja> a(cbc $$0) {
      if ($$0.i_()) {
         return ImmutableList.of(new cja(cjd.cP));
      } else {
         cbf $$1 = $$0.gl().b();
         if (g.containsKey($$1)) {
            ect $$2 = $$0.dK().n().aH().getLootTable(g.get($$1));
            ecr $$3 = new ecr.a((akn)$$0.dK()).a(eew.f, $$0.di()).a(eew.a, $$0).a(eev.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cja(cjd.oH));
         }
      }
   }

   private boolean b(cbc $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cbp> c(cbc $$0) {
      return $$0.dM().c(bsc.k).filter(this::a);
   }

   private boolean a(cbp $$0) {
      return $$0.a(bia.F);
   }

   private boolean a(cbc $$0, cbp $$1) {
      gw $$2 = $$1.dk();
      gw $$3 = $$0.dk();
      return $$3.a($$2, 5.0);
   }

   private static int a(akn $$0) {
      return 600 + $$0.z.a(6001);
   }
}
