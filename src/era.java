import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record era(era.a b, bsm<dkk.c> c) {
   public static final Codec<era> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(era.a.c.fieldOf("bounding_box").forGetter(era::a), bsm.a(dkk.c.a).fieldOf("spawns").forGetter(era::b)).apply($$0, era::new)
   );

   public era.a a() {
      return this.b;
   }

   public bsm<dkk.c> b() {
      return this.c;
   }

   public static enum a implements bak {
      a("piece"),
      b("full");

      public static final Codec<era.a> c = bak.a(era.a::values);
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
