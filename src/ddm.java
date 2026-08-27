import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ddm extends cvl {
   public static final MapCodec<ddm> a = b(ddm::new);

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   protected ddm(dio.d $$0) {
      super($$0);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.j, $$0.B ? dhq::a : dhq::b);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, cmh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public void a(cmh $$0, @Nullable cse $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      ctq.a($$0, $$2, "SpawnData");
   }
}
