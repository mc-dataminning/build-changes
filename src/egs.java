import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class egs extends egz {
   public final avd<daa> a;
   public static final Codec<egs> b = avd.b(kj.f).xmap(egs::new, $$0 -> $$0.a);

   public egs(avd<daa> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      return dvq.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ehb<?> a() {
      return ehb.n;
   }
}
