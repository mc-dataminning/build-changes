import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ejf extends ejh {
   public static final MapCodec<ejf> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ejf::new, $$0 -> $$0.b);
   private final float b;

   public ejf(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eji<?> a() {
      return eji.c;
   }

   @Override
   public void a(ejh.a $$0) {
      azs $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<jh> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jm $$3x : jm.c.a) {
               if ($$1.i() <= 0.25F) {
                  jm $$4 = $$3x.g();
                  jh $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dig.fC.m().b(djl.c, Integer.valueOf($$1.a(3))).b(djl.aF, $$3x));
                  }
               }
            }
         });
      }
   }
}
