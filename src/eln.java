import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eln(eln.a b, bqg<dfw.c> c) {
   public static final Codec<eln> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eln.a.c.fieldOf("bounding_box").forGetter(eln::a), bqg.c(dfw.c.a).fieldOf("spawns").forGetter(eln::b)).apply($$0, eln::new)
   );

   public eln.a a() {
      return this.b;
   }

   public bqg<dfw.c> b() {
      return this.c;
   }

   public static enum a implements bab {
      a("piece"),
      b("full");

      public static final Codec<eln.a> c = bab.a(eln.a::values);
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
