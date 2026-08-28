import com.mojang.serialization.MapCodec;

public class dvh extends dwd implements dmu {
   public static final MapCodec<dvh> a = b(dvh::new);
   private static final ffw b = dmr.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dvh> a() {
      return a;
   }

   protected dvh(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return o($$2).m().a($$0, $$1) && $$0.v($$1.d());
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      dpa.a($$0, o($$3).m(), $$2, 2);
   }

   private static dpa o(eat $$0) {
      return (dpa)($$0.a(dmt.bB) ? dmt.jk : dmt.jj);
   }
}
