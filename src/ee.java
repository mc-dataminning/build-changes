import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ee extends ds<ee.a> {
   @Override
   public Codec<ee.a> a() {
      return ee.a.a;
   }

   public void a(aql $$0, ja $$1) {
      double $$2 = $$0.du() - (double)$$1.u();
      double $$3 = $$0.dA() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bf> b, de.c c) implements ds.a {
      public static final Codec<ee.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ee.a::a), de.c.d.optionalFieldOf("distance", de.c.c).forGetter(ee.a::b))
               .apply($$0, ee.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public de.c b() {
         return this.c;
      }
   }
}
