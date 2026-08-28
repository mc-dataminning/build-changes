import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cbl extends byq<cqe> {
   private Set<cyo> c = ImmutableSet.of();

   public cbl() {
      super(ImmutableMap.of(cgb.r, cgc.a, cgb.h, cgc.a));
   }

   protected boolean a(aro $$0, cqe $$1) {
      return bys.a($$1.eb(), cgb.r, bwj.bD);
   }

   protected boolean a(aro $$0, cqe $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aro $$0, cqe $$1, long $$2) {
      cqe $$3 = (cqe)$$1.eb().c(cgb.r).get();
      bys.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aro $$0, cqe $$1, long $$2) {
      cqe $$3 = (cqe)$$1.eb().c(cgb.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bys.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gy().b().a(cqh.g);
         if ($$1.gG() && ($$4 || $$3.gH())) {
            a($$1, cqe.bI.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(cyw.qf) > cyw.qf.g() / 2) {
            a($$1, ImmutableSet.of(cyw.qf), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aro $$0, cqe $$1, long $$2) {
      $$1.eb().b(cgb.r);
   }

   private static Set<cyo> a(cqe $$0, cqe $$1) {
      ImmutableSet<cyo> $$2 = $$1.gy().b().a().d();
      ImmutableSet<cyo> $$3 = $$0.gy().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cqe $$0, Set<cyo> $$1, bwz $$2) {
      buf $$3 = $$0.n();
      cys $$4 = cys.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cys $$6;
         cyo $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.f()) {
               $$7 = $$6.h();
               if ($$1.contains($$7)) {
                  if ($$6.M() > $$6.k() / 2) {
                     $$8 = $$6.M() / 2;
                     break label28;
                  }

                  if ($$6.M() > 24) {
                     $$8 = $$6.M() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cys($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bys.a($$0, $$4, $$2.dt());
      }
   }
}
