import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class egf extends egh {
   public static final MapCodec<egf> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(egf::new, $$0 -> $$0.b);
   private final float b;

   public egf(float $$0) {
      this.b = $$0;
   }

   @Override
   protected egi<?> a() {
      return egi.c;
   }

   @Override
   public void a(egh.a $$0) {
      ayo $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ja> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jf $$3x : jf.c.a) {
               if ($$1.i() <= 0.25F) {
                  jf $$4 = $$3x.g();
                  ja $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dfk.fC.o().a(dgp.c, Integer.valueOf($$1.a(3))).a(dgp.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
