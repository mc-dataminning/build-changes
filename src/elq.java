import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class elq extends elt {
   public static final MapCodec<elq> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(elq::new, $$0 -> $$0.b);
   private final float b;

   public elq(float $$0) {
      this.b = $$0;
   }

   @Override
   protected elu<?> a() {
      return elu.d;
   }

   @Override
   public void a(elt.a $$0) {
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
               $$0.a($$4.get(), dkn.cB.m().b(dmh.c, dmh.a.b));
            }
         }
      }
   }
}
