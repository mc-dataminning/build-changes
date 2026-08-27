import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bnr extends bkx<cbh> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cja> e = ImmutableSet.of();

   public bnr() {
      super(ImmutableMap.of(bsh.q, bsi.a, bsh.h, bsi.a));
   }

   protected boolean a(akr $$0, cbh $$1) {
      return bkz.a($$1.dN(), bsh.q, biu.bf);
   }

   protected boolean a(akr $$0, cbh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akr $$0, cbh $$1, long $$2) {
      cbh $$3 = (cbh)$$1.dN().c(bsh.q).get();
      bkz.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(akr $$0, cbh $$1, long $$2) {
      cbh $$3 = (cbh)$$1.dN().c(bsh.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bkz.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gv() && ($$1.go().b() == cbk.g || $$3.gw())) {
            a($$1, cbh.bW.keySet(), $$3);
         }

         if ($$3.go().b() == cbk.g && $$1.y().a_(cji.oI) > cji.oI.l() / 2) {
            a($$1, ImmutableSet.of(cji.oI), $$3);
         }

         if (!this.e.isEmpty() && $$1.y().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(akr $$0, cbh $$1, long $$2) {
      $$1.dN().b(bsh.q);
   }

   private static Set<cja> a(cbh $$0, cbh $$1) {
      ImmutableSet<cja> $$2 = $$1.go().b().d();
      ImmutableSet<cja> $$3 = $$0.go().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cbh $$0, Set<cja> $$1, bjg $$2) {
      bhf $$3 = $$0.y();
      cjf $$4 = cjf.b;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cjf $$6;
         cja $$7;
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
         $$4 = new cjf($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bkz.a($$0, $$4, $$2.dj());
      }
   }
}
