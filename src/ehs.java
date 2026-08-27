import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehs(ehs.a b, bok<dck.c> c) {
   public static final Codec<ehs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehs.a.c.fieldOf("bounding_box").forGetter(ehs::a), bok.c(dck.c.a).fieldOf("spawns").forGetter(ehs::b)).apply($$0, ehs::new)
   );

   public ehs.a a() {
      return this.b;
   }

   public bok<dck.c> b() {
      return this.c;
   }

   public static enum a implements ayz {
      a("piece"),
      b("full");

      public static final Codec<ehs.a> c = ayz.a(ehs.a::values);
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
