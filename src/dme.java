import com.mojang.serialization.MapCodec;

public class dme extends dgi implements ded {
   public static final MapCodec<dme> c = b(dme::new);

   @Override
   public MapCodec<dme> a() {
      return c;
   }

   public dme(drc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return true;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      a($$0, $$2, new ctq(this));
   }
}
