import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpw extends dhk implements dlf {
   public static final MapCodec<dpw> a = b(dpw::new);
   public static final dwb<dwn> b = dvt.bj;

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   protected dpw(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwn.b));
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtx($$0, $$1);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      dsg $$5 = $$1.c_($$2);
      if ($$5 instanceof dtx) {
         return (bry)(((dtx)$$5).a($$3) ? bry.a : bry.e);
      } else {
         return bry.e;
      }
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, @Nullable buv $$3, cvx $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dsg $$5 = $$0.c_($$1);
            if ($$5 instanceof dtx) {
               ((dtx)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if ($$1 instanceof arm) {
         if ($$1.c_($$2) instanceof dtx $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arm)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arm $$0, dtx $$1) {
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
