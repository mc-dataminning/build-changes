import com.mojang.serialization.Codec;

public record bu(iz<bqr<?>> b) {
   public static final Codec<bu> a = jk.a(ld.v).xmap(bu::new, bu::a);

   public static bu a(bqr<?> $$0) {
      return new bu(iz.a($$0.r()));
   }

   public static bu a(awd<bqr<?>> $$0) {
      return new bu(lc.g.a($$0));
   }

   public boolean b(bqr<?> $$0) {
      return $$0.a(this.b);
   }

   public iz<bqr<?>> a() {
      return this.b;
   }
}
