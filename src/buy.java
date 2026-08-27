import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class buy extends buj<cll> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<clo, akm<epm>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(clo.c, epf.aF);
      $$0.put(clo.d, epf.aG);
      $$0.put(clo.e, epf.aH);
      $$0.put(clo.f, epf.aI);
      $$0.put(clo.g, epf.aJ);
      $$0.put(clo.h, epf.aK);
      $$0.put(clo.i, epf.aL);
      $$0.put(clo.j, epf.aM);
      $$0.put(clo.k, epf.aN);
      $$0.put(clo.l, epf.aO);
      $$0.put(clo.n, epf.aP);
      $$0.put(clo.o, epf.aQ);
      $$0.put(clo.p, epf.aR);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public buy(int $$0) {
      super(ImmutableMap.of(cbu.m, cbv.c, cbu.n, cbv.c, cbu.q, cbv.c, cbu.k, cbv.a), $$0);
   }

   protected boolean a(aqn $$0, cll $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqn $$0, cll $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cly $$3 = this.c($$1).get();
      $$1.dS().a(cbu.q, $$3);
      bul.a($$1, $$3);
   }

   protected boolean b(aqn $$0, cll $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      cly $$3 = this.c($$1).get();
      bul.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bsq)$$3);
            this.j = true;
         }
      } else {
         bul.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqn $$0, cll $$1, long $$2) {
      this.i = a($$0);
      $$1.dS().b(cbu.q);
      $$1.dS().b(cbu.m);
      $$1.dS().b(cbu.n);
   }

   private void a(cll $$0, bsq $$1) {
      for (ctq $$3 : this.a($$0)) {
         bul.a($$0, $$3, $$1.dn());
      }
   }

   private List<ctq> a(cll $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new ctq(ctt.dl));
      } else {
         clo $$1 = $$0.gA().b();
         if (g.containsKey($$1)) {
            epm $$2 = $$0.dP().o().be().b(g.get($$1));
            epk $$3 = new epk.a((aqn)$$0.dP()).a(erz.f, $$0.dn()).a(erz.a, $$0).a(ery.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new ctq(ctt.pv));
         }
      }
   }

   private boolean b(cll $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cly> c(cll $$0) {
      return $$0.dS().c(cbu.k).filter(this::a);
   }

   private boolean a(cly $$0) {
      return $$0.b(brg.F);
   }

   private boolean a(cll $$0, cly $$1) {
      io $$2 = $$1.dp();
      io $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqn $$0) {
      return 600 + $$0.z.a(6001);
   }
}
