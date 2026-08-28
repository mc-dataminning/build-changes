import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ei extends dw<ei.a> {
   @Override
   public Codec<ei.a> a() {
      return ei.a.a;
   }

   public void a(ark $$0, jf $$1) {
      double $$2 = $$0.dx() - (double)$$1.u();
      double $$3 = $$0.dD() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bg> b, dh.c c) implements dw.a {
      public static final Codec<ei.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ei.a::a), dh.c.d.optionalFieldOf("distance", dh.c.c).forGetter(ei.a::b))
               .apply($$0, ei.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public dh.c b() {
         return this.c;
      }
   }
}
