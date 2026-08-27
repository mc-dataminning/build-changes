import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dvj extends dvq {
   public final anl<cpn> a;
   public static final Codec<dvj> b = anl.b(jc.e).xmap(dvj::new, $$0 -> $$0.a);

   public dvj(anl<cpn> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
      return dko.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dvs<?> a() {
      return dvs.n;
   }
}
