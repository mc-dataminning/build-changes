import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record epn(epn.a b, bsb<dje.c> c) {
   public static final Codec<epn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epn.a.c.fieldOf("bounding_box").forGetter(epn::a), bsb.a(dje.c.a).fieldOf("spawns").forGetter(epn::b)).apply($$0, epn::new)
   );

   public epn.a a() {
      return this.b;
   }

   public bsb<dje.c> b() {
      return this.c;
   }

   public static enum a implements bag {
      a("piece"),
      b("full");

      public static final Codec<epn.a> c = bag.a(epn.a::values);
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
