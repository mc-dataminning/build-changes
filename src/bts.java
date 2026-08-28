import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bts extends btu {
   public static final bts a = new bts(0.0F);
   public static final MapCodec<bts> b = Codec.FLOAT.fieldOf("value").xmap(bts::a, bts::d);
   private final float d;

   public static bts a(float $$0) {
      return $$0 == 0.0F ? a : new bts($$0);
   }

   private bts(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(azx $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d;
   }

   @Override
   public btv<?> c() {
      return btv.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
