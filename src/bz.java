import com.mojang.serialization.Codec;

public record bz(ju<bvm<?>> b) {
   public static final Codec<bz> a = kf.a(mb.z).xmap(bz::new, bz::a);

   public static bz a(jr<bvm<?>> $$0, bvm<?> $$1) {
      return new bz(ju.a($$1.r()));
   }

   public static bz a(jr<bvm<?>> $$0, ayk<bvm<?>> $$1) {
      return new bz($$0.b($$1));
   }

   public boolean a(bvm<?> $$0) {
      return $$0.a(this.b);
   }

   public ju<bvm<?>> a() {
      return this.b;
   }
}
