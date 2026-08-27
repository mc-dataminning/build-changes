import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgf extends cye {
   public static final MapCodec<dgf> a = b(dgf::new);

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   protected dgf(dli.d $$0) {
      super($$0);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.j, $$0.B ? dkk::a : dkk::b);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, cpd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   public void a(cpd $$0, @Nullable cux $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      cwj.a($$0, $$2, "SpawnData");
   }
}
