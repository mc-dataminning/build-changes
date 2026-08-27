import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bvg extends bsl<cjn> {
   private Set<crn> c = ImmutableSet.of();

   public bvg() {
      super(ImmutableMap.of(bzw.q, bzx.a, bzw.h, bzx.a));
   }

   protected boolean a(apu $$0, cjn $$1) {
      return bsn.a($$1.dP(), bzw.q, bqg.bi);
   }

   protected boolean a(apu $$0, cjn $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apu $$0, cjn $$1, long $$2) {
      cjn $$3 = (cjn)$$1.dP().c(bzw.q).get();
      bsn.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      cjn $$3 = (cjn)$$1.dP().c(bzw.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bsn.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gF() && ($$1.gy().b() == cjq.g || $$3.gG())) {
            a($$1, cjn.ca.keySet(), $$3);
         }

         if ($$3.gy().b() == cjq.g && $$1.y().a_(crv.pv) > crv.pv.q() / 2) {
            a($$1, ImmutableSet.of(crv.pv), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(apu $$0, cjn $$1, long $$2) {
      $$1.dP().b(bzw.q);
   }

   private static Set<crn> a(cjn $$0, cjn $$1) {
      ImmutableSet<crn> $$2 = $$1.gy().b().d();
      ImmutableSet<crn> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cjn $$0, Set<crn> $$1, bqt $$2) {
      boo $$3 = $$0.y();
      crs $$4 = crs.i;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         crs $$6;
         crn $$7;
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
         $$4 = new crs($$7, $$8);
         break;
      }

      if (!$$4.d()) {
         bsn.a($$0, $$4, $$2.dk());
      }
   }
}
