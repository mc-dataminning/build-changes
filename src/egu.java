import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class egu extends ehb {
   public final avd<dac> a;
   public static final Codec<egu> b = avd.b(kj.f).xmap(egu::new, $$0 -> $$0.a);

   public egu(avd<dac> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      return dvs.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ehd<?> a() {
      return ehd.n;
   }
}
