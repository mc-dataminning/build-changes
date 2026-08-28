import com.mojang.serialization.MapCodec;

public class drw extends dlw implements djq {
   public static final MapCodec<drw> c = b(drw::new);

   @Override
   public MapCodec<drw> a() {
      return c;
   }

   public drw(dwx.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return true;
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      a($$0, $$2, new cwq(this));
   }
}
