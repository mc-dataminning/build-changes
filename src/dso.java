import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dso extends dkg {
   public static final MapCodec<dso> a = b(dso::new);

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   protected dso(dyl.d $$0) {
      super($$0);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.j, $$0.C ? dxd::a : dxd::b);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, cxy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      dik.a($$0, $$2, "SpawnData");
   }
}
