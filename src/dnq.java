import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnq extends den {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final dtc<drk> b = dsu.by;
   public static final dsv c = dsu.bA;

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drk.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new drd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0 instanceof arf $$3
         ? a($$2, dpl.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dsu.bA).orElse(false)))
         : a($$2, dpl.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dsu.bA).orElse(false)));
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcs.a($$0, $$2, "spawn_data");
   }
}
