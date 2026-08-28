import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmi extends deg {
   public static final MapCodec<dmi> a = b(dmi::new);

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   protected dmi(drw.d $$0) {
      super($$0);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.j, $$0.B ? dqq::a : dqq::b);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, cuk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcl.a($$0, $$2, "SpawnData");
   }
}
