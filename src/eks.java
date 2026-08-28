import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eks extends ekw {
   public static final MapCodec<eks> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eks::new, $$0 -> $$0.b);
   private final float b;

   public eks(float $$0) {
      this.b = $$0;
   }

   @Override
   protected ekx<?> a() {
      return ekx.e;
   }

   @Override
   public void a(ekw.a $$0) {
      azh $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<ji> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (jn $$3x : jn.c.a) {
               if ($$1.i() <= 0.25F) {
                  jn $$4 = $$3x.g();
                  ji $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, djo.fX.m().b(dkt.c, Integer.valueOf($$1.a(3))).b(dkt.aF, $$3x));
                  }
               }
            }
         });
      }
   }
}
