import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ek extends dy<ek.a> {
   @Override
   public Codec<ek.a> a() {
      return ek.a.a;
   }

   public void a(aro $$0, jh $$1) {
      double $$2 = $$0.dC() - (double)$$1.u();
      double $$3 = $$0.dI() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bh> b, dj.c c) implements dy.a {
      public static final Codec<ek.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(ek.a::a), dj.c.d.optionalFieldOf("distance", dj.c.c).forGetter(ek.a::b))
               .apply($$0, ek.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public dj.c b() {
         return this.c;
      }
   }
}
