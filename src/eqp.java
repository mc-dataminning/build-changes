import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqp(eqp.a b, bsj<dke.c> c) {
   public static final Codec<eqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eqp.a.c.fieldOf("bounding_box").forGetter(eqp::a), bsj.a(dke.c.a).fieldOf("spawns").forGetter(eqp::b)).apply($$0, eqp::new)
   );

   public eqp.a a() {
      return this.b;
   }

   public bsj<dke.c> b() {
      return this.c;
   }

   public static enum a implements bai {
      a("piece"),
      b("full");

      public static final Codec<eqp.a> c = bai.a(eqp.a::values);
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
