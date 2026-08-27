import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bou extends bma<cck> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cke> e = ImmutableSet.of();

   public bou() {
      super(ImmutableMap.of(btk.q, btl.a, btk.h, btl.a));
   }

   protected boolean a(alq $$0, cck $$1) {
      return bmc.a($$1.dN(), btk.q, bjx.bf);
   }

   protected boolean a(alq $$0, cck $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(alq $$0, cck $$1, long $$2) {
      cck $$3 = (cck)$$1.dN().c(btk.q).get();
      bmc.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(alq $$0, cck $$1, long $$2) {
      cck $$3 = (cck)$$1.dN().c(btk.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bmc.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gw() && ($$1.gp().b() == ccn.g || $$3.gx())) {
            a($$1, cck.bW.keySet(), $$3);
         }

         if ($$3.gp().b() == ccn.g && $$1.y().a_(ckm.oI) > ckm.oI.l() / 2) {
            a($$1, ImmutableSet.of(ckm.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.y().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(alq $$0, cck $$1, long $$2) {
      $$1.dN().b(btk.q);
   }

   private static Set<cke> a(cck $$0, cck $$1) {
      ImmutableSet<cke> $$2 = $$1.gp().b().d();
      ImmutableSet<cke> $$3 = $$0.gp().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cck $$0, Set<cke> $$1, bkj $$2) {
      bii $$3 = $$0.y();
      ckj $$4 = ckj.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         ckj $$6;
         cke $$7;
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
         $$4 = new ckj($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bmc.a($$0, $$4, $$2.dj());
      }
   }
}
