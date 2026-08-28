import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dry extends djq {
   public static final MapCodec<dry> a = b(dry::new);

   @Override
   public MapCodec<dry> a() {
      return a;
   }

   protected dry(dxp.d $$0) {
      super($$0);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.j, $$0.C ? dwj::a : dwj::b);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, cxh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhu.a($$0, $$2, "SpawnData");
   }
}
