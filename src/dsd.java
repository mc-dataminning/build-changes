import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsd extends djy {
   public static final MapCodec<dsd> a = b(dsd::new);

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   protected dsd(dxu.d $$0) {
      super($$0);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.j, $$0.C ? dwo::a : dwo::b);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, cxp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      did.a($$0, $$2, "SpawnData");
   }
}
