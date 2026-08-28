import com.mojang.serialization.Codec;

public enum bvh implements bam {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bvh> d = bam.a(bvh::values);
   private final String e;

   private bvh(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
