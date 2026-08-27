import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvf(dvf.a b, bfe<cqv.c> c) {
   public static final Codec<dvf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvf.a.c.fieldOf("bounding_box").forGetter(dvf::a), bfe.c(cqv.c.a).fieldOf("spawns").forGetter(dvf::b)).apply($$0, dvf::new)
   );

   public dvf.a a() {
      return this.b;
   }

   public bfe<cqv.c> b() {
      return this.c;
   }

   public static enum a implements ash {
      a("piece"),
      b("full");

      public static final Codec<dvf.a> c = ash.a(dvf.a::values);
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
