import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eix extends eje {
   public final avr<dby> a;
   public static final Codec<eix> b = avr.b(ks.f).xmap(eix::new, $$0 -> $$0.a);

   public eix(avr<dby> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      return dxv.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ejg<?> a() {
      return ejg.n;
   }
}
