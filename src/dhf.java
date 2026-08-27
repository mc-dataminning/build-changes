import com.mojang.serialization.MapCodec;

public class dhf extends dfa {
   public static final MapCodec<dhf> i = b(dhf::new);

   @Override
   public MapCodec<? extends dhf> a() {
      return i;
   }

   protected dhf(dqg.d $$0) {
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
   public dqh a(cwi $$0) {
      czj $$1 = $$0.q();
      in $$2 = $$0.a();
      ema $$3 = $$0.q().b_($$0.a());
      in $$4 = $$2.e();
      in $$5 = $$2.f();
      in $$6 = $$2.g();
      in $$7 = $$2.h();
      dqh $$8 = $$1.a_($$4);
      dqh $$9 = $$1.a_($$5);
      dqh $$10 = $$1.a_($$6);
      dqh $$11 = $$1.a_($$7);
      return this.n()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, is.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, is.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, is.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, is.e))))
         .a(e, Boolean.valueOf($$3.a() == emb.c));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eui c(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.a();
   }

   @Override
   protected boolean a(dqh $$0, dqh $$1, is $$2) {
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

   public final boolean a(dqh $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dhf || $$0.a(avr.L);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
