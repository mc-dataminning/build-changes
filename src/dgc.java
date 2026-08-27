import com.mojang.serialization.MapCodec;

public class dgc extends dfa {
   public static final MapCodec<dgc> i = b(dgc::new);
   private final eui[] j;

   @Override
   public MapCodec<dgc> a() {
      return i;
   }

   public dgc(dqg.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected eui f(dqh $$0, czj $$1, in $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected eui c(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   public boolean a(dqh $$0, boolean $$1, is $$2) {
      dde $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dgd && dgd.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dqh $$0) {
      return $$0.a(avr.S) && $$0.a(avr.k) == this.n().a(avr.k);
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$2.B) {
         return $$0.a(ctc.uK) ? bpo.a : bpo.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      return !$$1.x_() ? cte.a($$3, $$1, $$2) : bpm.d;
   }

   @Override
   public dqh a(cwi $$0) {
      czj $$1 = $$0.q();
      in $$2 = $$0.a();
      ema $$3 = $$0.q().b_($$0.a());
      in $$4 = $$2.e();
      in $$5 = $$2.h();
      in $$6 = $$2.f();
      in $$7 = $$2.g();
      dqh $$8 = $$1.a_($$4);
      dqh $$9 = $$1.a_($$5);
      dqh $$10 = $$1.a_($$6);
      dqh $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, is.d), is.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, is.e), is.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, is.c), is.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, is.f), is.f)))
         .a(e, Boolean.valueOf($$3.a() == emb.c));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$1.o().e() == is.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
