import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpi extends dgv implements dkr {
   public static final MapCodec<dpi> a = b(dpi::new);
   public static final dvm<dvy> b = dve.bj;

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   protected dpi(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvy.b));
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dtj($$0, $$1);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      drs $$5 = $$1.c_($$2);
      if ($$5 instanceof dtj) {
         return (brp)(((dtj)$$5).a($$3) ? brp.a : brp.e);
      } else {
         return brp.e;
      }
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, @Nullable buk $$3, cvp $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            drs $$5 = $$0.c_($$1);
            if ($$5 instanceof dtj) {
               ((dtj)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if ($$1 instanceof arh) {
         if ($$1.c_($$2) instanceof dtj $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arh)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arh $$0, dtj $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
