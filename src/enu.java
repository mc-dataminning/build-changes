import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enu(enu.a b, bqx<dhx.c> c) {
   public static final Codec<enu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enu.a.c.fieldOf("bounding_box").forGetter(enu::a), bqx.c(dhx.c.a).fieldOf("spawns").forGetter(enu::b)).apply($$0, enu::new)
   );

   public enu.a a() {
      return this.b;
   }

   public bqx<dhx.c> b() {
      return this.c;
   }

   public static enum a implements azv {
      a("piece"),
      b("full");

      public static final Codec<enu.a> c = azv.a(enu.a::values);
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
