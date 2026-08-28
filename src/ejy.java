import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejy(ejy.a b, bpf<dei.c> c) {
   public static final Codec<ejy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejy.a.c.fieldOf("bounding_box").forGetter(ejy::a), bpf.c(dei.c.a).fieldOf("spawns").forGetter(ejy::b)).apply($$0, ejy::new)
   );

   public ejy.a a() {
      return this.b;
   }

   public bpf<dei.c> b() {
      return this.c;
   }

   public static enum a implements azk {
      a("piece"),
      b("full");

      public static final Codec<ejy.a> c = azk.a(ejy.a::values);
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
