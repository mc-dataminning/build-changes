import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eiz extends ejb {
   public static final MapCodec<eiz> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eiz::new, $$0 -> $$0.b);
   private final float b;

   public eiz(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ejc<?> a() {
      return ejc.c;
   }

   @Override
   public void a(ejb.a $$0) {
      azr $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<jg> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jl $$3x : jl.c.a) {
               if ($$1.i() <= 0.25F) {
                  jl $$4 = $$3x.g();
                  jg $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dia.fC.m().b(djf.c, Integer.valueOf($$1.a(3))).b(djf.aF, $$3x));
                  }
               }
            }
         });
      }
   }
}
