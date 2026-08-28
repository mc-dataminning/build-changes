import com.mojang.serialization.MapCodec;

public class dpb extends dhe implements dgy {
   public static final MapCodec<dpb> a = b(dpb::new);
   protected static final float b = 6.0F;
   protected static final eyx c = dgv.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   protected dpb(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return o($$2).o().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      djd.a($$0, o($$3).o(), $$2, 2);
   }

   private static djd o(dua $$0) {
      return (djd)($$0.a(dgx.bu) ? dgx.iI : dgx.iH);
   }
}
