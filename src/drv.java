import com.mojang.serialization.MapCodec;

public class drv extends dlv implements djp {
   public static final MapCodec<drv> c = b(drv::new);

   @Override
   public MapCodec<drv> a() {
      return c;
   }

   public drv(dww.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return true;
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      a($$0, $$2, new cwp(this));
   }
}
