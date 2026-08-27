import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egn(egn.a b, bne<dbf.c> c) {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egn.a.c.fieldOf("bounding_box").forGetter(egn::a), bne.c(dbf.c.a).fieldOf("spawns").forGetter(egn::b)).apply($$0, egn::new)
   );

   public egn.a a() {
      return this.b;
   }

   public bne<dbf.c> b() {
      return this.c;
   }

   public static enum a implements ayq {
      a("piece"),
      b("full");

      public static final Codec<egn.a> c = ayq.a(egn.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
