import com.mojang.serialization.Codec;

public record bx(jn<bsn<?>> b) {
   public static final Codec<bx> a = jy.a(lr.z).xmap(bx::new, bx::a);

   public static bx a(bsn<?> $$0) {
      return new bx(jn.a($$0.r()));
   }

   public static bx a(awm<bsn<?>> $$0) {
      return new bx(lq.f.a($$0));
   }

   public boolean b(bsn<?> $$0) {
      return $$0.a(this.b);
   }

   public jn<bsn<?>> a() {
      return this.b;
   }
}
