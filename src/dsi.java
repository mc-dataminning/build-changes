import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsi extends djq implements dno {
   public static final MapCodec<dsi> a = b(dsi::new);
   public static final dyo<dza> b = dyg.bm;

   @Override
   public MapCodec<dsi> a() {
      return a;
   }

   protected dsi(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dza.b));
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwk($$0, $$1);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      dus $$5 = $$1.c_($$2);
      if ($$5 instanceof dwk) {
         return (bsy)(((dwk)$$5).a($$3) ? bsy.a : bsy.e);
      } else {
         return bsy.e;
      }
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, @Nullable bvy $$3, cxh $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dus $$5 = $$0.c_($$1);
            if ($$5 instanceof dwk) {
               ((dwk)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if ($$1 instanceof ard) {
         if ($$1.c_($$2) instanceof dwk $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((ard)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(ard $$0, dwk $$1) {
      switch ($$1.u()) {
         case a:
            $$1.c(false);
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
