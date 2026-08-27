import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bqw extends bob<ceu> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private Set<cms> e = ImmutableSet.of();

   public bqw() {
      super(ImmutableMap.of(bvm.q, bvn.a, bvm.h, bvn.a));
   }

   protected boolean a(and $$0, ceu $$1) {
      return bod.a($$1.dO(), bvm.q, bly.bg);
   }

   protected boolean a(and $$0, ceu $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(and $$0, ceu $$1, long $$2) {
      ceu $$3 = (ceu)$$1.dO().c(bvm.q).get();
      bod.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(and $$0, ceu $$1, long $$2) {
      ceu $$3 = (ceu)$$1.dO().c(bvm.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bod.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gw() && ($$1.gp().b() == cex.g || $$3.gx())) {
            a($$1, ceu.bW.keySet(), $$3);
         }

         if ($$3.gp().b() == cex.g && $$1.A().a_(cna.pt) > cna.pt.l() / 2) {
            a($$1, ImmutableSet.of(cna.pt), $$3);
         }

         if (!this.e.isEmpty() && $$1.A().a(this.e)) {
            a($$1, this.e, $$3);
         }
      }
   }

   protected void d(and $$0, ceu $$1, long $$2) {
      $$1.dO().b(bvm.q);
   }

   private static Set<cms> a(ceu $$0, ceu $$1) {
      ImmutableSet<cms> $$2 = $$1.gp().b().d();
      ImmutableSet<cms> $$3 = $$0.gp().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(ceu $$0, Set<cms> $$1, bmk $$2) {
      bki $$3 = $$0.A();
      cmx $$4 = cmx.f;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         cmx $$6;
         cms $$7;
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
         $$4 = new cmx($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bod.a($$0, $$4, $$2.dk());
      }
   }
}
