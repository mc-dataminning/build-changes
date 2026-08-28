import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drp extends diy implements dmv {
   public static final MapCodec<drp> a = b(drp::new);
   public static final dxu<dyg> b = dxn.bm;

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   protected drp(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyg.b));
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvr($$0, $$1);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      dtz $$5 = $$1.c_($$2);
      if ($$5 instanceof dvr) {
         return (bsk)(((dvr)$$5).a($$3) ? bsk.a : bsk.e);
      } else {
         return bsk.e;
      }
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, @Nullable bvh $$3, cwp $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dtz $$5 = $$0.c_($$1);
            if ($$5 instanceof dvr) {
               ((dvr)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if ($$1 instanceof ard) {
         if ($$1.c_($$2) instanceof dvr $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ard)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ard $$0, dvr $$1) {
      switch ($$1.u()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.A();
         case d:
      }
   }
}
