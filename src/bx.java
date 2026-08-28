import com.mojang.serialization.Codec;

public record bx(jm<bsz<?>> b) {
   public static final Codec<bx> a = jx.a(lq.v).xmap(bx::new, bx::a);

   public static bx a(bsz<?> $$0) {
      return new bx(jm.a($$0.r()));
   }

   public static bx a(axe<bsz<?>> $$0) {
      return new bx(lp.g.a($$0));
   }

   public boolean b(bsz<?> $$0) {
      return $$0.a(this.b);
   }

   public jm<bsz<?>> a() {
      return this.b;
   }
}
