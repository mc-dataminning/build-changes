import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class eku extends ekx {
   public static final MapCodec<eku> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eku::new, $$0 -> $$0.b);
   private final float b;

   public eku(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eky<?> a() {
      return eky.d;
   }

   @Override
   public void a(ekx.a $$0) {
      azh $$1 = $$0.b();
      List<ji> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<ji> $$3 = new ArrayList<>($$2);
            af.c($$3, $$1);
            Optional<ji> $$4 = $$3.stream().filter($$1x -> {
               for (jn $$2x : jn.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(awp.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), djp.cB.m().b(dli.c, Boolean.valueOf(true)).b(dli.d, Boolean.valueOf(true)));
            }
         }
      }
   }
}
