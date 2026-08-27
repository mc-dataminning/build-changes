import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bsr extends bpw<cgu> {
   private Set<cou> c = ImmutableSet.of();

   public bsr() {
      super(ImmutableMap.of(bxh.q, bxi.a, bxh.h, bxi.a));
   }

   protected boolean a(aov $$0, cgu $$1) {
      return bpy.a($$1.dO(), bxh.q, bnu.bh);
   }

   protected boolean a(aov $$0, cgu $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aov $$0, cgu $$1, long $$2) {
      cgu $$3 = (cgu)$$1.dO().c(bxh.q).get();
      bpy.a($$1, $$3, 0.5F, 2);
      this.c = a($$1, $$3);
   }

   protected void c(aov $$0, cgu $$1, long $$2) {
      cgu $$3 = (cgu)$$1.dO().c(bxh.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bpy.a($$1, $$3, 0.5F, 2);
         $$1.a($$0, $$3, $$2);
         if ($$1.gy() && ($$1.gr().b() == cgx.g || $$3.gz())) {
            a($$1, cgu.bW.keySet(), $$3);
         }

         if ($$3.gr().b() == cgx.g && $$1.A().a_(cpc.pv) > cpc.pv.k() / 2) {
            a($$1, ImmutableSet.of(cpc.pv), $$3);
         }

         if (!this.c.isEmpty() && $$1.A().a(this.c)) {
            a($$1, this.c, $$3);
         }
      }
   }

   protected void d(aov $$0, cgu $$1, long $$2) {
      $$1.dO().b(bxh.q);
   }

   private static Set<cou> a(cgu $$0, cgu $$1) {
      ImmutableSet<cou> $$2 = $$1.gr().b().d();
      ImmutableSet<cou> $$3 = $$0.gr().b().d();
      return $$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(cgu $$0, Set<cou> $$1, bog $$2) {
      bmd $$3 = $$0.A();
      coz $$4 = coz.h;
      int $$5 = 0;

      while ($$5 < $$3.b()) {
         coz $$6;
         cou $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.b()) {
               $$7 = $$6.d();
               if ($$1.contains($$7)) {
                  if ($$6.M() > $$6.g() / 2) {
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
         $$4 = new coz($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bpy.a($$0, $$4, $$2.dk());
      }
   }
}
