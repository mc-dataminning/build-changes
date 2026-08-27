import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boa extends bkz<cbj> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<gw> g = Optional.empty();

   public boa() {
      super(ImmutableMap.of(bsj.n, bsk.b, bsj.m, bsk.b));
   }

   protected boolean a(aks $$0, cbj $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.y().a_(cjk.qK) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aks $$0, cbj $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<gw> b(aks $$0, cbj $$1) {
      gw.a $$2 = new gw.a();
      Optional<gw> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dl(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.z.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.i());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(gw $$0, aks $$1) {
      dfl $$2 = $$1.a_($$0);
      csx $$3 = $$2.b();
      return $$3 instanceof cuo && !((cuo)$$3).h($$2);
   }

   protected void b(aks $$0, cbj $$1, long $$2) {
      this.a($$1);
      $$1.a(bix.a, new cjh(cjk.qK));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cbj $$0) {
      this.g.ifPresent($$1 -> {
         blc $$2 = new blc($$1);
         $$0.dN().a(bsj.n, $$2);
         $$0.dN().a(bsj.m, new bsm($$2, 0.5F, 1));
      });
   }

   protected void c(aks $$0, cbj $$1, long $$2) {
      $$1.a(bix.a, cjh.b);
      this.e = (long)$$1.ah;
   }

   protected void d(aks $$0, cbj $$1, long $$2) {
      gw $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dj(), 1.0)) {
         cjh $$4 = cjh.b;
         bhh $$5 = $$1.y();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            cjh $$8 = $$5.a($$7);
            if ($$8.a(cjk.qK)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && chc.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
