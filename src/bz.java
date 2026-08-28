import com.mojang.serialization.Codec;

public record bz(ju<bup<?>> b) {
   public static final Codec<bz> a = kf.a(ma.z).xmap(bz::new, bz::a);

   public static bz a(jr<bup<?>> $$0, bup<?> $$1) {
      return new bz(ju.a($$1.r()));
   }

   public static bz a(jr<bup<?>> $$0, axt<bup<?>> $$1) {
      return new bz($$0.b($$1));
   }

   public boolean a(bup<?> $$0) {
      return $$0.a(this.b);
   }

   public ju<bup<?>> a() {
      return this.b;
   }
}
