import com.mojang.serialization.MapCodec;

public class dpo extends djm {
   public static final MapCodec<dpo> c = b(dpo::new);
   public static final ext e = dfy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dpo> a() {
      return c;
   }

   public dpo(dtb.d $$0) {
      super($$0, ji.a, e, false);
   }

   @Override
   protected djn c() {
      return (djn)dga.oz;
   }
}
