import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eje(eje.a b, bov<dds.c> c) {
   public static final Codec<eje> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eje.a.c.fieldOf("bounding_box").forGetter(eje::a), bov.c(dds.c.a).fieldOf("spawns").forGetter(eje::b)).apply($$0, eje::new)
   );

   public eje.a a() {
      return this.b;
   }

   public bov<dds.c> b() {
      return this.c;
   }

   public static enum a implements azc {
      a("piece"),
      b("full");

      public static final Codec<eje.a> c = azc.a(eje.a::values);
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
