import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyv(dyv.a b, bhz<cuj.c> c) {
   public static final Codec<dyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyv.a.c.fieldOf("bounding_box").forGetter(dyv::a), bhz.c(cuj.c.a).fieldOf("spawns").forGetter(dyv::b)).apply($$0, dyv::new)
   );

   public dyv.a a() {
      return this.b;
   }

   public bhz<cuj.c> b() {
      return this.c;
   }

   public static enum a implements aut {
      a("piece"),
      b("full");

      public static final Codec<dyv.a> c = aut.a(dyv.a::values);
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
