import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyg extends dyn {
   public final apy<csk> a;
   public static final Codec<dyg> b = apy.b(jd.e).xmap(dyg::new, $$0 -> $$0.a);

   public dyg(apy<csk> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      return dnl.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dyp<?> a() {
      return dyp.n;
   }
}
