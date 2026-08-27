import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvg(dvg.a b, bfe<cqw.c> c) {
   public static final Codec<dvg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvg.a.c.fieldOf("bounding_box").forGetter(dvg::a), bfe.c(cqw.c.a).fieldOf("spawns").forGetter(dvg::b)).apply($$0, dvg::new)
   );

   public dvg.a a() {
      return this.b;
   }

   public bfe<cqw.c> b() {
      return this.c;
   }

   public static enum a implements ash {
      a("piece"),
      b("full");

      public static final Codec<dvg.a> c = ash.a(dvg.a::values);
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
