import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eoq(eoq.a b, brj<dio.c> c) {
   public static final Codec<eoq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eoq.a.c.fieldOf("bounding_box").forGetter(eoq::a), brj.a(dio.c.a).fieldOf("spawns").forGetter(eoq::b)).apply($$0, eoq::new)
   );

   public eoq.a a() {
      return this.b;
   }

   public brj<dio.c> b() {
      return this.c;
   }

   public static enum a implements azv {
      a("piece"),
      b("full");

      public static final Codec<eoq.a> c = azv.a(eoq.a::values);
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
