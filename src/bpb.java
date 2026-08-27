import com.mojang.serialization.Codec;

public class bpb extends bpd {
   public static final bpb a = new bpb(0.0F);
   public static final Codec<bpb> b = axu.e(Codec.FLOAT, Codec.FLOAT.fieldOf("value").codec()).xmap(bpb::new, bpb::d);
   private final float d;

   public static bpb a(float $$0) {
      return $$0 == 0.0F ? a : new bpb($$0);
   }

   private bpb(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(ayt $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d + 1.0F;
   }

   @Override
   public bpe<?> c() {
      return bpe.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
