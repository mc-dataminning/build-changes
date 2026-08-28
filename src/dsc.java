import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsc extends djx {
   public static final MapCodec<dsc> a = b(dsc::new);

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   protected dsc(dxt.d $$0) {
      super($$0);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.j, $$0.C ? dwn::a : dwn::b);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, cxo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dic.a($$0, $$2, "SpawnData");
   }
}
