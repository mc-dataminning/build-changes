import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ejw extends ekd {
   public final awd<dcv> a;
   public static final Codec<ejw> b = awd.b(ld.f).xmap(ejw::new, $$0 -> $$0.a);

   public ejw(awd<dcv> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      return dyu.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ekf<?> a() {
      return ekf.n;
   }
}
