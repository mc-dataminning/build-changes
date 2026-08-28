import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ej extends dx<ej.a> {
   @Override
   public Codec<ej.a> a() {
      return ej.a.a;
   }

   public void a(arn $$0, jg $$1) {
      double $$2 = $$0.dC() - (double)$$1.u();
      double $$3 = $$0.dI() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bg> b, di.c c) implements dx.a {
      public static final Codec<ej.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ej.a::a), di.c.d.optionalFieldOf("distance", di.c.c).forGetter(ej.a::b))
               .apply($$0, ej.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public di.c b() {
         return this.c;
      }
   }
}
