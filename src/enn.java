import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class enn extends ens {
   public static final MapCodec<enn> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(enn::new, $$0 -> $$0.b);
   private final float b;

   public enn(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ent<?> a() {
      return ent.e;
   }

   @Override
   public void a(ens.a $$0) {
      azt $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<iu> $$2 = $$0.c();
         if (!$$2.isEmpty()) {
            int $$3 = $$2.getFirst().v();
            $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
               for (ja $$3x : ja.c.a) {
                  if ($$1.i() <= 0.25F) {
                     ja $$4 = $$3x.g();
                     iu $$5 = $$2x.b($$4.j(), 0, $$4.l());
                     if ($$0.a($$5)) {
                        $$0.a($$5, dlw.fX.m().b(dnb.c, Integer.valueOf($$1.a(3))).b(dnb.e, $$3x));
                     }
                  }
               }
            });
         }
      }
   }
}
