import com.mojang.serialization.MapCodec;

public class dnz extends dlu {
   public static final MapCodec<dnz> a = b(dnz::new);
   private static final feq b = dlu.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   protected dnz(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   public dzo a(dcl $$0) {
      return !this.m().a((dis)$$0.q(), $$0.a()) ? dlu.a(this.m(), dlw.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == ja.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dos.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dou;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
