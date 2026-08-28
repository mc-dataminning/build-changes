import com.mojang.serialization.Codec;

public record ca(ji<bwo<?>> b) {
   public static final Codec<ca> a = jt.a(mg.B).xmap(ca::new, ca::a);

   public static ca a(jf<bwo<?>> $$0, bwo<?> $$1) {
      return new ca(ji.a($$1.r()));
   }

   public static ca a(jf<bwo<?>> $$0, axr<bwo<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(bwo<?> $$0) {
      return $$0.a(this.b);
   }

   public ji<bwo<?>> a() {
      return this.b;
   }
}
