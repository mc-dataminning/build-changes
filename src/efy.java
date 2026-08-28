import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class efy extends ega {
   public static final MapCodec<efy> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(efy::new, $$0 -> $$0.b);
   private final float b;

   public efy(float $$0) {
      this.b = $$0;
   }

   @Override
   protected egb<?> a() {
      return egb.c;
   }

   @Override
   public void a(ega.a $$0) {
      aym $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ja> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jf $$3x : jf.c.a) {
               if ($$1.i() <= 0.25F) {
                  jf $$4 = $$3x.g();
                  ja $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dfh.fC.o().a(dgm.c, Integer.valueOf($$1.a(3))).a(dgm.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
