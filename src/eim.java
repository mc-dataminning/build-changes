import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eim(eim.a b, bpd<dde.c> c) {
   public static final Codec<eim> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eim.a.c.fieldOf("bounding_box").forGetter(eim::a), bpd.c(dde.c.a).fieldOf("spawns").forGetter(eim::b)).apply($$0, eim::new)
   );

   public eim.a a() {
      return this.b;
   }

   public bpd<dde.c> b() {
      return this.c;
   }

   public static enum a implements azp {
      a("piece"),
      b("full");

      public static final Codec<eim.a> c = azp.a(eim.a::values);
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
