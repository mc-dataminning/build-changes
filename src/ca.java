import com.mojang.serialization.Codec;

public record ca(jv<bvi<?>> b) {
   public static final Codec<ca> a = kg.a(mc.z).xmap(ca::new, ca::a);

   public static ca a(js<bvi<?>> $$0, bvi<?> $$1) {
      return new ca(jv.a($$1.r()));
   }

   public static ca a(js<bvi<?>> $$0, axf<bvi<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(bvi<?> $$0) {
      return $$0.a(this.b);
   }

   public jv<bvi<?>> a() {
      return this.b;
   }
}
