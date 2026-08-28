import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record esu(esu.a b, btm<dly.c> c) {
   public static final Codec<esu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esu.a.c.fieldOf("bounding_box").forGetter(esu::a), btm.a(dly.c.a).fieldOf("spawns").forGetter(esu::b)).apply($$0, esu::new)
   );

   public esu.a a() {
      return this.b;
   }

   public btm<dly.c> b() {
      return this.c;
   }

   public static enum a implements bax {
      a("piece"),
      b("full");

      public static final Codec<esu.a> c = bax.a(esu.a::values);
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
