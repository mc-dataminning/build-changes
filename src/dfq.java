import com.mojang.serialization.MapCodec;

public class dfq extends dan {
   public static final MapCodec<dfq> c = b(dfq::new);
   public static final emv g = cwy.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dfq> a() {
      return c;
   }

   public dfq(djo.d $$0) {
      super($$0, ic.b, g, false, 0.1);
   }

   @Override
   protected int a(auw $$0) {
      return dcd.a($$0);
   }

   @Override
   protected cwy b() {
      return cxa.oC;
   }

   @Override
   protected boolean g(djp $$0) {
      return dcd.a($$0);
   }
}
