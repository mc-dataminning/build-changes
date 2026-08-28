import com.mojang.serialization.Codec;

public record ca(ji<bwj<?>> b) {
   public static final Codec<ca> a = jt.a(mg.B).xmap(ca::new, ca::a);

   public static ca a(jf<bwj<?>> $$0, bwj<?> $$1) {
      return new ca(ji.a($$1.r()));
   }

   public static ca a(jf<bwj<?>> $$0, axp<bwj<?>> $$1) {
      return new ca($$0.b($$1));
   }

   public boolean a(bwj<?> $$0) {
      return $$0.a(this.b);
   }

   public ji<bwj<?>> a() {
      return this.b;
   }
}
