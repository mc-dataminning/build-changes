import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bys extends bvx<cnc> {
   private Set<cvg> c = ImmutableSet.of();

   public bys() {
      super(ImmutableMap.of(cdi.q, cdj.a, cdi.h, cdj.a));
   }

   protected boolean a(arg $$0, cnc $$1) {
      return bvz.a($$1.dX(), cdi.q, btq.bj);
   }

   protected boolean a(arg $$0, cnc $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arg $$0, cnc $$1, long $$2) {
      cnc $$3 = (cnc)$$1.dX().c(cdi.q).get();
      bvz.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(arg $$0, cnc $$1, long $$2) {
      cnc $$3 = (cnc)$$1.dX().c(cdi.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvz.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gG() && ($$1.gy().b() == cnf.g || $$3.gH())) {
            a($$1, cnc.cc.keySet(), $$3);
         }

         if ($$3.gy().b() == cnf.g && $$1.y().a_(cvo.px) > cvo.px.q() / 2) {
            a($$1, ImmutableSet.of(cvo.px), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a_(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(arg $$0, cnc $$1, long $$2) {
      $$1.dX().b(cdi.q);
   }

   private static Set<cvg> a(cnc $$0, cnc $$1) {
      ImmutableSet<cvg> $$2 = $$1.gy().b().d();
      ImmutableSet<cvg> $$3 = $$0.gy().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cnc $$0, Set<cvg> $$1, buf $$2) {
      brr $$3 = $$0.y();
      cvl $$4 = cvl.k;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cvl $$6;
         cvg $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.f()) {
               $$7 = $$6.h();
               if ($$1.contains($$7)) {
                  if ($$6.J() > $$6.k() / 2) {
                     $$8 = $$6.J() / 2;
                     break label28;
                  }

                  if ($$6.J() > 24) {
                     $$8 = $$6.J() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cvl($$7, $$8);
         break;
      }

      if (!$$4.f()) {
         bvz.a($$0, $$4, $$2.dq());
      }
   }
}
