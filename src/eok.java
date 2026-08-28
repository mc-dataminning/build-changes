import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eok(eok.a b, brm<din.c> c) {
   public static final Codec<eok> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eok.a.c.fieldOf("bounding_box").forGetter(eok::a), brm.c(din.c.a).fieldOf("spawns").forGetter(eok::b)).apply($$0, eok::new)
   );

   public eok.a a() {
      return this.b;
   }

   public brm<din.c> b() {
      return this.c;
   }

   public static enum a implements baq {
      a("piece"),
      b("full");

      public static final Codec<eok.a> c = baq.a(eok.a::values);
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
