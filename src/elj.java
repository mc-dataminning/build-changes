import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class elj extends eln {
   public static final MapCodec<elj> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(elj::new, $$0 -> $$0.b);
   private final float b;

   public elj(float $$0) {
      this.b = $$0;
   }

   @Override
   protected elo<?> a() {
      return elo.e;
   }

   @Override
   public void a(eln.a $$0) {
      bac $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<jh> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jm $$3x : jm.c.a) {
               if ($$1.i() <= 0.25F) {
                  jm $$4 = $$3x.g();
                  jh $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dkf.fX.m().b(dlk.c, Integer.valueOf($$1.a(3))).b(dlk.aF, $$3x));
                  }
               }
            }
         });
      }
   }
}
