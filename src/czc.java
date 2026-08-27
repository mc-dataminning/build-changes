import com.mojang.serialization.MapCodec;

public class czc extends cwy {
   public static final MapCodec<czc> a = b(czc::new);
   protected static final emv b = czv.c;

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   protected czc(djo.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public djp a(cpp $$0) {
      return !this.o().a((cua)$$0.q(), $$0.a()) ? cwy.a(this.o(), cxa.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      czv.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      djp $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof czx;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
