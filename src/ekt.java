import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ekt extends ekx {
   public static final MapCodec<ekt> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ekt::new, $$0 -> $$0.b);
   private final float b;

   public ekt(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eky<?> a() {
      return eky.e;
   }

   @Override
   public void a(ekx.a $$0) {
      azh $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ji> $$2 = $$0.c();
         if (!$$2.isEmpty()) {
            int $$3 = $$2.getFirst().v();
            $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
               for (jn $$3x : jn.c.a) {
                  if ($$1.i() <= 0.25F) {
                     jn $$4 = $$3x.g();
                     ji $$5 = $$2x.b($$4.j(), 0, $$4.l());
                     if ($$0.a($$5)) {
                        $$0.a($$5, djp.fX.m().b(dku.c, Integer.valueOf($$1.a(3))).b(dku.aF, $$3x));
                     }
                  }
               }
            });
         }
      }
   }
}
