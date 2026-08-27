import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhh extends dcv {
   public static final MapCodec<dhh> c = b(dhh::new);

   @Override
   public MapCodec<dhh> a() {
      return c;
   }

   protected dhh(drc.d $$0) {
      super($$0);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$0, $$2, dok.a);
   }

   @Override
   protected void a(daz $$0, io $$1, cly $$2) {
      doi $$3 = $$0.c_($$1);
      if ($$3 instanceof dpe) {
         $$2.a((bqa)$$3);
         $$2.a(avs.am);
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avi.jY, avj.e, 1.0F, 1.0F, false);
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
