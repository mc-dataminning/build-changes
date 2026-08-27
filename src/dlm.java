import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlm extends ddk {
   public static final MapCodec<dlm> a = b(dlm::new);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(dra.d $$0) {
      super($$0);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.j, $$0.B ? dpu::a : dpu::b);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, cto $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   public void a(cto $$0, @Nullable dad $$1, List<wx> $$2, cvh $$3, @Nullable jl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dbp.a($$0, $$2, "SpawnData");
   }
}
