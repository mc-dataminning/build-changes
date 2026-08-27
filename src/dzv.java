import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzv(dzv.a b, biq<cvi.c> c) {
   public static final Codec<dzv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzv.a.c.fieldOf("bounding_box").forGetter(dzv::a), biq.c(cvi.c.a).fieldOf("spawns").forGetter(dzv::b)).apply($$0, dzv::new)
   );

   public dzv.a a() {
      return this.b;
   }

   public biq<cvi.c> b() {
      return this.c;
   }

   public static enum a implements avl {
      a("piece"),
      b("full");

      public static final Codec<dzv.a> c = avl.a(dzv.a::values);
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
