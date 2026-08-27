import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bnr extends bnc<cdm> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cdp, agm> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cdp.c, efa.an);
      $$0.put(cdp.d, efa.ao);
      $$0.put(cdp.e, efa.ap);
      $$0.put(cdp.f, efa.aq);
      $$0.put(cdp.g, efa.ar);
      $$0.put(cdp.h, efa.as);
      $$0.put(cdp.i, efa.at);
      $$0.put(cdp.j, efa.au);
      $$0.put(cdp.k, efa.av);
      $$0.put(cdp.l, efa.aw);
      $$0.put(cdp.n, efa.ax);
      $$0.put(cdp.o, efa.ay);
      $$0.put(cdp.p, efa.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bnr(int $$0) {
      super(ImmutableMap.of(bum.m, bun.c, bum.n, bun.c, bum.q, bun.c, bum.k, bun.a), $$0);
   }

   protected boolean a(ami $$0, cdm $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ami $$0, cdm $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cdz $$3 = this.c($$1).get();
      $$1.dP().a(bum.q, $$3);
      bne.a($$1, $$3);
   }

   protected boolean b(ami $$0, cdm $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ami $$0, cdm $$1, long $$2) {
      cdz $$3 = this.c($$1).get();
      bne.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bll)$$3);
            this.j = true;
         }
      } else {
         bne.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ami $$0, cdm $$1, long $$2) {
      this.i = a($$0);
      $$1.dP().b(bum.q);
      $$1.dP().b(bum.m);
      $$1.dP().b(bum.n);
   }

   private void a(cdm $$0, bll $$1) {
      for (clo $$3 : this.a($$0)) {
         bne.a($$0, $$3, $$1.dl());
      }
   }

   private List<clo> a(cdm $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new clo(clr.dk));
      } else {
         cdp $$1 = $$0.gq().b();
         if (g.containsKey($$1)) {
            efk $$2 = $$0.dN().n().aJ().getLootTable(g.get($$1));
            efi $$3 = new efi.a((ami)$$0.dN()).a(ehn.f, $$0.dl()).a(ehn.a, $$0).a(ehm.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new clo(clr.ps));
         }
      }
   }

   private boolean b(cdm $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cdz> c(cdm $$0) {
      return $$0.dP().c(bum.k).filter(this::a);
   }

   private boolean a(cdz $$0) {
      return $$0.a(bkk.F);
   }

   private boolean a(cdm $$0, cdz $$1) {
      hx $$2 = $$1.dn();
      hx $$3 = $$0.dn();
      return $$3.a($$2, 5.0);
   }

   private static int a(ami $$0) {
      return 600 + $$0.z.a(6001);
   }
}
