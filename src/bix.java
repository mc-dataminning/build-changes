import com.mojang.serialization.Codec;

public class bix extends bja {
   public static final bix a = new bix(0);
   public static final Codec<bix> b = atq.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bix::new, bix::d);
   private final int f;

   public static bix a(int $$0) {
      return $$0 == 0 ? a : new bix($$0);
   }

   private bix(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(aup $$0) {
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
   public bjb<?> c() {
      return bjb.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
