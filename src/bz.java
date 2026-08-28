import com.mojang.serialization.Codec;

public record bz(ju<bul<?>> b) {
   public static final Codec<bz> a = kf.a(lz.z).xmap(bz::new, bz::a);

   public static bz a(jr<bul<?>> $$0, bul<?> $$1) {
      return new bz(ju.a($$1.r()));
   }

   public static bz a(jr<bul<?>> $$0, axq<bul<?>> $$1) {
      return new bz($$0.b($$1));
   }

   public boolean a(bul<?> $$0) {
      return $$0.a(this.b);
   }

   public ju<bul<?>> a() {
      return this.b;
   }
}
