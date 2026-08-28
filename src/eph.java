import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class eph extends epl {
   public static final MapCodec<eph> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eph::new, $$0 -> $$0.b);
   private final float b;

   public eph(float $$0) {
      this.b = $$0;
   }

   @Override
   protected epm<?> a() {
      return epm.d;
   }

   @Override
   public void a(epl.a $$0) {
      azx $$1 = $$0.b();
      List<iv> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<iv> $$3 = new ArrayList<>($$2);
            ag.c($$3, $$1);
            Optional<iv> $$4 = $$3.stream().filter($$1x -> {
               for (jb $$2x : jb.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(axe.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), dne.cE.m().b(doy.c, eby.b).b(doy.d, Boolean.valueOf(true)));
            }
         }
      }
   }
}
