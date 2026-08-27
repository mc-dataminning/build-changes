import com.mojang.serialization.MapCodec;

public class cve extends ctc {
   public static final MapCodec<cve> a = b(cve::new);
   protected static final eia b = cvx.c;

   @Override
   public MapCodec<cve> a() {
      return a;
   }

   protected cve(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public dfd a(clt $$0) {
      return !this.o().a((cqe)$$0.q(), $$0.a()) ? ctc.a(this.o(), cte.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      cvx.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      dfd $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cvz;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
