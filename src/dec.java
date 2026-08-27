import com.mojang.serialization.MapCodec;

public class dec extends dby {
   public static final MapCodec<dec> i = b(dec::new);

   @Override
   public MapCodec<? extends dec> a() {
      return i;
   }

   protected dec(dna.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dnb a(csu $$0) {
      cwh $$1 = $$0.q();
      ib $$2 = $$0.a();
      eip $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.f();
      ib $$6 = $$2.g();
      ib $$7 = $$2.h();
      dnb $$8 = $$1.a_($$4);
      dnb $$9 = $$1.a_($$5);
      dnb $$10 = $$1.a_($$6);
      dnb $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ih.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ih.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ih.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ih.e))))
         .a(e, Boolean.valueOf($$3.a() == eiq.c));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqm c(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return eqj.a();
   }

   @Override
   protected boolean a(dnb $$0, dnb $$1, ih $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public final boolean a(dnb $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dec || $$0.a(aun.L);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
