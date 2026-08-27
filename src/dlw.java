import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlw extends ddk implements dhg {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final drz<dsl> b = drr.bj;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   protected dlw(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsl.b));
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpv($$0, $$1);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      dog $$5 = $$1.c_($$2);
      if ($$5 instanceof dpv) {
         return ((dpv)$$5).a($$3) ? bpu.a($$1.B) : bpu.d;
      } else {
         return bpu.d;
      }
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, @Nullable bso $$3, cto $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dog $$5 = $$0.c_($$1);
            if ($$5 instanceof dpv) {
               ((dpv)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if ($$1 instanceof aqm) {
         if ($$1.c_($$2) instanceof dpv $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqm)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqm $$0, dpv $$1) {
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
