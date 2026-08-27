import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecn(ecn.a b, bkz<cxp.c> c) {
   public static final Codec<ecn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecn.a.c.fieldOf("bounding_box").forGetter(ecn::a), bkz.c(cxp.c.a).fieldOf("spawns").forGetter(ecn::b)).apply($$0, ecn::new)
   );

   public ecn.a a() {
      return this.b;
   }

   public bkz<cxp.c> b() {
      return this.c;
   }

   public static enum a implements axg {
      a("piece"),
      b("full");

      public static final Codec<ecn.a> c = axg.a(ecn.a::values);
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
