import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bra extends bof<cfd> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cnb> e = ImmutableSet.of();

   public bra() {
      super(ImmutableMap.of(bvq.q, bvr.a, bvq.h, bvr.a));
   }

   protected boolean a(ane $$0, cfd $$1) {
      return boh.a($$1.dN(), bvq.q, bmc.bh);
   }

   protected boolean a(ane $$0, cfd $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ane $$0, cfd $$1, long $$2) {
      cfd $$3 = (cfd)$$1.dN().c(bvq.q).get();
      boh.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      cfd $$3 = (cfd)$$1.dN().c(bvq.q).get();
      if (!($$1.f($$3) > 5.0)) {
         boh.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gx() && ($$1.gq().b() == cfg.g || $$3.gy())) {
            a($$1, cfd.bX.keySet(), $$3);
         }

         if ($$3.gq().b() == cfg.g && $$1.A().a_(cnj.pv) > cnj.pv.k() / 2) {
            a($$1, ImmutableSet.of(cnj.pv), $$3);
         }

         if (!this.e.isEmpty() && $$1.A().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(ane $$0, cfd $$1, long $$2) {
      $$1.dN().b(bvq.q);
   }

   private static Set<cnb> a(cfd $$0, cfd $$1) {
      ImmutableSet<cnb> $$2 = $$1.gq().b().d();
      ImmutableSet<cnb> $$3 = $$0.gq().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cfd $$0, Set<cnb> $$1, bmo $$2) {
      bkl $$3 = $$0.A();
      cng $$4 = cng.f;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cng $$6;
         cnb $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.b()) {
               $$7 = $$6.d();
               if ($$1.contains($$7)) {
                  if ($$6.L() > $$6.g() / 2) {
                     $$8 = $$6.L() / 2;
                     break label28;
                  }

                  if ($$6.L() > 24) {
                     $$8 = $$6.L() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cng($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         boh.a($$0, $$4, $$2.dj());
      }
   }
}
