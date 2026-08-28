import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class elj extends elm {
   public static final MapCodec<elj> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(elj::new, $$0 -> $$0.b);
   private final float b;

   public elj(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eln<?> a() {
      return eln.d;
   }

   @Override
   public void a(elm.a $$0) {
      bam $$1 = $$0.b();
      List<jh> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<jh> $$3 = new ArrayList<>($$2);
            ae.c($$3, $$1);
            Optional<jh> $$4 = $$3.stream().filter($$1x -> {
               for (jm $$2x : jm.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(axu.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), dkg.cB.m().b(dma.c, dma.a.b));
            }
         }
      }
   }
}
