import com.mojang.serialization.Codec;
import java.util.List;

public class dup extends dur {
   public static final Codec<dup> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dup::new, $$0 -> $$0.b).codec();
   private final float b;

   public dup(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dus<?> a() {
      return dus.c;
   }

   @Override
   public void a(dur.a $$0) {
      ats $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ht> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (hx $$3x : hx.c.a) {
               if ($$1.i() <= 0.25F) {
                  hx $$4 = $$3x.g();
                  ht $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cvc.fC.o().a(cwh.c, Integer.valueOf($$1.a(3))).a(cwh.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
