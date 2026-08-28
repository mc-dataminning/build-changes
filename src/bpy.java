import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class bpy extends bqb {
   public static final bpy a = new bpy(0);
   public static final MapCodec<bpy> b = Codec.INT.fieldOf("value").xmap(bpy::a, bpy::d);
   private final int f;

   public static bpy a(int $$0) {
      return $$0 == 0 ? a : new bpy($$0);
   }

   private bpy(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(azh $$0) {
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
   public bqc<?> c() {
      return bqc.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
