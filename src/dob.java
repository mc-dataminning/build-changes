import com.mojang.serialization.MapCodec;

public class dob extends die implements dfz {
   public static final MapCodec<dob> c = b(dob::new);

   @Override
   public MapCodec<dob> a() {
      return c;
   }

   public dob(dsz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return true;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      a($$0, $$2, new cuo(this));
   }
}
