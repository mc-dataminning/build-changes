import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eer extends eet {
   public static final MapCodec<eer> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eer::new, $$0 -> $$0.b);
   private final float b;

   public eer(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eeu<?> a() {
      return eeu.c;
   }

   @Override
   public void a(eet.a $$0) {
      ayk $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<io> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (it $$3x : it.c.a) {
               if ($$1.i() <= 0.25F) {
                  it $$4 = $$3x.g();
                  io $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dea.fC.n().a(dff.c, Integer.valueOf($$1.a(3))).a(dff.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
