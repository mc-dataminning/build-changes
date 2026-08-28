import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class cbd extends byi<cpu> {
   private Set<cxu> c = ImmutableSet.of();

   public cbd() {
      super(ImmutableMap.of(cft.r, cfu.a, cft.h, cfu.a));
   }

   protected boolean a(arn $$0, cpu $$1) {
      return byk.a($$1.eb(), cft.r, bwb.bC);
   }

   protected boolean a(arn $$0, cpu $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arn $$0, cpu $$1, long $$2) {
      cpu $$3 = (cpu)$$1.eb().c(cft.r).get();
      byk.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      cpu $$3 = (cpu)$$1.eb().c(cft.r).get();
      if (!($$1.g($$3) > 5.0)) {
         byk.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         boolean $$4 = $$1.gy().b().a(cpx.g);
         if ($$1.gG() && ($$4 || $$3.gH())) {
            a($$1, cpu.bH.keySet(), $$3);
         }

         if ($$4 && $$1.n().a_(cyc.qf) > cyc.qf.h() / 2) {
            a($$1, ImmutableSet.of(cyc.qf), $$3);
         }

         if (!this.c.isEmpty() && $$1.n().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arn $$0, cpu $$1, long $$2) {
      $$1.eb().b(cft.r);
   }

   private static Set<cxu> a(cpu $$0, cpu $$1) {
      ImmutableSet<cxu> $$2 = $$1.gy().b().a().d();
      ImmutableSet<cxu> $$3 = $$0.gy().b().a().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cpu $$0, Set<cxu> $$1, bwr $$2) {
      btx $$3 = $$0.n();
      cxy $$4 = cxy.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cxy $$6;
         cxu $$7;
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
         $$4 = new cxy($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         byk.a($$0, $$4, $$2.dt());
      }
   }
}
