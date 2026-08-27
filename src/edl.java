import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edl(edl.a b, blr<cym.c> c) {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edl.a.c.fieldOf("bounding_box").forGetter(edl::a), blr.c(cym.c.a).fieldOf("spawns").forGetter(edl::b)).apply($$0, edl::new)
   );

   public edl.a a() {
      return this.b;
   }

   public blr<cym.c> b() {
      return this.c;
   }

   public static enum a implements axq {
      a("piece"),
      b("full");

      public static final Codec<edl.a> c = axq.a(edl.a::values);
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
