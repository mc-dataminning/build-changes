import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiq(eiq.a b, bph<ddi.c> c) {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiq.a.c.fieldOf("bounding_box").forGetter(eiq::a), bph.c(ddi.c.a).fieldOf("spawns").forGetter(eiq::b)).apply($$0, eiq::new)
   );

   public eiq.a a() {
      return this.b;
   }

   public bph<ddi.c> b() {
      return this.c;
   }

   public static enum a implements azt {
      a("piece"),
      b("full");

      public static final Codec<eiq.a> c = azt.a(eiq.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
