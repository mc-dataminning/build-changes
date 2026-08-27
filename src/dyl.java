import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyl extends dys {
   public final aqk<ctc> a;
   public static final Codec<dyl> b = aqk.b(jc.e).xmap(dyl::new, $$0 -> $$0.a);

   public dyl(aqk<ctc> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      return dnq.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dyu<?> a() {
      return dyu.n;
   }
}
