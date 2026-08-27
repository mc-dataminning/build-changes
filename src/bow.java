import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bow extends boz {
   public static final bow a = new bow(0);
   public static final MapCodec<bow> b = Codec.INT.fieldOf("value").xmap(bow::a, bow::d);
   private final int f;

   public static bow a(int $$0) {
      return $$0 == 0 ? a : new bow($$0);
   }

   private bow(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ayk $$0) {
      return this.f;
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public bpa<?> c() {
      return bpa.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
