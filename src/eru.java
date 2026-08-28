import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eru(eru.a b, bsq<dlb.c> c) {
   public static final Codec<eru> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eru.a.c.fieldOf("bounding_box").forGetter(eru::a), bsq.a(dlb.c.a).fieldOf("spawns").forGetter(eru::b)).apply($$0, eru::new)
   );

   public eru.a a() {
      return this.b;
   }

   public bsq<dlb.c> b() {
      return this.c;
   }

   public static enum a implements bak {
      a("piece"),
      b("full");

      public static final Codec<eru.a> c = bak.a(eru.a::values);
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
