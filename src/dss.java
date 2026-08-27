import com.mojang.serialization.Codec;
import java.util.List;

public class dss extends dsu {
   public static final Codec<dss> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dss::new, $$0 -> $$0.b).codec();
   private final float b;

   public dss(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dsv<?> a() {
      return dsv.c;
   }

   @Override
   public void a(dsu.a $$0) {
      ase $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<gw> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (hc $$3x : hc.c.a) {
               if ($$1.i() <= 0.25F) {
                  hc $$4 = $$3x.g();
                  gw $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, csy.fC.n().a(cud.b, Integer.valueOf($$1.a(3))).a(cud.aC, $$3x));
                  }
               }
            }
         });
      }
   }
}
