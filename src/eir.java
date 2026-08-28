import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eir(eir.a b, bpi<ddj.c> c) {
   public static final Codec<eir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eir.a.c.fieldOf("bounding_box").forGetter(eir::a), bpi.c(ddj.c.a).fieldOf("spawns").forGetter(eir::b)).apply($$0, eir::new)
   );

   public eir.a a() {
      return this.b;
   }

   public bpi<ddj.c> b() {
      return this.c;
   }

   public static enum a implements azu {
      a("piece"),
      b("full");

      public static final Codec<eir.a> c = azu.a(eir.a::values);
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
