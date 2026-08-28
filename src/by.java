import com.mojang.serialization.Codec;

public record by(js<bty<?>> b) {
   public static final Codec<by> a = kd.a(lw.z).xmap(by::new, by::a);

   public static by a(jp<bty<?>> $$0, bty<?> $$1) {
      return new by(js.a($$1.r()));
   }

   public static by a(jp<bty<?>> $$0, axl<bty<?>> $$1) {
      return new by($$0.b($$1));
   }

   public boolean a(bty<?> $$0) {
      return $$0.a(this.b);
   }

   public js<bty<?>> a() {
      return this.b;
   }
}
