import com.mojang.serialization.MapCodec;

public class did extends dgz {
   public static final MapCodec<did> i = b(did::new);
   private final exn[] j;

   @Override
   public MapCodec<did> a() {
      return i;
   }

   public did(dtb.d $$0) {
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
   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected exn c(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   public boolean a(dtc $$0, boolean $$1, iw $$2) {
      dfc $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof die && die.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dtc $$0) {
      return $$0.a(awe.S) && $$0.a(awe.k) == this.n().a(awe.k);
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$2.C) {
         return $$0.a(cuk.wv) ? bqc.a : bqc.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      return !$$1.x_() ? cun.a($$3, $$1, $$2) : bqa.d;
   }

   @Override
   public dtc a(cyd $$0) {
      dbg $$1 = $$0.q();
      ir $$2 = $$0.a();
      epe $$3 = $$0.q().b_($$0.a());
      ir $$4 = $$2.e();
      ir $$5 = $$2.h();
      ir $$6 = $$2.f();
      ir $$7 = $$2.g();
      dtc $$8 = $$1.a_($$4);
      dtc $$9 = $$1.a_($$5);
      dtc $$10 = $$1.a_($$6);
      dtc $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, iw.d), iw.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, iw.e), iw.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, iw.c), iw.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, iw.f), iw.f)))
         .a(e, Boolean.valueOf($$3.a() == epf.c));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1.o().e() == iw.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
