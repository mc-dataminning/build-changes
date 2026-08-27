import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ekf extends ekm {
   public final awg<dde> a;
   public static final Codec<ekf> b = awg.b(le.f).xmap(ekf::new, $$0 -> $$0.a);

   public ekf(awg<dde> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      return dzd.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eko<?> a() {
      return eko.n;
   }
}
