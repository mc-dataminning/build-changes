import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dne extends den {
   public static final MapCodec<dne> a = b(dne::new);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   protected dne(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.k, $$0.C ? drv::a : drv::b);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, cuh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   public void a(cuh $$0, @Nullable dbg $$1, List<xe> $$2, cwi $$3, @Nullable jo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcs.a($$0, $$2, "SpawnData");
   }
}
