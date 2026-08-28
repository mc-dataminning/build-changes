import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dro extends dix implements dmu {
   public static final MapCodec<dro> a = b(dro::new);
   public static final dxt<dyf> b = dxm.bm;

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   protected dro(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyf.b));
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvq($$0, $$1);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      dty $$5 = $$1.c_($$2);
      if ($$5 instanceof dvq) {
         return (bsj)(((dvq)$$5).a($$3) ? bsj.a : bsj.e);
      } else {
         return bsj.e;
      }
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, @Nullable bvg $$3, cwo $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dty $$5 = $$0.c_($$1);
            if ($$5 instanceof dvq) {
               ((dvq)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if ($$1 instanceof ard) {
         if ($$1.c_($$2) instanceof dvq $$7) {
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

   private void a(ard $$0, dvq $$1) {
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
