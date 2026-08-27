import com.mojang.serialization.MapCodec;

public class ddi extends cxn implements cvi {
   public static final MapCodec<ddi> c = b(ddi::new);

   @Override
   public MapCodec<ddi> a() {
      return c;
   }

   public ddi(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return true;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      a($$0, $$2, new clo(this));
   }
}
