import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyi extends dyp {
   public final aqa<csm> a;
   public static final Codec<dyi> b = aqa.b(jc.e).xmap(dyi::new, $$0 -> $$0.a);

   public dyi(aqa<csm> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      return dnn.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dyr<?> a() {
      return dyr.n;
   }
}
