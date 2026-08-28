import com.mojang.serialization.MapCodec;

public class dhs extends dgq {
   public static final MapCodec<dhs> i = b(dhs::new);
   private final ewf[] j;

   @Override
   public MapCodec<dhs> a() {
      return i;
   }

   public dhs(drw.d $$0) {
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
   protected ewf f(drx $$0, daz $$1, iz $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ewf c(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   public boolean a(drx $$0, boolean $$1, je $$2) {
      deu $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dht && dht.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(drx $$0) {
      return $$0.a(awl.S) && $$0.a(awl.k) == this.n().a(awl.k);
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$2.B) {
         return $$0.a(cun.uK) ? bqr.a : bqr.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      return !$$1.x_() ? cup.a($$3, $$1, $$2) : bqp.e;
   }

   @Override
   public drx a(cxv $$0) {
      daz $$1 = $$0.q();
      iz $$2 = $$0.a();
      enq $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      drx $$8 = $$1.a_($$4);
      drx $$9 = $$1.a_($$5);
      drx $$10 = $$1.a_($$6);
      drx $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, je.d), je.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, je.e), je.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, je.c), je.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, je.f), je.f)))
         .a(e, Boolean.valueOf($$3.a() == enr.c));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return $$1.o().e() == je.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
