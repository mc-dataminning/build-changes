import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bnx extends bld<cbn> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cjg> e = ImmutableSet.of();

   public bnx() {
      super(ImmutableMap.of(bsn.q, bso.a, bsn.h, bso.a));
   }

   protected boolean a(akt $$0, cbn $$1) {
      return blf.a($$1.dN(), bsn.q, bja.bf);
   }

   protected boolean a(akt $$0, cbn $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akt $$0, cbn $$1, long $$2) {
      cbn $$3 = (cbn)$$1.dN().c(bsn.q).get();
      blf.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(akt $$0, cbn $$1, long $$2) {
      cbn $$3 = (cbn)$$1.dN().c(bsn.q).get();
      if (!($$1.f($$3) > 5.0)) {
         blf.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gw() && ($$1.gp().b() == cbq.g || $$3.gx())) {
            a($$1, cbn.bW.keySet(), $$3);
         }

         if ($$3.gp().b() == cbq.g && $$1.y().a_(cjo.oI) > cjo.oI.l() / 2) {
            a($$1, ImmutableSet.of(cjo.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.y().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(akt $$0, cbn $$1, long $$2) {
      $$1.dN().b(bsn.q);
   }

   private static Set<cjg> a(cbn $$0, cbn $$1) {
      ImmutableSet<cjg> $$2 = $$1.gp().b().d();
      ImmutableSet<cjg> $$3 = $$0.gp().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cbn $$0, Set<cjg> $$1, bjm $$2) {
      bhl $$3 = $$0.y();
      cjl $$4 = cjl.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cjl $$6;
         cjg $$7;
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
         $$4 = new cjl($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         blf.a($$0, $$4, $$2.dj());
      }
   }
}
