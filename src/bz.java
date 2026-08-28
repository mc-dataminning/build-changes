import com.mojang.serialization.Codec;

public record bz(ju<bvi<?>> b) {
   public static final Codec<bz> a = kf.a(mb.z).xmap(bz::new, bz::a);

   public static bz a(jr<bvi<?>> $$0, bvi<?> $$1) {
      return new bz(ju.a($$1.r()));
   }

   public static bz a(jr<bvi<?>> $$0, aya<bvi<?>> $$1) {
      return new bz($$0.b($$1));
   }

   public boolean a(bvi<?> $$0) {
      return $$0.a(this.b);
   }

   public ju<bvi<?>> a() {
      return this.b;
   }
}
