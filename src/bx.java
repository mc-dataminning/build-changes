import com.mojang.serialization.Codec;

public record bx(jm<bsv<?>> b) {
   public static final Codec<bx> a = jx.a(lq.v).xmap(bx::new, bx::a);

   public static bx a(bsv<?> $$0) {
      return new bx(jm.a($$0.r()));
   }

   public static bx a(axb<bsv<?>> $$0) {
      return new bx(lp.g.a($$0));
   }

   public boolean b(bsv<?> $$0) {
      return $$0.a(this.b);
   }

   public jm<bsv<?>> a() {
      return this.b;
   }
}
