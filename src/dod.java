import com.mojang.serialization.MapCodec;

public class dod extends dig implements dgb {
   public static final MapCodec<dod> c = b(dod::new);

   @Override
   public MapCodec<dod> a() {
      return c;
   }

   public dod(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      a($$0, $$2, new cuq(this));
   }
}
