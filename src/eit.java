import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eit(eit.a b, bpk<ddl.c> c) {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eit.a.c.fieldOf("bounding_box").forGetter(eit::a), bpk.c(ddl.c.a).fieldOf("spawns").forGetter(eit::b)).apply($$0, eit::new)
   );

   public eit.a a() {
      return this.b;
   }

   public bpk<ddl.c> b() {
      return this.c;
   }

   public static enum a implements azu {
      a("piece"),
      b("full");

      public static final Codec<eit.a> c = azu.a(eit.a::values);
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
