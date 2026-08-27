import com.mojang.serialization.Codec;
import java.util.List;

public class dsl extends dsn {
   public static final Codec<dsl> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dsl::new, $$0 -> $$0.b).codec();
   private final float b;

   public dsl(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dso<?> a() {
      return dso.c;
   }

   @Override
   public void a(dsn.a $$0) {
      arx $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<gw> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (hc $$3x : hc.c.a) {
               if ($$1.i() <= 0.25F) {
                  hc $$4 = $$3x.g();
                  gw $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, csr.fC.n().a(ctw.b, Integer.valueOf($$1.a(3))).a(ctw.aC, $$3x));
                  }
               }
            }
         });
      }
   }
}
