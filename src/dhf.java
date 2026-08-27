import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhf extends dct {
   public static final MapCodec<dhf> c = b(dhf::new);

   @Override
   public MapCodec<dhf> a() {
      return c;
   }

   protected dhf(dra.d $$0) {
      super($$0);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$0, $$2, doi.a);
   }

   @Override
   protected void a(dax $$0, io $$1, clw $$2) {
      dog $$3 = $$0.c_($$1);
      if ($$3 instanceof dpc) {
         $$2.a((bpy)$$3);
         $$2.a(avr.am);
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avh.jY, avi.e, 1.0F, 1.0F, false);
         }

         it $$7 = $$0.c(a);
         it.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == it.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == it.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ky.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(ky.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
