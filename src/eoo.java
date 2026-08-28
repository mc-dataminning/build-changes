import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class eoo extends eos {
   public static final MapCodec<eoo> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eoo::new, $$0 -> $$0.b);
   private final float b;

   public eoo(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eot<?> a() {
      return eot.d;
   }

   @Override
   public void a(eos.a $$0) {
      azv $$1 = $$0.b();
      List<iv> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<iv> $$3 = new ArrayList<>($$2);
            ag.c($$3, $$1);
            Optional<iv> $$4 = $$3.stream().filter($$1x -> {
               for (jb $$2x : jb.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(axc.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), dmo.cE.m().b(doi.c, ebi.b).b(doi.d, Boolean.valueOf(true)));
            }
         }
      }
   }
}
