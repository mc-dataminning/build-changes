import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class efq extends efs {
   public static final MapCodec<efq> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(efq::new, $$0 -> $$0.b);
   private final float b;

   public efq(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eft<?> a() {
      return eft.c;
   }

   @Override
   public void a(efs.a $$0) {
      azf $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<iz> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (je $$3x : je.c.a) {
               if ($$1.i() <= 0.25F) {
                  je $$4 = $$3x.g();
                  iz $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dez.fC.o().a(dge.c, Integer.valueOf($$1.a(3))).a(dge.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
