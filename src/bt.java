import com.mojang.serialization.Codec;

public record bt(ir<bqg<?>> b) {
   public static final Codec<bt> a = jc.a(ku.v).xmap(bt::new, bt::a);

   public static bt a(bqg<?> $$0) {
      return new bt(ir.a($$0.r()));
   }

   public static bt a(avt<bqg<?>> $$0) {
      return new bt(kt.g.a($$0));
   }

   public boolean b(bqg<?> $$0) {
      return $$0.a(this.b);
   }

   public ir<bqg<?>> a() {
      return this.b;
   }
}
