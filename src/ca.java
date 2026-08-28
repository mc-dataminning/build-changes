import com.mojang.serialization.Codec;

public record ca(ji<bwm<?>> b) {
   public static final Codec<ca> a = jt.a(mg.B).xmap(ca::new, ca::a);

   public static ca a(jf<bwm<?>> $$0, bwm<?> $$1) {
      return new ca(ji.a($$1.r()));
   }

   public static ca a(jf<bwm<?>> $$0, axr<bwm<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(bwm<?> $$0) {
      return $$0.a(this.b);
   }

   public ji<bwm<?>> a() {
      return this.b;
   }
}
