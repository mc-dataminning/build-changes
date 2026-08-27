import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyt extends dza {
   public final aqj<csx> a;
   public static final Codec<dyt> b = aqj.b(je.e).xmap(dyt::new, $$0 -> $$0.a);

   public dyt(aqj<csx> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      return dny.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dzc<?> a() {
      return dzc.n;
   }
}
