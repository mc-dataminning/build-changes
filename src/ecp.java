import com.mojang.serialization.Codec;
import java.util.List;

public class ecp extends ecr {
   public static final Codec<ecp> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ecp::new, $$0 -> $$0.b).codec();
   private final float b;

   public ecp(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ecs<?> a() {
      return ecs.c;
   }

   @Override
   public void a(ecr.a $$0) {
      axr $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ib> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ih $$3x : ih.c.a) {
               if ($$1.i() <= 0.25F) {
                  ih $$4 = $$3x.g();
                  ib $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dca.fC.n().a(ddf.c, Integer.valueOf($$1.a(3))).a(ddf.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
