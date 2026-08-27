import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvj(dvj.a b, bfs<crl.c> c) {
   public static final Codec<dvj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvj.a.c.fieldOf("bounding_box").forGetter(dvj::a), bfs.c(crl.c.a).fieldOf("spawns").forGetter(dvj::b)).apply($$0, dvj::new)
   );

   public dvj.a a() {
      return this.b;
   }

   public bfs<crl.c> b() {
      return this.c;
   }

   public static enum a implements asu {
      a("piece"),
      b("full");

      public static final Codec<dvj.a> c = asu.a(dvj.a::values);
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
