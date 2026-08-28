import com.mojang.serialization.Codec;

public record ca(jv<buq<?>> b) {
   public static final Codec<ca> a = kg.a(mc.z).xmap(ca::new, ca::a);

   public static ca a(js<buq<?>> $$0, buq<?> $$1) {
      return new ca(jv.a($$1.r()));
   }

   public static ca a(js<buq<?>> $$0, axe<buq<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(buq<?> $$0) {
      return $$0.a(this.b);
   }

   public jv<buq<?>> a() {
      return this.b;
   }
}
