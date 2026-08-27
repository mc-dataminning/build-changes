import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eka(eka.a b, boo<ddl.c> c) {
   public static final Codec<eka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eka.a.c.fieldOf("bounding_box").forGetter(eka::a), boo.c(ddl.c.a).fieldOf("spawns").forGetter(eka::b)).apply($$0, eka::new)
   );

   public eka.a a() {
      return this.b;
   }

   public boo<ddl.c> b() {
      return this.c;
   }

   public static enum a implements azg {
      a("piece"),
      b("full");

      public static final Codec<eka.a> c = azg.a(eka.a::values);
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
