import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpx extends dhv {
   public static final MapCodec<dpx> a = b(dpx::new);

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   protected dpx(dvn.d $$0) {
      super($$0);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new duh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.j, $$0.C ? duh::a : duh::b);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, cwf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      dga.a($$0, $$2, "SpawnData");
   }
}
