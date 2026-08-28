import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elj(elj.a b, bqd<dft.c> c) {
   public static final Codec<elj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elj.a.c.fieldOf("bounding_box").forGetter(elj::a), bqd.c(dft.c.a).fieldOf("spawns").forGetter(elj::b)).apply($$0, elj::new)
   );

   public elj.a a() {
      return this.b;
   }

   public bqd<dft.c> b() {
      return this.c;
   }

   public static enum a implements azz {
      a("piece"),
      b("full");

      public static final Codec<elj.a> c = azz.a(elj.a::values);
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
