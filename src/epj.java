import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class epj extends epn {
   public static final MapCodec<epj> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(epj::new, $$0 -> $$0.b);
   private final float b;

   public epj(float $$0) {
      this.b = $$0;
   }

   @Override
   protected epo<?> a() {
      return epo.d;
   }

   @Override
   public void a(epn.a $$0) {
      azz $$1 = $$0.b();
      List<iw> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<iw> $$3 = new ArrayList<>($$2);
            ag.c($$3, $$1);
            Optional<iw> $$4 = $$3.stream().filter($$1x -> {
               for (jc $$2x : jc.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(axg.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), dng.cE.m().b(dpa.c, eca.b).b(dpa.d, Boolean.valueOf(true)));
            }
         }
      }
   }
}
