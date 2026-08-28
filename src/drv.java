import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class drv extends djq {
   public static final MapCodec<drv> a = b(drv::new);

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   protected drv(dxm.d $$0) {
      super($$0);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.j, $$0.C ? dwg::a : dwg::b);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, cxk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhv.a($$0, $$2, "SpawnData");
   }
}
