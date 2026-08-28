import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dot extends dob implements dpf {
   public static final MapCodec<dot> c = b(dot::new);

   @Override
   public MapCodec<dot> a() {
      return c;
   }

   protected dot(dxu.d $$0) {
      super($$0, jm.b, fcp.b(), true);
   }

   @Override
   protected doc c() {
      return (doc)dko.mx;
   }

   @Override
   protected etx b_(dxv $$0) {
      return ety.c.a(false);
   }

   @Override
   protected boolean o(dxv $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cpx $$0, dgn $$1, jh $$2, dxv $$3, etw $$4) {
      return false;
   }

   @Override
   public boolean a(dhj $$0, jh $$1, dxv $$2, etx $$3) {
      return false;
   }
}
