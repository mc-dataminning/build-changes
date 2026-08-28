import com.mojang.serialization.MapCodec;

public class egp extends egq {
   public static final egp a = new egp(dyn.a(0));
   public static final MapCodec<egp> b = dyn.a.fieldOf("value").xmap(egp::new, egp::b);
   private final dyn d;

   public static egp a(dyn $$0) {
      return new egp($$0);
   }

   private egp(dyn $$0) {
      this.d = $$0;
   }

   public dyn b() {
      return this.d;
   }

   @Override
   public int a(azg $$0, dyq $$1) {
      return this.d.a($$1);
   }

   @Override
   public egr<?> a() {
      return egr.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
