import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class drw extends djp {
   public static final MapCodec<drw> a = b(drw::new);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   protected drw(dxn.d $$0) {
      super($$0);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.j, $$0.C ? dwh::a : dwh::b);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, cxg $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhu.a($$0, $$2, "SpawnData");
   }
}
