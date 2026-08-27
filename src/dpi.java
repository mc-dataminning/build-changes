import com.mojang.serialization.Codec;
import java.util.List;

public class dpi extends dpk {
   public static final Codec<dpi> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dpi::new, $$0 -> $$0.b).codec();
   private final float b;

   public dpi(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dpl<?> a() {
      return dpl.c;
   }

   @Override
   public void a(dpk.a $$0) {
      apf $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<gu> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ha $$3x : ha.c.a) {
               if ($$1.i() <= 0.25F) {
                  ha $$4 = $$3x.g();
                  gu $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cpo.fC.n().a(cqt.b, Integer.valueOf($$1.a(3))).a(cqt.aC, $$3x));
                  }
               }
            }
         });
      }
   }
}
