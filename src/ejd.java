import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejd(ejd.a b, bou<ddr.c> c) {
   public static final Codec<ejd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejd.a.c.fieldOf("bounding_box").forGetter(ejd::a), bou.c(ddr.c.a).fieldOf("spawns").forGetter(ejd::b)).apply($$0, ejd::new)
   );

   public ejd.a a() {
      return this.b;
   }

   public bou<ddr.c> b() {
      return this.c;
   }

   public static enum a implements azc {
      a("piece"),
      b("full");

      public static final Codec<ejd.a> c = azc.a(ejd.a::values);
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
