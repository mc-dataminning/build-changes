import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class efr extends eft {
   public static final MapCodec<efr> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(efr::new, $$0 -> $$0.b);
   private final float b;

   public efr(float $$0) {
      this.b = $$0;
   }

   @Override
   protected efu<?> a() {
      return efu.c;
   }

   @Override
   public void a(eft.a $$0) {
      azg $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<iz> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (je $$3x : je.c.a) {
               if ($$1.i() <= 0.25F) {
                  je $$4 = $$3x.g();
                  iz $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dfa.fC.o().a(dgf.c, Integer.valueOf($$1.a(3))).a(dgf.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
