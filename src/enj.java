import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class enj extends enq {
   public final awt<dfc> a;
   public static final Codec<enj> b = awt.b(li.f).xmap(enj::new, $$0 -> $$0.a);

   public enj(awt<dfc> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ent.c a(dcd $$0, ir $$1, ir $$2, ent.c $$3, ent.c $$4, enp $$5) {
      return eca.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ens<?> a() {
      return ens.n;
   }
}
