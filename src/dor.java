import com.mojang.serialization.MapCodec;

public class dor extends djk {
   public static final MapCodec<dor> c = b(dor::new);
   public static final exp e = dfw.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dor> a() {
      return c;
   }

   public dor(dsz.d $$0) {
      super($$0, ji.b, e, false);
   }

   @Override
   protected djl c() {
      return (djl)dfy.oB;
   }
}
