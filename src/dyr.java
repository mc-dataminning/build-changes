import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyr extends dyy {
   public final aqi<csv> a;
   public static final Codec<dyr> b = aqi.b(je.e).xmap(dyr::new, $$0 -> $$0.a);

   public dyr(aqi<csv> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      return dnw.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dza<?> a() {
      return dza.n;
   }
}
