import com.mojang.serialization.Codec;

public record by(jt<bug<?>> b) {
   public static final Codec<by> a = ke.a(ly.z).xmap(by::new, by::a);

   public static by a(jq<bug<?>> $$0, bug<?> $$1) {
      return new by(jt.a($$1.r()));
   }

   public static by a(jq<bug<?>> $$0, axp<bug<?>> $$1) {
      return new by($$0.b($$1));
   }

   public boolean a(bug<?> $$0) {
      return $$0.a(this.b);
   }

   public jt<bug<?>> a() {
      return this.b;
   }
}
