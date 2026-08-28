import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eml extends emq {
   public static final MapCodec<eml> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(eml::new, $$0 -> $$0.b);
   private final float b;

   public eml(float $$0) {
      this.b = $$0;
   }

   @Override
   protected emr<?> a() {
      return emr.e;
   }

   @Override
   public void a(emq.a $$0) {
      azs $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<jj> $$2 = $$0.c();
         if (!$$2.isEmpty()) {
            int $$3 = $$2.getFirst().v();
            $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
               for (jo $$3x : jo.c.a) {
                  if ($$1.i() <= 0.25F) {
                     jo $$4 = $$3x.g();
                     jj $$5 = $$2x.b($$4.j(), 0, $$4.l());
                     if ($$0.a($$5)) {
                        $$0.a($$5, dkw.fX.m().b(dmb.c, Integer.valueOf($$1.a(3))).b(dmb.e, $$3x));
                     }
                  }
               }
            });
         }
      }
   }
}
