import com.mojang.serialization.Codec;
import java.util.List;

public class eak extends eam {
   public static final Codec<eak> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eak::new, $$0 -> $$0.b).codec();
   private final float b;

   public eak(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ean<?> a() {
      return ean.c;
   }

   @Override
   public void a(eam.a $$0) {
      axd $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ib> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ih $$3x : ih.c.a) {
               if ($$1.i() <= 0.25F) {
                  ih $$4 = $$3x.g();
                  ib $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dac.fC.o().a(dbh.c, Integer.valueOf($$1.a(3))).a(dbh.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
