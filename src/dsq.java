import com.mojang.serialization.Codec;
import java.util.List;

public class dsq extends dss {
   public static final Codec<dsq> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dsq::new, $$0 -> $$0.b).codec();
   private final float b;

   public dsq(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dst<?> a() {
      return dst.c;
   }

   @Override
   public void a(dss.a $$0) {
      asc $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<gw> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ha $$3x : ha.c.a) {
               if ($$1.i() <= 0.25F) {
                  ha $$4 = $$3x.g();
                  gw $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, csw.fC.n().a(cub.b, Integer.valueOf($$1.a(3))).a(cub.aC, $$3x));
                  }
               }
            }
         });
      }
   }
}
