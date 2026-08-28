import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eip(eip.a b, bpg<ddh.c> c) {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eip.a.c.fieldOf("bounding_box").forGetter(eip::a), bpg.c(ddh.c.a).fieldOf("spawns").forGetter(eip::b)).apply($$0, eip::new)
   );

   public eip.a a() {
      return this.b;
   }

   public bpg<ddh.c> b() {
      return this.c;
   }

   public static enum a implements azs {
      a("piece"),
      b("full");

      public static final Codec<eip.a> c = azs.a(eip.a::values);
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
