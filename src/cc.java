import com.mojang.serialization.Codec;

public record cc(jk<bxn<?>> b) {
   public static final Codec<cc> a = jv.a(mi.B).xmap(cc::new, cc::a);

   public static cc a(jh<bxn<?>> $$0, bxn<?> $$1) {
      return new cc(jk.a($$1.r()));
   }

   public static cc a(jh<bxn<?>> $$0, ayc<bxn<?>> $$1) {
      return new cc($$0.b($$1));
   }

   public boolean a(bxn<?> $$0) {
      return $$0.a(this.b);
   }

   public jk<bxn<?>> a() {
      return this.b;
   }
}
