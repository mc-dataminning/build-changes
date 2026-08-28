import com.mojang.serialization.Codec;

public record bx(jm<bsy<?>> b) {
   public static final Codec<bx> a = jx.a(lq.v).xmap(bx::new, bx::a);

   public static bx a(bsy<?> $$0) {
      return new bx(jm.a($$0.r()));
   }

   public static bx a(axe<bsy<?>> $$0) {
      return new bx(lp.g.a($$0));
   }

   public boolean b(bsy<?> $$0) {
      return $$0.a(this.b);
   }

   public jm<bsy<?>> a() {
      return this.b;
   }
}
