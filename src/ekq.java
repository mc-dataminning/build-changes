import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ekq extends eku {
   public static final MapCodec<ekq> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ekq::new, $$0 -> $$0.b);
   private final float b;

   public ekq(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ekv<?> a() {
      return ekv.e;
   }

   @Override
   public void a(eku.a $$0) {
      azg $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ji> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jn $$3x : jn.c.a) {
               if ($$1.i() <= 0.25F) {
                  jn $$4 = $$3x.g();
                  ji $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, djm.fX.m().b(dkr.c, Integer.valueOf($$1.a(3))).b(dkr.aF, $$3x));
                  }
               }
            }
         });
      }
   }
}
