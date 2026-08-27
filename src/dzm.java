import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzm(dzm.a b, bio<cuz.c> c) {
   public static final Codec<dzm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzm.a.c.fieldOf("bounding_box").forGetter(dzm::a), bio.c(cuz.c.a).fieldOf("spawns").forGetter(dzm::b)).apply($$0, dzm::new)
   );

   public dzm.a a() {
      return this.b;
   }

   public bio<cuz.c> b() {
      return this.c;
   }

   public static enum a implements avj {
      a("piece"),
      b("full");

      public static final Codec<dzm.a> c = avj.a(dzm.a::values);
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
