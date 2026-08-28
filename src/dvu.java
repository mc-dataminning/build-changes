import com.mojang.serialization.MapCodec;

public class dvu extends dqf {
   public static final MapCodec<dvu> c = b(dvu::new);
   private static final ffr g = dmm.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dvu> a() {
      return c;
   }

   public dvu(ean.d $$0) {
      super($$0, jb.b, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return drz.a($$0);
   }

   @Override
   protected dmm b() {
      return dmo.pi;
   }

   @Override
   protected boolean h(eao $$0) {
      return drz.a($$0);
   }
}
