import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ely(ely.a b, bqk<dgi.c> c) {
   public static final Codec<ely> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ely.a.c.fieldOf("bounding_box").forGetter(ely::a), bqk.c(dgi.c.a).fieldOf("spawns").forGetter(ely::b)).apply($$0, ely::new)
   );

   public ely.a a() {
      return this.b;
   }

   public bqk<dgi.c> b() {
      return this.c;
   }

   public static enum a implements baf {
      a("piece"),
      b("full");

      public static final Codec<ely.a> c = baf.a(ely.a::values);
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
