import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dy extends dl<dy.a> {
   @Override
   public Codec<dy.a> a() {
      return dy.a.a;
   }

   public void a(arv $$0, iw $$1) {
      double $$2 = $$0.dA() - (double)$$1.u();
      double $$3 = $$0.dG() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bj> b, cx.c c) implements dl.a {
      public static final Codec<dy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(dy.a::a), cx.c.d.optionalFieldOf("distance", cx.c.c).forGetter(dy.a::b))
               .apply($$0, dy.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public cx.c b() {
         return this.c;
      }
   }
}
