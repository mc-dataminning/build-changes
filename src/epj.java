import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epj extends epq {
   public final axp<dhy> a;
   public static final MapCodec<epj> b = axp.b(ly.f).xmap(epj::new, $$0 -> $$0.a).fieldOf("value");

   public epj(axp<dhy> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      return eef.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eps<?> a() {
      return eps.n;
   }
}
