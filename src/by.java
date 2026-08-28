import com.mojang.serialization.Codec;

public record by(jr<btq<?>> b) {
   public static final Codec<by> a = kc.a(lv.z).xmap(by::new, by::a);

   public static by a(jo<btq<?>> $$0, btq<?> $$1) {
      return new by(jr.a($$1.r()));
   }

   public static by a(jo<btq<?>> $$0, axi<btq<?>> $$1) {
      return new by($$0.b($$1));
   }

   public boolean a(btq<?> $$0) {
      return $$0.a(this.b);
   }

   public jr<btq<?>> a() {
      return this.b;
   }
}
