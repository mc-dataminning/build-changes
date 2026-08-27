import com.mojang.serialization.Codec;
import java.util.List;

public class duu extends duw {
   public static final Codec<duu> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(duu::new, $$0 -> $$0.b).codec();
   private final float b;

   public duu(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dux<?> a() {
      return dux.c;
   }

   @Override
   public void a(duw.a $$0) {
      atw $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<hx> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ib $$3x : ib.c.a) {
               if ($$1.i() <= 0.25F) {
                  ib $$4 = $$3x.g();
                  hx $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cvh.fC.o().a(cwm.c, Integer.valueOf($$1.a(3))).a(cwm.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
