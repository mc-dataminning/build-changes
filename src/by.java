import com.mojang.serialization.Codec;

public record by(jr<btv<?>> b) {
   public static final Codec<by> a = kc.a(lv.z).xmap(by::new, by::a);

   public static by a(jo<btv<?>> $$0, btv<?> $$1) {
      return new by(jr.a($$1.r()));
   }

   public static by a(jo<btv<?>> $$0, axj<btv<?>> $$1) {
      return new by($$0.b($$1));
   }

   public boolean a(btv<?> $$0) {
      return $$0.a(this.b);
   }

   public jr<btv<?>> a() {
      return this.b;
   }
}
