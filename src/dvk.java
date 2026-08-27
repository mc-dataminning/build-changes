import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvk(dvk.a b, bfh<cra.c> c) {
   public static final Codec<dvk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvk.a.c.fieldOf("bounding_box").forGetter(dvk::a), bfh.c(cra.c.a).fieldOf("spawns").forGetter(dvk::b)).apply($$0, dvk::new)
   );

   public dvk.a a() {
      return this.b;
   }

   public bfh<cra.c> b() {
      return this.c;
   }

   public static enum a implements ask {
      a("piece"),
      b("full");

      public static final Codec<dvk.a> c = ask.a(dvk.a::values);
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
