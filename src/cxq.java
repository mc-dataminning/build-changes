import com.mojang.serialization.MapCodec;

public class cxq extends cwo {
   public static final MapCodec<cxq> i = b(cxq::new);
   private final ekb[] j;

   @Override
   public MapCodec<cxq> a() {
      return i;
   }

   public cxq(dgv.d $$0) {
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
   public ekb f(dgw $$0, cqy $$1, ht $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public ekb b(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   public boolean a(dgw $$0, boolean $$1, hx $$2) {
      cut $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cxr && cxr.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dgw $$0) {
      return $$0.a(arc.S) && $$0.a(arc.k) == this.o().a(arc.k);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         clb $$6 = $$3.b($$4);
         return $$6.a(cle.tR) ? biq.a : biq.d;
      } else {
         return clg.a($$3, $$1, $$2);
      }
   }

   @Override
   public dgw a(cnj $$0) {
      cqy $$1 = $$0.q();
      ht $$2 = $$0.a();
      ecg $$3 = $$0.q().b_($$0.a());
      ht $$4 = $$2.e();
      ht $$5 = $$2.h();
      ht $$6 = $$2.f();
      ht $$7 = $$2.g();
      dgw $$8 = $$1.a_($$4);
      dgw $$9 = $$1.a_($$5);
      dgw $$10 = $$1.a_($$6);
      dgw $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hx.d), hx.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hx.e), hx.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hx.c), hx.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hx.f), hx.f)))
         .a(e, Boolean.valueOf($$3.a() == ech.c));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$1.o().e() == hx.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
