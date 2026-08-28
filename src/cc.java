import com.mojang.serialization.Codec;

public record cc(jk<bxe<?>> b) {
   public static final Codec<cc> a = jv.a(mi.B).xmap(cc::new, cc::a);

   public static cc a(jh<bxe<?>> $$0, bxe<?> $$1) {
      return new cc(jk.a($$1.r()));
   }

   public static cc a(jh<bxe<?>> $$0, axv<bxe<?>> $$1) {
      return new cc($$0.b($$1));
   }

   public boolean a(bxe<?> $$0) {
      return $$0.a(this.b);
   }

   public jk<bxe<?>> a() {
      return this.b;
   }
}
