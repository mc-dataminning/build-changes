import com.mojang.serialization.Codec;

public class bns extends bnv {
   public static final bns a = new bns(0);
   public static final Codec<bns> b = axe.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bns::new, bns::d);
   private final int f;

   public static bns a(int $$0) {
      return $$0 == 0 ? a : new bns($$0);
   }

   private bns(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ayd $$0) {
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
   public bnw<?> c() {
      return bnw.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
