import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eix(eix.a b, bor<ddp.c> c) {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eix.a.c.fieldOf("bounding_box").forGetter(eix::a), bor.c(ddp.c.a).fieldOf("spawns").forGetter(eix::b)).apply($$0, eix::new)
   );

   public eix.a a() {
      return this.b;
   }

   public bor<ddp.c> b() {
      return this.c;
   }

   public static enum a implements ayz {
      a("piece"),
      b("full");

      public static final Codec<eix.a> c = ayz.a(eix.a::values);
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
