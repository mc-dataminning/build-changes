import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxo(dxo.a b, bhl<ctk.c> c) {
   public static final Codec<dxo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxo.a.c.fieldOf("bounding_box").forGetter(dxo::a), bhl.c(ctk.c.a).fieldOf("spawns").forGetter(dxo::b)).apply($$0, dxo::new)
   );

   public dxo.a a() {
      return this.b;
   }

   public bhl<ctk.c> b() {
      return this.c;
   }

   public static enum a implements aug {
      a("piece"),
      b("full");

      public static final Codec<dxo.a> c = aug.a(dxo.a::values);
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
