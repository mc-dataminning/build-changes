import com.mojang.serialization.Codec;

public record bz(ju<bvq<?>> b) {
   public static final Codec<bz> a = kf.a(mb.z).xmap(bz::new, bz::a);

   public static bz a(jr<bvq<?>> $$0, bvq<?> $$1) {
      return new bz(ju.a($$1.r()));
   }

   public static bz a(jr<bvq<?>> $$0, ayk<bvq<?>> $$1) {
      return new bz($$0.b($$1));
   }

   public boolean a(bvq<?> $$0) {
      return $$0.a(this.b);
   }

   public ju<bvq<?>> a() {
      return this.b;
   }
}
