import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dde extends ddk {
   public static final MapCodec<dde> a = b(dde::new);
   public static final drv b = drr.P;
   public static final drs c = drr.u;

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   public dde(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof dnz) {
            $$3.a((dnz)$$5);
            $$3.a(avr.ar);
            ckn.a($$3, true);
         }

         return bpu.b;
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      bpq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      dog $$4 = $$1.c_($$2);
      if ($$4 instanceof dnz) {
         ((dnz)$$4).l();
      }
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dnz($$0, $$1);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return cot.a($$1.c_($$2));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.d().g());
   }
}
