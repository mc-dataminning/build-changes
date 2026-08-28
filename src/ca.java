import com.mojang.serialization.Codec;

public record ca(jv<but<?>> b) {
   public static final Codec<ca> a = kg.a(mc.z).xmap(ca::new, ca::a);

   public static ca a(js<but<?>> $$0, but<?> $$1) {
      return new ca(jv.a($$1.r()));
   }

   public static ca a(js<but<?>> $$0, axf<but<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(but<?> $$0) {
      return $$0.a(this.b);
   }

   public jv<but<?>> a() {
      return this.b;
   }
}
