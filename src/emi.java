import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emi(emi.a b, bqt<dgt.c> c) {
   public static final Codec<emi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emi.a.c.fieldOf("bounding_box").forGetter(emi::a), bqt.c(dgt.c.a).fieldOf("spawns").forGetter(emi::b)).apply($$0, emi::new)
   );

   public emi.a a() {
      return this.b;
   }

   public bqt<dgt.c> b() {
      return this.c;
   }

   public static enum a implements baj {
      a("piece"),
      b("full");

      public static final Codec<emi.a> c = baj.a(emi.a::values);
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
