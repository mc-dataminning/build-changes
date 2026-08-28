import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class byc extends bvh<cmk> {
   private Set<cul> c = ImmutableSet.of();

   public byc() {
      super(ImmutableMap.of(ccs.q, cct.a, ccs.h, cct.a));
   }

   protected boolean a(aqu $$0, cmk $$1) {
      return bvj.a($$1.dT(), ccs.q, bsx.bj);
   }

   protected boolean a(aqu $$0, cmk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqu $$0, cmk $$1, long $$2) {
      cmk $$3 = (cmk)$$1.dT().c(ccs.q).get();
      bvj.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      cmk $$3 = (cmk)$$1.dT().c(ccs.q).get();
      if (!($$1.g($$3) > 5.0)) {
         bvj.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gC() && ($$1.gv().b() == cmn.g || $$3.gD())) {
            a($$1, cmk.cf.keySet(), $$3);
         }

         if ($$3.gv().b() == cmn.g && $$1.x().a_(cut.pw) > cut.pw.q() / 2) {
            a($$1, ImmutableSet.of(cut.pw), $$3);
         }

         if (!this.c.isEmpty() && $$1.x().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aqu $$0, cmk $$1, long $$2) {
      $$1.dT().b(ccs.q);
   }

   private static Set<cul> a(cmk $$0, cmk $$1) {
      ImmutableSet<cul> $$2 = $$1.gv().b().d();
      ImmutableSet<cul> $$3 = $$0.gv().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cmk $$0, Set<cul> $$1, btn $$2) {
      bra $$3 = $$0.x();
      cuq $$4 = cuq.l;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cuq $$6;
         cul $$7;
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
         $$4 = new cuq($$7, $$8);
         break;
      }

      if (!$$4.e()) {
         bvj.a($$0, $$4, $$2.dm());
      }
   }
}
