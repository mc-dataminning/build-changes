import com.mojang.serialization.Codec;
import java.util.List;

public class dww extends dwy {
   public static final Codec<dww> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dww::new, $$0 -> $$0.b).codec();
   private final float b;

   public dww(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dwz<?> a() {
      return dwz.c;
   }

   @Override
   public void a(dwy.a $$0) {
      auw $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<hx> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ic $$3x : ic.c.a) {
               if ($$1.i() <= 0.25F) {
                  ic $$4 = $$3x.g();
                  hx $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cxa.fC.o().a(cyf.c, Integer.valueOf($$1.a(3))).a(cyf.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
