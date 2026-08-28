import com.mojang.serialization.Codec;

public record cb(jj<bwr<?>> b) {
   public static final Codec<cb> a = ju.a(mh.B).xmap(cb::new, cb::a);

   public static cb a(jg<bwr<?>> $$0, bwr<?> $$1) {
      return new cb(jj.a($$1.r()));
   }

   public static cb a(jg<bwr<?>> $$0, axr<bwr<?>> $$1) {
      return new cb($$0.b($$1));
   }

   public boolean a(bwr<?> $$0) {
      return $$0.a(this.b);
   }

   public jj<bwr<?>> a() {
      return this.b;
   }
}
