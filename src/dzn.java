import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzn(dzn.a b, bip<cva.c> c) {
   public static final Codec<dzn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzn.a.c.fieldOf("bounding_box").forGetter(dzn::a), bip.c(cva.c.a).fieldOf("spawns").forGetter(dzn::b)).apply($$0, dzn::new)
   );

   public dzn.a a() {
      return this.b;
   }

   public bip<cva.c> b() {
      return this.c;
   }

   public static enum a implements avk {
      a("piece"),
      b("full");

      public static final Codec<dzn.a> c = avk.a(dzn.a::values);
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
