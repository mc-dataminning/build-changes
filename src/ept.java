import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ept extends eqa {
   public final axt<dij> a;
   public static final MapCodec<ept> b = axt.b(ma.f).xmap(ept::new, $$0 -> $$0.a).fieldOf("value");

   public ept(axt<dij> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      return eep.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected eqc<?> a() {
      return eqc.n;
   }
}
