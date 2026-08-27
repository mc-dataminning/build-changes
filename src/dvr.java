import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvr(dvr.a b, bfo<crh.c> c) {
   public static final Codec<dvr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvr.a.c.fieldOf("bounding_box").forGetter(dvr::a), bfo.c(crh.c.a).fieldOf("spawns").forGetter(dvr::b)).apply($$0, dvr::new)
   );

   public dvr.a a() {
      return this.b;
   }

   public bfo<crh.c> b() {
      return this.c;
   }

   public static enum a implements asr {
      a("piece"),
      b("full");

      public static final Codec<dvr.a> c = asr.a(dvr.a::values);
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
