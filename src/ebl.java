import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebl(ebl.a b, bki<cwy.c> c) {
   public static final Codec<ebl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebl.a.c.fieldOf("bounding_box").forGetter(ebl::a), bki.c(cwy.c.a).fieldOf("spawns").forGetter(ebl::b)).apply($$0, ebl::new)
   );

   public ebl.a a() {
      return this.b;
   }

   public bki<cwy.c> b() {
      return this.c;
   }

   public static enum a implements axc {
      a("piece"),
      b("full");

      public static final Codec<ebl.a> c = axc.a(ebl.a::values);
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
