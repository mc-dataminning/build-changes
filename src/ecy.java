import com.mojang.serialization.Codec;
import java.util.List;

public class ecy extends eda {
   public static final Codec<ecy> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ecy::new, $$0 -> $$0.b).codec();
   private final float b;

   public ecy(float $$0) {
      this.b = $$0;
   }

   @Override
   protected edb<?> a() {
      return edb.c;
   }

   @Override
   public void a(eda.a $$0) {
      axt $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<id> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ij $$3x : ij.c.a) {
               if ($$1.i() <= 0.25F) {
                  ij $$4 = $$3x.g();
                  id $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dcj.fC.n().a(ddo.c, Integer.valueOf($$1.a(3))).a(ddo.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
