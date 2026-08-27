import com.mojang.serialization.Codec;
import java.util.List;

public class dzo extends dzq {
   public static final Codec<dzo> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dzo::new, $$0 -> $$0.b).codec();
   private final float b;

   public dzo(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dzr<?> a() {
      return dzr.c;
   }

   @Override
   public void a(dzq.a $$0) {
      awt $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ib> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ih $$3x : ih.c.a) {
               if ($$1.i() <= 0.25F) {
                  ih $$4 = $$3x.g();
                  ib $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, czh.fC.o().a(dam.c, Integer.valueOf($$1.a(3))).a(dam.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
