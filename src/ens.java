import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ens(ens.a b, bqv<dhv.c> c) {
   public static final Codec<ens> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ens.a.c.fieldOf("bounding_box").forGetter(ens::a), bqv.c(dhv.c.a).fieldOf("spawns").forGetter(ens::b)).apply($$0, ens::new)
   );

   public ens.a a() {
      return this.b;
   }

   public bqv<dhv.c> b() {
      return this.c;
   }

   public static enum a implements azv {
      a("piece"),
      b("full");

      public static final Codec<ens.a> c = azv.a(ens.a::values);
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
