import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eme(eme.a b, bqp<dgo.c> c) {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eme.a.c.fieldOf("bounding_box").forGetter(eme::a), bqp.c(dgo.c.a).fieldOf("spawns").forGetter(eme::b)).apply($$0, eme::new)
   );

   public eme.a a() {
      return this.b;
   }

   public bqp<dgo.c> b() {
      return this.c;
   }

   public static enum a implements bag {
      a("piece"),
      b("full");

      public static final Codec<eme.a> c = bag.a(eme.a::values);
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
