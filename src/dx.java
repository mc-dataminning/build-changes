import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dx extends dk<dx.a> {
   @Override
   public Codec<dx.a> a() {
      return dx.a.a;
   }

   public void a(art $$0, iv $$1) {
      double $$2 = $$0.dA() - (double)$$1.u();
      double $$3 = $$0.dG() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bj> b, cw.c c) implements dk.a {
      public static final Codec<dx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(dx.a::a), cw.c.d.optionalFieldOf("distance", cw.c.c).forGetter(dx.a::b))
               .apply($$0, dx.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public cw.c b() {
         return this.c;
      }
   }
}
