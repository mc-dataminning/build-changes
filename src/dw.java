import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dw extends dj<dw.a> {
   @Override
   public Codec<dw.a> a() {
      return dw.a.a;
   }

   public void a(arp $$0, iu $$1) {
      double $$2 = $$0.dA() - (double)$$1.u();
      double $$3 = $$0.dG() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bi> b, cv.c c) implements dj.a {
      public static final Codec<dw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dw.a::a), cv.c.d.optionalFieldOf("distance", cv.c.c).forGetter(dw.a::b))
               .apply($$0, dw.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public cv.c b() {
         return this.c;
      }
   }
}
