import com.mojang.serialization.MapCodec;

public class egr extends egs {
   public static final egr a = new egr(dyp.a(0));
   public static final MapCodec<egr> b = dyp.a.fieldOf("value").xmap(egr::new, egr::b);
   private final dyp d;

   public static egr a(dyp $$0) {
      return new egr($$0);
   }

   private egr(dyp $$0) {
      this.d = $$0;
   }

   public dyp b() {
      return this.d;
   }

   @Override
   public int a(azh $$0, dys $$1) {
      return this.d.a($$1);
   }

   @Override
   public egt<?> a() {
      return egt.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
