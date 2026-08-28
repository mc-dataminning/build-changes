import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ekr extends eku {
   public static final MapCodec<ekr> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ekr::new, $$0 -> $$0.b);
   private final float b;

   public ekr(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ekv<?> a() {
      return ekv.d;
   }

   @Override
   public void a(eku.a $$0) {
      azg $$1 = $$0.b();
      List<ji> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<ji> $$3 = new ArrayList<>($$2);
            af.c($$3, $$1);
            Optional<ji> $$4 = $$3.stream().filter($$1x -> {
               for (jn $$2x : jn.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(awo.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), djm.cB.m().b(dlf.c, Boolean.valueOf(true)).b(dlf.d, Boolean.valueOf(true)));
            }
         }
      }
   }
}
