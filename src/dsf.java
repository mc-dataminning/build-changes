import com.mojang.serialization.Codec;
import java.util.List;

public class dsf extends dsh {
   public static final Codec<dsf> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dsf::new, $$0 -> $$0.b).codec();
   private final float b;

   public dsf(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dsi<?> a() {
      return dsi.c;
   }

   @Override
   public void a(dsh.a $$0) {
      art $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<gv> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (hb $$3x : hb.c.a) {
               if ($$1.i() <= 0.25F) {
                  hb $$4 = $$3x.g();
                  gv $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, csl.fC.n().a(ctq.b, Integer.valueOf($$1.a(3))).a(ctq.aC, $$3x));
                  }
               }
            }
         });
      }
   }
}
