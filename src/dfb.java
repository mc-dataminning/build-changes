import com.mojang.serialization.MapCodec;

public class dfb extends czg implements cxb {
   public static final MapCodec<dfb> c = b(dfb::new);

   @Override
   public MapCodec<dfb> a() {
      return c;
   }

   public dfb(djo.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return true;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      a($$0, $$2, new cng(this));
   }
}
