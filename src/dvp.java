import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvp(dvp.a b, bfm<crf.c> c) {
   public static final Codec<dvp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvp.a.c.fieldOf("bounding_box").forGetter(dvp::a), bfm.c(crf.c.a).fieldOf("spawns").forGetter(dvp::b)).apply($$0, dvp::new)
   );

   public dvp.a a() {
      return this.b;
   }

   public bfm<crf.c> b() {
      return this.c;
   }

   public static enum a implements asp {
      a("piece"),
      b("full");

      public static final Codec<dvp.a> c = asp.a(dvp.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
