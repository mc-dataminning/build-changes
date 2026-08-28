import com.mojang.serialization.MapCodec;

public class dwr extends dqf {
   public static final MapCodec<dwr> c = b(dwr::new);
   private static final ffr g = dmm.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dwr> a() {
      return c;
   }

   public dwr(ean.d $$0) {
      super($$0, jb.a, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return drz.a($$0);
   }

   @Override
   protected dmm b() {
      return dmo.pg;
   }

   @Override
   protected boolean h(eao $$0) {
      return drz.a($$0);
   }
}
