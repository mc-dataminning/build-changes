import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsh(dsh.a b, bcl<cnw.c> c) {
   public static final Codec<dsh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dsh.a.c.fieldOf("bounding_box").forGetter(dsh::a), bcl.c(cnw.c.a).fieldOf("spawns").forGetter(dsh::b)).apply($$0, dsh::new)
   );

   public dsh.a a() {
      return this.b;
   }

   public bcl<cnw.c> b() {
      return this.c;
   }

   public static enum a implements apr {
      a("piece"),
      b("full");

      public static final Codec<dsh.a> c = apr.a(dsh.a::values);
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
