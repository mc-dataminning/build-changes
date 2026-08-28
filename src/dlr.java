import com.mojang.serialization.MapCodec;

public class dlr extends dfh implements dfk {
   public static final MapCodec<dlr> a = b(dlr::new);

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dsj.d $$0) {
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
      $$0.b($$2.d(), dfj.sG.o());
   }

   @Override
   public ja a(ja $$0) {
      return $$0.d();
   }
}
