import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emm extends emt {
   public final awm<dfh> a;
   public static final MapCodec<emm> b = awm.b(lr.f).xmap(emm::new, $$0 -> $$0.a).fieldOf("value");

   public emm(awm<dfh> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      return ebk.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected emv<?> a() {
      return emv.n;
   }
}
