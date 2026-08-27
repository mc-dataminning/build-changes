import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edj(edj.a b, blq<cyk.c> c) {
   public static final Codec<edj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edj.a.c.fieldOf("bounding_box").forGetter(edj::a), blq.c(cyk.c.a).fieldOf("spawns").forGetter(edj::b)).apply($$0, edj::new)
   );

   public edj.a a() {
      return this.b;
   }

   public blq<cyk.c> b() {
      return this.c;
   }

   public static enum a implements axq {
      a("piece"),
      b("full");

      public static final Codec<edj.a> c = axq.a(edj.a::values);
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
