import com.mojang.serialization.Codec;

public record bx(jn<bsm<?>> b) {
   public static final Codec<bx> a = jy.a(lr.z).xmap(bx::new, bx::a);

   public static bx a(bsm<?> $$0) {
      return new bx(jn.a($$0.r()));
   }

   public static bx a(awm<bsm<?>> $$0) {
      return new bx(lq.f.a($$0));
   }

   public boolean b(bsm<?> $$0) {
      return $$0.a(this.b);
   }

   public jn<bsm<?>> a() {
      return this.b;
   }
}
