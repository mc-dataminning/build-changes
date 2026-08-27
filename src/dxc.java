import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxc(dxc.a b, bhe<ctc.c> c) {
   public static final Codec<dxc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxc.a.c.fieldOf("bounding_box").forGetter(dxc::a), bhe.c(ctc.c.a).fieldOf("spawns").forGetter(dxc::b)).apply($$0, dxc::new)
   );

   public dxc.a a() {
      return this.b;
   }

   public bhe<ctc.c> b() {
      return this.c;
   }

   public static enum a implements aub {
      a("piece"),
      b("full");

      public static final Codec<dxc.a> c = aub.a(dxc.a::values);
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
