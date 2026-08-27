import com.mojang.serialization.MapCodec;

public class cww extends cut {
   public static final MapCodec<cww> a = b(cww::new);
   protected static final ekb b = cxp.c;

   @Override
   public MapCodec<cww> a() {
      return a;
   }

   protected cww(dgv.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public dgw a(cnj $$0) {
      return !this.o().a((crv)$$0.q(), $$0.a()) ? cut.a(this.o(), cuv.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      cxp.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cxr;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
