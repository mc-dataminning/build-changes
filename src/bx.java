import com.mojang.serialization.Codec;

public record bx(jm<bta<?>> b) {
   public static final Codec<bx> a = jx.a(lq.v).xmap(bx::new, bx::a);

   public static bx a(bta<?> $$0) {
      return new bx(jm.a($$0.r()));
   }

   public static bx a(axf<bta<?>> $$0) {
      return new bx(lp.g.a($$0));
   }

   public boolean b(bta<?> $$0) {
      return $$0.a(this.b);
   }

   public jm<bta<?>> a() {
      return this.b;
   }
}
