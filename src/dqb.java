import com.mojang.serialization.MapCodec;

public class dqb extends dxa {
   public static final MapCodec<dqb> a = b(dqb::new);
   private static final fgw b = dno.b(12.0, 0.0, 13.0);
   private static final int c = 150;
   private static final int d = 5;

   @Override
   public MapCodec<? extends dqb> a() {
      return a;
   }

   protected dqb(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(axn.cr);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$3.a(150) == 0) {
         ebq $$4 = $$1.a_($$2.e());
         if (($$4.a(dnq.N) || $$4.a(axn.ai)) && $$3.a(5) != 0) {
            return;
         }

         ebq $$5 = $$1.a_($$2.c(2));
         if ($$4.a(axn.cH) && $$5.a(axn.cH)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awy.gS, awz.i, 1.0F, 1.0F, false);
         }
      }
   }
}
