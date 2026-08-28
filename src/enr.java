import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enr(enr.a b, bqu<dhu.c> c) {
   public static final Codec<enr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enr.a.c.fieldOf("bounding_box").forGetter(enr::a), bqu.c(dhu.c.a).fieldOf("spawns").forGetter(enr::b)).apply($$0, enr::new)
   );

   public enr.a a() {
      return this.b;
   }

   public bqu<dhu.c> b() {
      return this.c;
   }

   public static enum a implements azu {
      a("piece"),
      b("full");

      public static final Codec<enr.a> c = azu.a(enr.a::values);
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
