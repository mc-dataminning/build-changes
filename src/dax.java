import com.mojang.serialization.MapCodec;

public class dax extends dbk {
   public static final MapCodec<dax> a = b(dax::new);
   protected static final eol b = cyo.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dax> a() {
      return a;
   }

   public dax(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      this.d($$0, $$1, $$2);
      return blu.a($$1.B);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, chh $$3) {
      this.d($$0, $$1, $$2);
   }

   private void d(dlf $$0, cvn $$1, hz $$2) {
      dmw $$3 = $$1.D_();

      for (int $$4 = 0; $$4 < 1000; $$4++) {
         hz $$5 = $$2.b($$1.z.a(16) - $$1.z.a(16), $$1.z.a(8) - $$1.z.a(8), $$1.z.a(16) - $$1.z.a(16));
         if ($$1.a_($$5).i() && $$3.a($$5)) {
            if ($$1.B) {
               for (int $$6 = 0; $$6 < 128; $$6++) {
                  double $$7 = $$1.z.j();
                  float $$8 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$9 = ($$1.z.i() - 0.5F) * 0.2F;
                  float $$10 = ($$1.z.i() - 0.5F) * 0.2F;
                  double $$11 = awh.d($$7, (double)$$5.u(), (double)$$2.u()) + ($$1.z.j() - 0.5) + 0.5;
                  double $$12 = awh.d($$7, (double)$$5.v(), (double)$$2.v()) + $$1.z.j() - 0.5;
                  double $$13 = awh.d($$7, (double)$$5.w(), (double)$$2.w()) + ($$1.z.j() - 0.5) + 0.5;
                  $$1.a(jz.Z, $$11, $$12, $$13, (double)$$8, (double)$$9, (double)$$10);
               }
            } else {
               $$1.a($$5, $$0, 2);
               $$1.a($$2, false);
            }

            return;
         }
      }
   }

   @Override
   protected int b() {
      return 5;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
