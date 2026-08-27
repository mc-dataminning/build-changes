import com.mojang.serialization.MapCodec;

public class dbe extends cvi implements ctf {
   public static final MapCodec<dbe> c = b(dbe::new);

   @Override
   public MapCodec<dbe> a() {
      return c;
   }

   public dbe(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return true;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      a($$0, $$2, new cjl(this));
   }
}
