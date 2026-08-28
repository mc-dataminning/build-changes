import com.mojang.serialization.Codec;

public record cb(jj<bxc<?>> b) {
   public static final Codec<cb> a = ju.a(mh.B).xmap(cb::new, cb::a);

   public static cb a(jg<bxc<?>> $$0, bxc<?> $$1) {
      return new cb(jj.a($$1.r()));
   }

   public static cb a(jg<bxc<?>> $$0, axt<bxc<?>> $$1) {
      return new cb($$0.b($$1));
   }

   public boolean a(bxc<?> $$0) {
      return $$0.a(this.b);
   }

   public jj<bxc<?>> a() {
      return this.b;
   }
}
