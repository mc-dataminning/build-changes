import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eps extends epx {
   public static final MapCodec<eps> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eps::new, $$0 -> $$0.b);
   private final float b;

   public eps(float $$0) {
      this.b = $$0;
   }

   @Override
   protected epy<?> a() {
      return epy.e;
   }

   @Override
   public void a(epx.a $$0) {
      bai $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<iw> $$2 = $$0.c();
         if (!$$2.isEmpty()) {
            int $$3 = $$2.getFirst().v();
            $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
               for (jc $$3x : jc.c.a) {
                  if ($$1.i() <= 0.25F) {
                     jc $$4 = $$3x.g();
                     iw $$5 = $$2x.b($$4.j(), 0, $$4.l());
                     if ($$0.a($$5)) {
                        $$0.a($$5, dnq.gb.m().b(dow.c, Integer.valueOf($$1.a(3))).b(dow.e, $$3x));
                     }
                  }
               }
            });
         }
      }
   }
}
