import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eio extends eiq {
   public static final MapCodec<eio> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eio::new, $$0 -> $$0.b);
   private final float b;

   public eio(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eir<?> a() {
      return eir.c;
   }

   @Override
   public void a(eiq.a $$0) {
      azn $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<jf> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jk $$3x : jk.c.a) {
               if ($$1.i() <= 0.25F) {
                  jk $$4 = $$3x.g();
                  jf $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dho.fC.n().b(dit.c, Integer.valueOf($$1.a(3))).b(dit.aF, $$3x));
                  }
               }
            }
         });
      }
   }
}
