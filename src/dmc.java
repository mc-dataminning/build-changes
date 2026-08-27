import com.mojang.serialization.MapCodec;

public class dmc extends dgg implements deb {
   public static final MapCodec<dmc> c = b(dmc::new);

   @Override
   public MapCodec<dmc> a() {
      return c;
   }

   public dmc(dra.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return true;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      a($$0, $$2, new cto(this));
   }
}
