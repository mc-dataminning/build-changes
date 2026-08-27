import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eet extends eev {
   public static final MapCodec<eet> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eet::new, $$0 -> $$0.b);
   private final float b;

   public eet(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eew<?> a() {
      return eew.c;
   }

   @Override
   public void a(eev.a $$0) {
      aym $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<io> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (it $$3x : it.c.a) {
               if ($$1.i() <= 0.25F) {
                  it $$4 = $$3x.g();
                  io $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dec.fC.n().a(dfh.c, Integer.valueOf($$1.a(3))).a(dfh.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
