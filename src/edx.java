import com.mojang.serialization.Codec;
import java.util.List;

public class edx extends edz {
   public static final Codec<edx> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(edx::new, $$0 -> $$0.b).codec();
   private final float b;

   public edx(float $$0) {
      this.b = $$0;
   }

   @Override
   protected eea<?> a() {
      return eea.c;
   }

   @Override
   public void a(edz.a $$0) {
      ayg $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<in> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (is $$3x : is.c.a) {
               if ($$1.i() <= 0.25F) {
                  is $$4 = $$3x.g();
                  in $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, ddg.fC.n().a(del.c, Integer.valueOf($$1.a(3))).a(del.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
