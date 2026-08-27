import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecw extends edd {
   public final asw<cwq> a;
   public static final Codec<ecw> b = asw.b(ke.f).xmap(ecw::new, $$0 -> $$0.a);

   public ecw(asw<cwq> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      return dru.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected edf<?> a() {
      return edf.n;
   }
}
