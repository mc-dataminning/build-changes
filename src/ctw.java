import com.mojang.serialization.MapCodec;

public class ctw extends cut implements cuw {
   public static final MapCodec<ctw> a = b(ctw::new);
   protected static final float b = 4.0F;
   protected static final ekb c = cut.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<ctw> a() {
      return a;
   }

   public ctw(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      eji $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return $$1.a_($$2.d()).a(arc.at);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         return cuv.a.o();
      } else {
         if ($$1 == hx.b && $$2.a(cuv.mZ)) {
            $$3.a($$4, cuv.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(cle.dv);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dgw $$0, cdm $$1, cqy $$2, ht $$3) {
      return $$1.eS().d() instanceof cmm ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(crs $$0, ht $$1) {
      $$0.a($$1.c(), cuv.mZ.o().a(ctx.i, dhi.b), 3);
   }
}
