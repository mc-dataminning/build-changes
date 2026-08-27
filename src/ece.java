import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ece extends ecl {
   public final asg<cvz> a;
   public static final Codec<ece> b = asg.b(kc.f).xmap(ece::new, $$0 -> $$0.a);

   public ece(asg<cvz> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      return drc.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ecn<?> a() {
      return ecn.n;
   }
}
