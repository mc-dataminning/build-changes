import java.util.Optional;
import javax.annotation.Nullable;

public class coq implements dfu {
   private static final int b = 1200;
   public static final int a = 24000;
   private static final int c = 25;
   private static final int d = 75;
   private static final int e = 25;
   private static final int f = 10;
   private static final int g = 10;
   private final azh h = azh.a();
   private final evk i;
   private int j;
   private int k;
   private int l;

   public coq(evk $$0) {
      this.i = $$0;
      this.j = 1200;
      this.k = $$0.t();
      this.l = $$0.u();
      if (this.k == 0 && this.l == 0) {
         this.k = 24000;
         $$0.d(this.k);
         this.l = 25;
         $$0.e(this.l);
      }
   }

   @Override
   public int a(ard $$0, boolean $$1, boolean $$2) {
      if (!$$0.O().b(dge.M)) {
         return 0;
      } else if (--this.j > 0) {
         return 0;
      } else {
         this.j = 1200;
         this.k -= 1200;
         this.i.d(this.k);
         if (this.k > 0) {
            return 0;
         } else {
            this.k = 24000;
            if (!$$0.O().b(dge.e)) {
               return 0;
            } else {
               int $$3 = this.l;
               this.l = ayz.a(this.l + 25, 25, 75);
               this.i.e(this.l);
               if (this.h.a(100) > $$3) {
                  return 0;
               } else if (this.a($$0)) {
                  this.l = 25;
                  return 1;
               } else {
                  return 0;
               }
            }
         }
      }
   }

   private boolean a(ard $$0) {
      cox $$1 = $$0.k();
      if ($$1 == null) {
         return true;
      } else if (this.h.a(10) != 0) {
         return false;
      } else {
         ji $$2 = $$1.dv();
         int $$3 = 48;
         cgl $$4 = $$0.A();
         Optional<ji> $$5 = $$4.d($$0x -> $$0x.a(cgp.o), $$0x -> true, $$2, 48, cgl.b.c);
         ji $$6 = $$5.orElse($$2);
         ji $$7 = this.a($$0, $$6, 48);
         if ($$7 != null && this.a($$0, $$7)) {
            if ($$0.t($$7).a(awo.ah)) {
               return false;
            }

            cop $$8 = bus.bE.a($$0, $$7, bur.h);
            if ($$8 != null) {
               for (int $$9 = 0; $$9 < 2; $$9++) {
                  this.a($$0, $$8, 4);
               }

               this.i.a($$8.cG());
               $$8.t(48000);
               $$8.h($$6);
               $$8.a($$6, 16);
               return true;
            }
         }

         return false;
      }
   }

   private void a(ard $$0, cop $$1, int $$2) {
      ji $$3 = this.a($$0, $$1.dv(), $$2);
      if ($$3 != null) {
         cjk $$4 = bus.bx.a($$0, $$3, bur.h);
         if ($$4 != null) {
            $$4.b($$1, true);
         }
      }
   }

   @Nullable
   private ji a(dgl $$0, ji $$1, int $$2) {
      ji $$3 = null;
      bwb $$4 = bwd.a(bus.bE);

      for (int $$5 = 0; $$5 < 10; $$5++) {
         int $$6 = $$1.u() + this.h.a($$2 * 2) - $$2;
         int $$7 = $$1.w() + this.h.a($$2 * 2) - $$2;
         int $$8 = $$0.a(ecs.a.b, $$6, $$7);
         ji $$9 = new ji($$6, $$8, $$7);
         if ($$4.isSpawnPositionOk($$0, $$9, bus.bE)) {
            $$3 = $$9;
            break;
         }
      }

      return $$3;
   }

   private boolean a(dfn $$0, ji $$1) {
      for (ji $$2 : ji.c($$1, $$1.b(1, 2, 1))) {
         if (!$$0.a_($$2).g($$0, $$2).c()) {
            return false;
         }
      }

      return true;
   }
}
