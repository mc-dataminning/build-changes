import com.mojang.serialization.Codec;

public record bv(je<bsb<?>> b) {
   public static final Codec<bv> a = jp.a(li.v).xmap(bv::new, bv::a);

   public static bv a(bsb<?> $$0) {
      return new bv(je.a($$0.r()));
   }

   public static bv a(awt<bsb<?>> $$0) {
      return new bv(lh.g.a($$0));
   }

   public boolean b(bsb<?> $$0) {
      return $$0.a(this.b);
   }

   public je<bsb<?>> a() {
      return this.b;
   }
}
