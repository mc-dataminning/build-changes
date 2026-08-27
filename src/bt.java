import com.mojang.serialization.Codec;

public record bt(ip<bqb<?>> b) {
   public static final Codec<bt> a = ja.a(ks.u).xmap(bt::new, bt::a);

   public static bt a(bqb<?> $$0) {
      return new bt(ip.a($$0.r()));
   }

   public static bt a(avr<bqb<?>> $$0) {
      return new bt(kr.g.a($$0));
   }

   public boolean b(bqb<?> $$0) {
      return $$0.a(this.b);
   }

   public ip<bqb<?>> a() {
      return this.b;
   }
}
