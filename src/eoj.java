import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eoj(eoj.a b, brq<dio.c> c) {
   public static final Codec<eoj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eoj.a.c.fieldOf("bounding_box").forGetter(eoj::a), brq.c(dio.c.a).fieldOf("spawns").forGetter(eoj::b)).apply($$0, eoj::new)
   );

   public eoj.a a() {
      return this.b;
   }

   public brq<dio.c> b() {
      return this.c;
   }

   public static enum a implements bba {
      a("piece"),
      b("full");

      public static final Codec<eoj.a> c = bba.a(eoj.a::values);
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
