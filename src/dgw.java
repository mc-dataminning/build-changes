import com.mojang.serialization.MapCodec;

public class dgw extends dfu {
   public static final MapCodec<dgw> i = b(dgw::new);
   private final evd[] j;

   @Override
   public MapCodec<dgw> a() {
      return i;
   }

   public dgw(dra.d $$0) {
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
   protected evd f(drb $$0, dad $$1, io $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected evd c(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   public boolean a(drb $$0, boolean $$1, it $$2) {
      ddy $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dgx && dgx.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(drb $$0) {
      return $$0.a(avw.S) && $$0.a(avw.k) == this.n().a(avw.k);
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$2.B) {
         return $$0.a(ctr.uK) ? bpw.a : bpw.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      return !$$1.x_() ? ctt.a($$3, $$1, $$2) : bpu.d;
   }

   @Override
   public drb a(cwz $$0) {
      dad $$1 = $$0.q();
      io $$2 = $$0.a();
      emu $$3 = $$0.q().b_($$0.a());
      io $$4 = $$2.e();
      io $$5 = $$2.h();
      io $$6 = $$2.f();
      io $$7 = $$2.g();
      drb $$8 = $$1.a_($$4);
      drb $$9 = $$1.a_($$5);
      drb $$10 = $$1.a_($$6);
      drb $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, it.d), it.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, it.e), it.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, it.c), it.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, it.f), it.f)))
         .a(e, Boolean.valueOf($$3.a() == emv.c));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return $$1.o().e() == it.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
