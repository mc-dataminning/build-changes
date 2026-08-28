import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record erp(erp.a b, bsq<dkw.c> c) {
   public static final Codec<erp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erp.a.c.fieldOf("bounding_box").forGetter(erp::a), bsq.a(dkw.c.a).fieldOf("spawns").forGetter(erp::b)).apply($$0, erp::new)
   );

   public erp.a a() {
      return this.b;
   }

   public bsq<dkw.c> b() {
      return this.c;
   }

   public static enum a implements bak {
      a("piece"),
      b("full");

      public static final Codec<erp.a> c = bak.a(erp.a::values);
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
