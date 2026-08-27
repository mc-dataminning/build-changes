import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class buw extends buh<clj> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<clm, akl<epk>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(clm.c, epd.aF);
      $$0.put(clm.d, epd.aG);
      $$0.put(clm.e, epd.aH);
      $$0.put(clm.f, epd.aI);
      $$0.put(clm.g, epd.aJ);
      $$0.put(clm.h, epd.aK);
      $$0.put(clm.i, epd.aL);
      $$0.put(clm.j, epd.aM);
      $$0.put(clm.k, epd.aN);
      $$0.put(clm.l, epd.aO);
      $$0.put(clm.n, epd.aP);
      $$0.put(clm.o, epd.aQ);
      $$0.put(clm.p, epd.aR);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public buw(int $$0) {
      super(ImmutableMap.of(cbs.m, cbt.c, cbs.n, cbt.c, cbs.q, cbt.c, cbs.k, cbt.a), $$0);
   }

   protected boolean a(aqm $$0, clj $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqm $$0, clj $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      clw $$3 = this.c($$1).get();
      $$1.dS().a(cbs.q, $$3);
      buj.a($$1, $$3);
   }

   protected boolean b(aqm $$0, clj $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      clw $$3 = this.c($$1).get();
      buj.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bso)$$3);
            this.j = true;
         }
      } else {
         buj.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqm $$0, clj $$1, long $$2) {
      this.i = a($$0);
      $$1.dS().b(cbs.q);
      $$1.dS().b(cbs.m);
      $$1.dS().b(cbs.n);
   }

   private void a(clj $$0, bso $$1) {
      for (cto $$3 : this.a($$0)) {
         buj.a($$0, $$3, $$1.dn());
      }
   }

   private List<cto> a(clj $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cto(ctr.dl));
      } else {
         clm $$1 = $$0.gA().b();
         if (g.containsKey($$1)) {
            epk $$2 = $$0.dP().o().be().b(g.get($$1));
            epi $$3 = new epi.a((aqm)$$0.dP()).a(erx.f, $$0.dn()).a(erx.a, $$0).a(erw.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cto(ctr.pv));
         }
      }
   }

   private boolean b(clj $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<clw> c(clj $$0) {
      return $$0.dS().c(cbs.k).filter(this::a);
   }

   private boolean a(clw $$0) {
      return $$0.b(bre.F);
   }

   private boolean a(clj $$0, clw $$1) {
      io $$2 = $$1.dp();
      io $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqm $$0) {
      return 600 + $$0.z.a(6001);
   }
}
