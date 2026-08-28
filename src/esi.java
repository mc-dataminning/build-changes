import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record esi(esi.a b, btb<dlm.c> c) {
   public static final Codec<esi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esi.a.c.fieldOf("bounding_box").forGetter(esi::a), btb.a(dlm.c.a).fieldOf("spawns").forGetter(esi::b)).apply($$0, esi::new)
   );

   public esi.a a() {
      return this.b;
   }

   public btb<dlm.c> b() {
      return this.c;
   }

   public static enum a implements bam {
      a("piece"),
      b("full");

      public static final Codec<esi.a> c = bam.a(esi.a::values);
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
