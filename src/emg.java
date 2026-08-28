import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emg extends emn {
   public final awk<dff> a;
   public static final MapCodec<emg> b = awk.b(lr.f).xmap(emg::new, $$0 -> $$0.a).fieldOf("value");

   public emg(awk<dff> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public emq.c a(dcg $$0, ja $$1, ja $$2, emq.c $$3, emq.c $$4, emm $$5) {
      return ebe.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected emp<?> a() {
      return emp.n;
   }
}
