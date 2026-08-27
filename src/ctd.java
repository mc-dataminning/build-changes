import com.mojang.serialization.MapCodec;

public class ctd extends cua implements cud {
   public static final MapCodec<ctd> a = b(ctd::new);
   protected static final float b = 4.0F;
   protected static final eiy c = cua.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<ctd> a() {
      return a;
   }

   public ctd(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      eif $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.d()).a(aqs.at);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         return cuc.a.o();
      } else {
         if ($$1 == hx.b && $$2.a(cuc.mZ)) {
            $$3.a($$4, cuc.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(ckm.dv);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dgb $$0, ccx $$1, cqf $$2, ht $$3) {
      return $$1.eS().d() instanceof clu ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cqz $$0, ht $$1) {
      $$0.a($$1.c(), cuc.mZ.o().a(cte.i, dgn.b), 3);
   }
}
