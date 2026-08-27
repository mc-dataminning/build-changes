import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efo(efo.a b, bmo<dai.c> c) {
   public static final Codec<efo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efo.a.c.fieldOf("bounding_box").forGetter(efo::a), bmo.c(dai.c.a).fieldOf("spawns").forGetter(efo::b)).apply($$0, efo::new)
   );

   public efo.a a() {
      return this.b;
   }

   public bmo<dai.c> b() {
      return this.c;
   }

   public static enum a implements aye {
      a("piece"),
      b("full");

      public static final Codec<efo.a> c = aye.a(efo.a::values);
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
