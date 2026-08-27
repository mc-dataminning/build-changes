import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwh(dwh.a b, bgp<csj.c> c) {
   public static final Codec<dwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwh.a.c.fieldOf("bounding_box").forGetter(dwh::a), bgp.c(csj.c.a).fieldOf("spawns").forGetter(dwh::b)).apply($$0, dwh::new)
   );

   public dwh.a a() {
      return this.b;
   }

   public bgp<csj.c> b() {
      return this.c;
   }

   public static enum a implements atr {
      a("piece"),
      b("full");

      public static final Codec<dwh.a> c = atr.a(dwh.a::values);
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
