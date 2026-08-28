import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmj extends dmd implements dmi {
   public static final MapCodec<dmj> a = b(dmj::new);

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(eas.d $$0) {
      super($$0);
   }

   @Override
   public cyl b() {
      return cyl.a;
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.p, dxm::a);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxm $$5) {
         $$3.a($$5);
         $$3.a(awx.ab);
      }

      return bug.a;
   }
}
