import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class end extends enk {
   public final awt<dfw> a;
   public static final MapCodec<end> b = awt.b(lu.f).xmap(end::new, $$0 -> $$0.a).fieldOf("value");

   public end(awt<dfw> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      return eca.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected enm<?> a() {
      return enm.n;
   }
}
