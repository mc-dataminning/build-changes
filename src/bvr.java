import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bvr extends bsw<cjy> {
   private Set<cry> c = ImmutableSet.of();

   public bvr() {
      super(ImmutableMap.of(cah.q, cai.a, cah.h, cai.a));
   }

   protected boolean a(aqe $$0, cjy $$1) {
      return bsy.a($$1.dQ(), cah.q, bqr.bi);
   }

   protected boolean a(aqe $$0, cjy $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqe $$0, cjy $$1, long $$2) {
      cjy $$3 = (cjy)$$1.dQ().c(cah.q).get();
      bsy.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      cjy $$3 = (cjy)$$1.dQ().c(cah.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bsy.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gH() && ($$1.gA().b() == ckb.g || $$3.gI())) {
            a($$1, cjy.cb.keySet(), $$3);
         }

         if ($$3.gA().b() == ckb.g && $$1.y().a_(csg.pw) > csg.pw.q() / 2) {
            a($$1, ImmutableSet.of(csg.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqe $$0, cjy $$1, long $$2) {
      $$1.dQ().b(cah.q);
   }

   private static Set<cry> a(cjy $$0, cjy $$1) {
      ImmutableSet<cry> $$2 = $$1.gA().b().d();
      ImmutableSet<cry> $$3 = $$0.gA().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cjy $$0, Set<cry> $$1, bre $$2) {
      boz $$3 = $$0.y();
      csd $$4 = csd.i;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         csd $$6;
         cry $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.d()) {
               $$7 = $$6.f();
               if ($$1.contains($$7)) {
                  if ($$6.G() > $$6.i() / 2) {
                     $$8 = $$6.G() / 2;
                     break label28;
                  }

                  if ($$6.G() > 24) {
                     $$8 = $$6.G() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.g($$8);
         $$4 = new csd($$7, $$8);
         break;
      }

      if (!$$4.d()) {
         bsy.a($$0, $$4, $$2.dl());
      }
   }
}
