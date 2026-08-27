import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dve(dve.a b, bfc<cqu.c> c) {
   public static final Codec<dve> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dve.a.c.fieldOf("bounding_box").forGetter(dve::a), bfc.c(cqu.c.a).fieldOf("spawns").forGetter(dve::b)).apply($$0, dve::new)
   );

   public dve.a a() {
      return this.b;
   }

   public bfc<cqu.c> b() {
      return this.c;
   }

   public static enum a implements asf {
      a("piece"),
      b("full");

      public static final Codec<dve.a> c = asf.a(dve.a::values);
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
