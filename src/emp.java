import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emp(emp.a b, bqw<dha.c> c) {
   public static final Codec<emp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emp.a.c.fieldOf("bounding_box").forGetter(emp::a), bqw.c(dha.c.a).fieldOf("spawns").forGetter(emp::b)).apply($$0, emp::new)
   );

   public emp.a a() {
      return this.b;
   }

   public bqw<dha.c> b() {
      return this.c;
   }

   public static enum a implements bai {
      a("piece"),
      b("full");

      public static final Codec<emp.a> c = bai.a(emp.a::values);
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
