import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class eno extends ens {
   public static final MapCodec<eno> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eno::new, $$0 -> $$0.b);
   private final float b;

   public eno(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ent<?> a() {
      return ent.d;
   }

   @Override
   public void a(ens.a $$0) {
      azt $$1 = $$0.b();
      List<iu> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<iu> $$3 = new ArrayList<>($$2);
            af.c($$3, $$1);
            Optional<iu> $$4 = $$3.stream().filter($$1x -> {
               for (ja $$2x : ja.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(axa.u))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), dlw.cB.m().b(dnp.c, eai.b).b(dnp.d, Boolean.valueOf(true)));
            }
         }
      }
   }
}
