import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dec extends ddk {
   public static final MapCodec<dec> a = b(dec::new);
   public static final drs[] b = new drs[]{drr.k, drr.l, drr.m};
   protected static final evd c = eva.a(ddy.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), ddy.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public dec(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new doj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0.B ? null : a($$2, doi.l, doj::a);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof doj) {
            $$3.a((doj)$$5);
            $$3.a(avr.aa);
         }

         return bpu.b;
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ky.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      bpq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
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
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
