import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class enj extends enq {
   public final awu<dfy> a;
   public static final MapCodec<enj> b = awu.b(lu.f).xmap(enj::new, $$0 -> $$0.a).fieldOf("value");

   public enj(awu<dfy> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ent.c a(dcz $$0, jd $$1, jd $$2, ent.c $$3, ent.c $$4, enp $$5) {
      return ece.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ens<?> a() {
      return ens.n;
   }
}
