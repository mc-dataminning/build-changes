import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eor(eor.a b, brv<diw.c> c) {
   public static final Codec<eor> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eor.a.c.fieldOf("bounding_box").forGetter(eor::a), brv.c(diw.c.a).fieldOf("spawns").forGetter(eor::b)).apply($$0, eor::new)
   );

   public eor.a a() {
      return this.b;
   }

   public brv<diw.c> b() {
      return this.c;
   }

   public static enum a implements bba {
      a("piece"),
      b("full");

      public static final Codec<eor.a> c = bba.a(eor.a::values);
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
