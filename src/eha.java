import com.mojang.serialization.Codec;
import java.util.List;

public class eha extends ehc {
   public static final Codec<eha> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eha::new, $$0 -> $$0.b).codec();
   private final float b;

   public eha(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ehd<?> a() {
      return ehd.c;
   }

   @Override
   public void a(ehc.a $$0) {
      ayt $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ir> $$2 = $$0.c();
         if (!$$2.isEmpty()) {
            int $$3 = $$2.get(0).v();
            $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
               for (iw $$3x : iw.c.a) {
                  if ($$1.i() <= 0.25F) {
                     iw $$4 = $$3x.g();
                     ir $$5 = $$2x.b($$4.j(), 0, $$4.l());
                     if ($$0.a($$5)) {
                        $$0.a($$5, dfe.gu.n().a(dgj.c, Integer.valueOf($$1.a(3))).a(dgj.aE, $$3x));
                     }
                  }
               }
            });
         }
      }
   }
}
