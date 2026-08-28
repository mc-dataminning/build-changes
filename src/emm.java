import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class emm extends emq {
   public static final MapCodec<emm> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(emm::new, $$0 -> $$0.b);
   private final float b;

   public emm(float $$0) {
      this.b = $$0;
   }

   @Override
   protected emr<?> a() {
      return emr.d;
   }

   @Override
   public void a(emq.a $$0) {
      azs $$1 = $$0.b();
      List<jj> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<jj> $$3 = new ArrayList<>($$2);
            af.c($$3, $$1);
            Optional<jj> $$4 = $$3.stream().filter($$1x -> {
               for (jo $$2x : jo.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(awz.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), dkw.cB.m().b(dmp.c, dzg.b).b(dmp.d, Boolean.valueOf(true)));
            }
         }
      }
   }
}
