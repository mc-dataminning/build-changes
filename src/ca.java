import com.mojang.serialization.Codec;

public record ca(jv<bur<?>> b) {
   public static final Codec<ca> a = kg.a(mc.z).xmap(ca::new, ca::a);

   public static ca a(js<bur<?>> $$0, bur<?> $$1) {
      return new ca(jv.a($$1.r()));
   }

   public static ca a(js<bur<?>> $$0, axf<bur<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(bur<?> $$0) {
      return $$0.a(this.b);
   }

   public jv<bur<?>> a() {
      return this.b;
   }
}
