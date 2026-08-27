import com.mojang.serialization.Codec;

public record bu(jb<bsc<?>> b) {
   public static final Codec<bu> a = jm.a(lf.v).xmap(bu::new, bu::a);

   public static bu a(bsc<?> $$0) {
      return new bu(jb.a($$0.r()));
   }

   public static bu a(awm<bsc<?>> $$0) {
      return new bu(le.g.a($$0));
   }

   public boolean b(bsc<?> $$0) {
      return $$0.a(this.b);
   }

   public jb<bsc<?>> a() {
      return this.b;
   }
}
