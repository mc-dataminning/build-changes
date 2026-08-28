import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cbv extends bza<cqy> {
   private Set<czj> c = ImmutableSet.of();

   public cbv() {
      super(ImmutableMap.of(cgl.r, cgm.a, cgl.h, cgm.a));
   }

   protected boolean a(arq $$0, cqy $$1) {
      return bzc.a($$1.eb(), cgl.r, bwr.bD);
   }

   protected boolean a(arq $$0, cqy $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, cqy $$1, long $$2) {
      cqy $$3 = (cqy)$$1.eb().c(cgl.r).get();
      bzc.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arq $$0, cqy $$1, long $$2) {
      cqy $$3 = (cqy)$$1.eb().c(cgl.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bzc.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gB().b().a(crb.g);
         if ($$1.gK() && ($$4 || $$3.gL())) {
            a($$1, cqy.bJ.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(czr.qk) > czr.qk.g() / 2) {
            a($$1, ImmutableSet.of(czr.qk), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arq $$0, cqy $$1, long $$2) {
      $$1.eb().b(cgl.r);
   }

   private static Set<czj> a(cqy $$0, cqy $$1) {
      ImmutableSet<czj> $$2 = $$1.gB().b().a().d();
      ImmutableSet<czj> $$3 = $$0.gB().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cqy $$0, Set<czj> $$1, bxj $$2) {
      bun $$3 = $$0.n();
      czn $$4 = czn.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         czn $$6;
         czj $$7;
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
         $$4 = new czn($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bzc.a($$0, $$4, $$2.ds());
      }
   }
}
