import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class buv extends bug<cll> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<clo, aks<eru>> g = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(clo.c, ern.aT);
      $$0.put(clo.d, ern.aU);
      $$0.put(clo.e, ern.aV);
      $$0.put(clo.f, ern.aW);
      $$0.put(clo.g, ern.aX);
      $$0.put(clo.h, ern.aY);
      $$0.put(clo.i, ern.aZ);
      $$0.put(clo.j, ern.ba);
      $$0.put(clo.k, ern.bb);
      $$0.put(clo.l, ern.bc);
      $$0.put(clo.n, ern.bd);
      $$0.put(clo.o, ern.be);
      $$0.put(clo.p, ern.bf);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public buv(int $$0) {
      super(ImmutableMap.of(cbr.m, cbs.c, cbr.n, cbs.c, cbr.q, cbs.c, cbr.k, cbs.a), $$0);
   }

   protected boolean a(aqt $$0, cll $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqt $$0, cll $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cly $$3 = this.c($$1).get();
      $$1.dZ().a(cbr.q, $$3);
      bui.a($$1, $$3);
   }

   protected boolean b(aqt $$0, cll $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      cly $$3 = this.c($$1).get();
      bui.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bso)$$3);
            this.j = true;
         }
      } else {
         bui.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqt $$0, cll $$1, long $$2) {
      this.i = a($$0);
      $$1.dZ().b(cbr.q);
      $$1.dZ().b(cbr.m);
      $$1.dZ().b(cbr.n);
   }

   private void a(cll $$0, bso $$1) {
      for (cuh $$3 : this.a($$0)) {
         bui.a($$0, $$3, $$1.ds());
      }
   }

   private List<cuh> a(cll $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cuh(cuk.es));
      } else {
         clo $$1 = $$0.gL().b();
         if (g.containsKey($$1)) {
            eru $$2 = $$0.dU().o().be().b(g.get($$1));
            ers $$3 = new ers.a((aqt)$$0.dU()).a(eug.f, $$0.ds()).a(eug.a, $$0).a(euf.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cuh(cuk.qO));
         }
      }
   }

   private boolean b(cll $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cly> c(cll $$0) {
      return $$0.dZ().c(cbr.k).filter(this::a);
   }

   private boolean a(cly $$0) {
      return $$0.b(brj.F);
   }

   private boolean a(cll $$0, cly $$1) {
      ir $$2 = $$1.du();
      ir $$3 = $$0.du();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqt $$0) {
      return 600 + $$0.A.a(6001);
   }
}
