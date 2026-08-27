import com.mojang.serialization.MapCodec;

public class cyu extends cwq {
   public static final MapCodec<cyu> a = b(cyu::new);
   protected static final emm b = czn.c;

   @Override
   public MapCodec<cyu> a() {
      return a;
   }

   protected cyu(djg.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public djh a(cph $$0) {
      return !this.o().a((cts)$$0.q(), $$0.a()) ? cwq.a(this.o(), cws.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      czn.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      djh $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof czp;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
