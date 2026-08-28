import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class enz extends eod {
   public static final MapCodec<enz> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(enz::new, $$0 -> $$0.b);
   private final float b;

   public enz(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eoe<?> a() {
      return eoe.d;
   }

   @Override
   public void a(eod.a $$0) {
      azv $$1 = $$0.b();
      List<iu> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<iu> $$3 = new ArrayList<>($$2);
            af.c($$3, $$1);
            Optional<iu> $$4 = $$3.stream().filter($$1x -> {
               for (ja $$2x : ja.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(axc.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), dmc.cC.m().b(dnv.c, eat.b).b(dnv.d, Boolean.valueOf(true)));
            }
         }
      }
   }
}
