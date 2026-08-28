import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejt(ejt.a b, bpe<deg.c> c) {
   public static final Codec<ejt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejt.a.c.fieldOf("bounding_box").forGetter(ejt::a), bpe.c(deg.c.a).fieldOf("spawns").forGetter(ejt::b)).apply($$0, ejt::new)
   );

   public ejt.a a() {
      return this.b;
   }

   public bpe<deg.c> b() {
      return this.c;
   }

   public static enum a implements azj {
      a("piece"),
      b("full");

      public static final Codec<ejt.a> c = azj.a(ejt.a::values);
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
