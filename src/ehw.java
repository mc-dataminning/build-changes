import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ehw extends ehy {
   public static final MapCodec<ehw> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ehw::new, $$0 -> $$0.b);
   private final float b;

   public ehw(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ehz<?> a() {
      return ehz.c;
   }

   @Override
   public void a(ehy.a $$0) {
      azk $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<je> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jj $$3x : jj.c.a) {
               if ($$1.i() <= 0.25F) {
                  jj $$4 = $$3x.g();
                  je $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, dgx.fC.o().b(dic.c, Integer.valueOf($$1.a(3))).b(dic.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
