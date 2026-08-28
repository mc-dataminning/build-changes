import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cbq extends byv<cqo> {
   private Set<cyz> c = ImmutableSet.of();

   public cbq() {
      super(ImmutableMap.of(cgg.r, cgh.a, cgg.h, cgh.a));
   }

   protected boolean a(arq $$0, cqo $$1) {
      return byx.a($$1.ec(), cgg.r, bwo.bD);
   }

   protected boolean a(arq $$0, cqo $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, cqo $$1, long $$2) {
      cqo $$3 = (cqo)$$1.ec().c(cgg.r).get();
      byx.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      cqo $$3 = (cqo)$$1.ec().c(cgg.r).get();
      if (!($$1.g($$3) > 5.0)) {
         byx.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gz().b().a(cqr.g);
         if ($$1.gI() && ($$4 || $$3.gJ())) {
            a($$1, cqo.bJ.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(czh.qk) > czh.qk.g() / 2) {
            a($$1, ImmutableSet.of(czh.qk), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arq $$0, cqo $$1, long $$2) {
      $$1.ec().b(cgg.r);
   }

   private static Set<cyz> a(cqo $$0, cqo $$1) {
      ImmutableSet<cyz> $$2 = $$1.gz().b().a().d();
      ImmutableSet<cyz> $$3 = $$0.gz().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cqo $$0, Set<cyz> $$1, bxe $$2) {
      buk $$3 = $$0.n();
      czd $$4 = czd.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         czd $$6;
         cyz $$7;
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
         $$4 = new czd($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         byx.a($$0, $$4, $$2.dt());
      }
   }
}
