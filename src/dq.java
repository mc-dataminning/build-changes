import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends dd<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(aqf $$0, im $$1) {
      double $$2 = $$0.ds() - (double)$$1.u();
      double $$3 = $$0.dy() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bc> b, cs.c c) implements dd.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(dq.a::a), axe.a(cs.c.d, "distance", cs.c.c).forGetter(dq.a::b)).apply($$0, dq.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public cs.c b() {
         return this.c;
      }
   }
}
