import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bxb extends bug<cll> {
   private Set<cuc> c = ImmutableSet.of();

   public bxb() {
      super(ImmutableMap.of(cbr.q, cbs.a, cbr.h, cbs.a));
   }

   protected boolean a(aqt $$0, cll $$1) {
      return bui.a($$1.dZ(), cbr.q, bsb.bn);
   }

   protected boolean a(aqt $$0, cll $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqt $$0, cll $$1, long $$2) {
      cll $$3 = (cll)$$1.dZ().c(cbr.q).get();
      bui.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      cll $$3 = (cll)$$1.dZ().c(cbr.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bui.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gQ() && ($$1.gL().b() == clo.g || $$3.gR())) {
            a($$1, cll.ck.keySet(), $$3);
         }

         if ($$3.gL().b() == clo.g && $$1.x().a_(cuk.qP) > cuk.qP.p() / 2) {
            a($$1, ImmutableSet.of(cuk.qP), $$3);
         }

         if (!this.c.isEmpty() && $$1.x().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqt $$0, cll $$1, long $$2) {
      $$1.dZ().b(cbr.q);
   }

   private static Set<cuc> a(cll $$0, cll $$1) {
      ImmutableSet<cuc> $$2 = $$1.gL().b().d();
      ImmutableSet<cuc> $$3 = $$0.gL().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cll $$0, Set<cuc> $$1, bso $$2) {
      bqj $$3 = $$0.x();
      cuh $$4 = cuh.i;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cuh $$6;
         cuc $$7;
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

         $$6.h($$8);
         $$4 = new cuh($$7, $$8);
         break;
      }

      if (!$$4.d()) {
         bui.a($$0, $$4, $$2.ds());
      }
   }
}
