import com.mojang.serialization.Codec;

public class bpc extends bpf {
   public static final bpc a = new bpc(0);
   public static final Codec<bpc> b = axu.e(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bpc::new, bpc::d);
   private final int f;

   public static bpc a(int $$0) {
      return $$0 == 0 ? a : new bpc($$0);
   }

   private bpc(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(ayt $$0) {
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
   public bpg<?> c() {
      return bpg.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
