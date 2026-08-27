import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgs extends cyr {
   public static final MapCodec<dgs> a = b(dgs::new);

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   protected dgs(dmd.d $$0) {
      super($$0);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dky($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.j, $$0.B ? dky::a : dky::b);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, cpq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   public void a(cpq $$0, @Nullable cvk $$1, List<vs> $$2, crh $$3, @Nullable iy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cww.a($$0, $$2, "SpawnData");
   }
}
