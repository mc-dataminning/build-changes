import com.mojang.serialization.Codec;

public record ca(jw<bwb<?>> b) {
   public static final Codec<ca> a = kh.a(me.z).xmap(ca::new, ca::a);

   public static ca a(jt<bwb<?>> $$0, bwb<?> $$1) {
      return new ca(jw.a($$1.r()));
   }

   public static ca a(jt<bwb<?>> $$0, axp<bwb<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(bwb<?> $$0) {
      return $$0.a(this.b);
   }

   public jw<bwb<?>> a() {
      return this.b;
   }
}
