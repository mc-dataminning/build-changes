import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmp extends den {
   public static final MapCodec<dmp> a = b(dmp::new);

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   protected dmp(dsd.d $$0) {
      super($$0);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.j, $$0.B ? dqx::a : dqx::b);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, cur $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcs.a($$0, $$2, "SpawnData");
   }
}
