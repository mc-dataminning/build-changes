import com.mojang.serialization.MapCodec;

public class dnd extends dhh implements dfc {
   public static final MapCodec<dnd> c = b(dnd::new);

   @Override
   public MapCodec<dnd> a() {
      return c;
   }

   public dnd(dsb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return true;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      a($$0, $$2, new cup(this));
   }
}
