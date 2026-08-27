import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxt(dxt.a b, bhp<ctp.c> c) {
   public static final Codec<dxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxt.a.c.fieldOf("bounding_box").forGetter(dxt::a), bhp.c(ctp.c.a).fieldOf("spawns").forGetter(dxt::b)).apply($$0, dxt::new)
   );

   public dxt.a a() {
      return this.b;
   }

   public bhp<ctp.c> b() {
      return this.c;
   }

   public static enum a implements auk {
      a("piece"),
      b("full");

      public static final Codec<dxt.a> c = auk.a(dxt.a::values);
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
