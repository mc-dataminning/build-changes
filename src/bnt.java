import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bnt extends bkz<cbj> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cjc> e = ImmutableSet.of();

   public bnt() {
      super(ImmutableMap.of(bsj.q, bsk.a, bsj.h, bsk.a));
   }

   protected boolean a(aks $$0, cbj $$1) {
      return blb.a($$1.dN(), bsj.q, biw.bf);
   }

   protected boolean a(aks $$0, cbj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aks $$0, cbj $$1, long $$2) {
      cbj $$3 = (cbj)$$1.dN().c(bsj.q).get();
      blb.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(aks $$0, cbj $$1, long $$2) {
      cbj $$3 = (cbj)$$1.dN().c(bsj.q).get();
      if (!($$1.f($$3) > 5.0)) {
         blb.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gv() && ($$1.go().b() == cbm.g || $$3.gw())) {
            a($$1, cbj.bW.keySet(), $$3);
         }

         if ($$3.go().b() == cbm.g && $$1.y().a_(cjk.oI) > cjk.oI.l() / 2) {
            a($$1, ImmutableSet.of(cjk.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.y().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(aks $$0, cbj $$1, long $$2) {
      $$1.dN().b(bsj.q);
   }

   private static Set<cjc> a(cbj $$0, cbj $$1) {
      ImmutableSet<cjc> $$2 = $$1.go().b().d();
      ImmutableSet<cjc> $$3 = $$0.go().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cbj $$0, Set<cjc> $$1, bji $$2) {
      bhh $$3 = $$0.y();
      cjh $$4 = cjh.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cjh $$6;
         cjc $$7;
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
         $$4 = new cjh($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         blb.a($$0, $$4, $$2.dj());
      }
   }
}
