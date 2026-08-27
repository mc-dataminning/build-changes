import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czj extends cyt implements czv {
   public static final MapCodec<czj> c = b(czj::new);

   @Override
   public MapCodec<czj> a() {
      return c;
   }

   protected czj(dhm.d $$0) {
      super($$0, ib.b, ekp.b(), true);
   }

   @Override
   protected cyu c() {
      return (cyu)cvh.mc;
   }

   @Override
   public ecx c_(dhn $$0) {
      return ecy.c.a(false);
   }

   @Override
   protected boolean h(dhn $$0) {
      return this.c().h($$0);
   }

   @Override
   public boolean a(@Nullable cdz $$0, crl $$1, hx $$2, dhn $$3, ecw $$4) {
      return false;
   }

   @Override
   public boolean a(csg $$0, hx $$1, dhn $$2, ecx $$3) {
      return false;
   }
}
