import com.mojang.serialization.MapCodec;

public class dkb extends djr implements dfk {
   public static final MapCodec<dkb> a = b(dkb::new);

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dsj.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      $$0.a($$2.d(), dkc.c(), 2);
   }

   @Override
   public ja a(ja $$0) {
      return $$0.d();
   }
}
