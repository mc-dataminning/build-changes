import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzg(dzg.a b, bij<cut.c> c) {
   public static final Codec<dzg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzg.a.c.fieldOf("bounding_box").forGetter(dzg::a), bij.c(cut.c.a).fieldOf("spawns").forGetter(dzg::b)).apply($$0, dzg::new)
   );

   public dzg.a a() {
      return this.b;
   }

   public bij<cut.c> b() {
      return this.c;
   }

   public static enum a implements ave {
      a("piece"),
      b("full");

      public static final Codec<dzg.a> c = ave.a(dzg.a::values);
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
