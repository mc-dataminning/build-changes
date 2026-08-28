import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ent(ent.a b, bqw<dhw.c> c) {
   public static final Codec<ent> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ent.a.c.fieldOf("bounding_box").forGetter(ent::a), bqw.c(dhw.c.a).fieldOf("spawns").forGetter(ent::b)).apply($$0, ent::new)
   );

   public ent.a a() {
      return this.b;
   }

   public bqw<dhw.c> b() {
      return this.c;
   }

   public static enum a implements azv {
      a("piece"),
      b("full");

      public static final Codec<ent.a> c = azv.a(ent.a::values);
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
