import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bya extends bvf<cmi> {
   private Set<cuj> c = ImmutableSet.of();

   public bya() {
      super(ImmutableMap.of(ccq.q, ccr.a, ccq.h, ccr.a));
   }

   protected boolean a(aqt $$0, cmi $$1) {
      return bvh.a($$1.dU(), ccq.q, bsw.bj);
   }

   protected boolean a(aqt $$0, cmi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqt $$0, cmi $$1, long $$2) {
      cmi $$3 = (cmi)$$1.dU().c(ccq.q).get();
      bvh.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      cmi $$3 = (cmi)$$1.dU().c(ccq.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvh.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gE() && ($$1.gx().b() == cml.g || $$3.gF())) {
            a($$1, cmi.cd.keySet(), $$3);
         }

         if ($$3.gx().b() == cml.g && $$1.x().a_(cur.pw) > cur.pw.q() / 2) {
            a($$1, ImmutableSet.of(cur.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.x().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqt $$0, cmi $$1, long $$2) {
      $$1.dU().b(ccq.q);
   }

   private static Set<cuj> a(cmi $$0, cmi $$1) {
      ImmutableSet<cuj> $$2 = $$1.gx().b().d();
      ImmutableSet<cuj> $$3 = $$0.gx().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cmi $$0, Set<cuj> $$1, btl $$2) {
      bqz $$3 = $$0.x();
      cuo $$4 = cuo.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cuo $$6;
         cuj $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.e()) {
               $$7 = $$6.g();
               if ($$1.contains($$7)) {
                  if ($$6.H() > $$6.j() / 2) {
                     $$8 = $$6.H() / 2;
                     break label28;
                  }

                  if ($$6.H() > 24) {
                     $$8 = $$6.H() - 24;
                     break label28;
                  }
               }
            }

            $$5++;
            continue;
         }

         $$6.h($$8);
         $$4 = new cuo($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bvh.a($$0, $$4, $$2.do());
      }
   }
}
