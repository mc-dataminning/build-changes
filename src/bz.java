import com.mojang.serialization.Codec;

public record bz(ju<bvr<?>> b) {
   public static final Codec<bz> a = kf.a(mb.z).xmap(bz::new, bz::a);

   public static bz a(jr<bvr<?>> $$0, bvr<?> $$1) {
      return new bz(ju.a($$1.r()));
   }

   public static bz a(jr<bvr<?>> $$0, ayk<bvr<?>> $$1) {
      return new bz($$0.b($$1));
   }

   public boolean a(bvr<?> $$0) {
      return $$0.a(this.b);
   }

   public ju<bvr<?>> a() {
      return this.b;
   }
}
