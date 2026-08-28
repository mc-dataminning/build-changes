import com.mojang.serialization.MapCodec;

public class drx extends djx implements djq {
   public static final MapCodec<drx> a = b(drx::new);
   protected static final float b = 6.0F;
   protected static final fbv c = djn.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   protected drx(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      dlw.a($$0, o($$3).m(), $$2, 2);
   }

   private static dlw o(dwy $$0) {
      return (dlw)($$0.a(djp.bB) ? djp.jg : djp.jf);
   }
}
