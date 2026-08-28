import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class egu extends egw {
   public static final MapCodec<egu> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(egu::new, $$0 -> $$0.b);
   private final float b;

   public egu(float $$0) {
      this.b = $$0;
   }

   @Override
   protected egx<?> a() {
      return egx.c;
   }

   @Override
   public void a(egw.a $$0) {
      ayv $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<jd> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ji $$3x : ji.c.a) {
               if ($$1.i() <= 0.25F) {
                  ji $$4 = $$3x.g();
                  jd $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dfy.fC.o().a(dhd.c, Integer.valueOf($$1.a(3))).a(dhd.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
