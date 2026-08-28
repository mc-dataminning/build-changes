import com.mojang.serialization.MapCodec;

public class egw extends egx {
   public static final egw a = new egw(dyt.a(0));
   public static final MapCodec<egw> b = dyt.a.fieldOf("value").xmap(egw::new, egw::b);
   private final dyt d;

   public static egw a(dyt $$0) {
      return new egw($$0);
   }

   private egw(dyt $$0) {
      this.d = $$0;
   }

   public dyt b() {
      return this.d;
   }

   @Override
   public int a(aym $$0, dyw $$1) {
      return this.d.a($$1);
   }

   @Override
   public egy<?> a() {
      return egy.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
