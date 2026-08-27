import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dh extends cx<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(apg $$0, ib $$1) {
      double $$2 = $$0.dr() - (double)$$1.u();
      double $$3 = $$0.dx() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bc> b, cm.c c) implements cx.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(dh.a::a), awe.a(cm.c.d, "distance", cm.c.c).forGetter(dh.a::b)).apply($$0, dh.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public cm.c b() {
         return this.c;
      }
   }
}
