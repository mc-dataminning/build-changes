import com.mojang.serialization.MapCodec;

public class cyt extends cwp {
   public static final MapCodec<cyt> a = b(cyt::new);
   protected static final eml b = czm.c;

   @Override
   public MapCodec<cyt> a() {
      return a;
   }

   protected cyt(djf.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public djg a(cpg $$0) {
      return !this.o().a((ctr)$$0.q(), $$0.a()) ? cwp.a(this.o(), cwr.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      czm.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      djg $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof czo;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
