import com.mojang.serialization.Codec;

public record ca(jv<bus<?>> b) {
   public static final Codec<ca> a = kg.a(mc.z).xmap(ca::new, ca::a);

   public static ca a(js<bus<?>> $$0, bus<?> $$1) {
      return new ca(jv.a($$1.r()));
   }

   public static ca a(js<bus<?>> $$0, axf<bus<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(bus<?> $$0) {
      return $$0.a(this.b);
   }

   public jv<bus<?>> a() {
      return this.b;
   }
}
