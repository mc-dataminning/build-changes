import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eri(eri.a b, bso<dkp.c> c) {
   public static final Codec<eri> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eri.a.c.fieldOf("bounding_box").forGetter(eri::a), bso.a(dkp.c.a).fieldOf("spawns").forGetter(eri::b)).apply($$0, eri::new)
   );

   public eri.a a() {
      return this.b;
   }

   public bso<dkp.c> b() {
      return this.c;
   }

   public static enum a implements bak {
      a("piece"),
      b("full");

      public static final Codec<eri.a> c = bak.a(eri.a::values);
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
