import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehq(ehq.a b, boi<dci.c> c) {
   public static final Codec<ehq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehq.a.c.fieldOf("bounding_box").forGetter(ehq::a), boi.c(dci.c.a).fieldOf("spawns").forGetter(ehq::b)).apply($$0, ehq::new)
   );

   public ehq.a a() {
      return this.b;
   }

   public boi<dci.c> b() {
      return this.c;
   }

   public static enum a implements ayx {
      a("piece"),
      b("full");

      public static final Codec<ehq.a> c = ayx.a(ehq.a::values);
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
