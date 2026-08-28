import com.mojang.serialization.MapCodec;

public class egq extends egr {
   public static final egq a = new egq(dyo.a(0));
   public static final MapCodec<egq> b = dyo.a.fieldOf("value").xmap(egq::new, egq::b);
   private final dyo d;

   public static egq a(dyo $$0) {
      return new egq($$0);
   }

   private egq(dyo $$0) {
      this.d = $$0;
   }

   public dyo b() {
      return this.d;
   }

   @Override
   public int a(azh $$0, dyr $$1) {
      return this.d.a($$1);
   }

   @Override
   public egs<?> a() {
      return egs.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
