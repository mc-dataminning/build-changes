import com.mojang.serialization.MapCodec;

public class cyn extends cwj {
   public static final MapCodec<cyn> a = b(cyn::new);
   protected static final emf b = czg.c;

   @Override
   public MapCodec<cyn> a() {
      return a;
   }

   protected cyn(diz.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public dja a(cpa $$0) {
      return !this.o().a((ctl)$$0.q(), $$0.a()) ? cwj.a(this.o(), cwl.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      czg.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      dja $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof czi;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
