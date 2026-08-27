import com.mojang.serialization.Codec;
import java.util.List;

public class edo extends edq {
   public static final Codec<edo> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(edo::new, $$0 -> $$0.b).codec();
   private final float b;

   public edo(float $$0) {
      this.b = $$0;
   }

   @Override
   protected edr<?> a() {
      return edr.c;
   }

   @Override
   public void a(edq.a $$0) {
      ayd $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<im> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ir $$3x : ir.c.a) {
               if ($$1.i() <= 0.25F) {
                  ir $$4 = $$3x.g();
                  im $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dcx.fC.n().a(dec.c, Integer.valueOf($$1.a(3))).a(dec.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
