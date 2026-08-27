import com.mojang.serialization.Codec;

public record bu(ja<brn<?>> b) {
   public static final Codec<bu> a = jl.a(le.v).xmap(bu::new, bu::a);

   public static bu a(brn<?> $$0) {
      return new bu(ja.a($$0.r()));
   }

   public static bu a(awg<brn<?>> $$0) {
      return new bu(ld.g.a($$0));
   }

   public boolean b(brn<?> $$0) {
      return $$0.a(this.b);
   }

   public ja<brn<?>> a() {
      return this.b;
   }
}
