import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class di extends cx<di.a> {
   @Override
   public Codec<di.a> a() {
      return di.a.a;
   }

   public void a(apv $$0, id $$1) {
      double $$2 = $$0.dr() - (double)$$1.u();
      double $$3 = $$0.dx() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bc> b, cm.c c) implements cx.a {
      public static final Codec<di.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(di.a::a), awu.a(cm.c.d, "distance", cm.c.c).forGetter(di.a::b)).apply($$0, di.a::new)
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
