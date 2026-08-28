import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class byc extends bvh<cmj> {
   private Set<cuj> c = ImmutableSet.of();

   public byc() {
      super(ImmutableMap.of(ccs.q, cct.a, ccs.h, cct.a));
   }

   protected boolean a(are $$0, cmj $$1) {
      return bvj.a($$1.dS(), ccs.q, bsz.bj);
   }

   protected boolean a(are $$0, cmj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(are $$0, cmj $$1, long $$2) {
      cmj $$3 = (cmj)$$1.dS().c(ccs.q).get();
      bvj.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(are $$0, cmj $$1, long $$2) {
      cmj $$3 = (cmj)$$1.dS().c(ccs.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvj.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gI() && ($$1.gB().b() == cmm.g || $$3.gJ())) {
            a($$1, cmj.cb.keySet(), $$3);
         }

         if ($$3.gB().b() == cmm.g && $$1.y().a_(cur.pw) > cur.pw.q() / 2) {
            a($$1, ImmutableSet.of(cur.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.y().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(are $$0, cmj $$1, long $$2) {
      $$1.dS().b(ccs.q);
   }

   private static Set<cuj> a(cmj $$0, cmj $$1) {
      ImmutableSet<cuj> $$2 = $$1.gB().b().d();
      ImmutableSet<cuj> $$3 = $$0.gB().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cmj $$0, Set<cuj> $$1, bto $$2) {
      brc $$3 = $$0.y();
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
                  if ($$6.I() > $$6.j() / 2) {
                     $$8 = $$6.I() / 2;
                     break label28;
                  }

                  if ($$6.I() > 24) {
                     $$8 = $$6.I() - 24;
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
         bvj.a($$0, $$4, $$2.dn());
      }
   }
}
