import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eis(eis.a b, bpj<ddk.c> c) {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eis.a.c.fieldOf("bounding_box").forGetter(eis::a), bpj.c(ddk.c.a).fieldOf("spawns").forGetter(eis::b)).apply($$0, eis::new)
   );

   public eis.a a() {
      return this.b;
   }

   public bpj<ddk.c> b() {
      return this.c;
   }

   public static enum a implements azu {
      a("piece"),
      b("full");

      public static final Codec<eis.a> c = azu.a(eis.a::values);
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
