import com.mojang.serialization.MapCodec;

public class dff extends ded {
   public static final MapCodec<dff> i = b(dff::new);
   private final etc[] j;

   @Override
   public MapCodec<dff> a() {
      return i;
   }

   public dff(dph.d $$0) {
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
   protected etc f(dpi $$0, cym $$1, id $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected etc c(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   public boolean a(dpi $$0, boolean $$1, ij $$2) {
      dch $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dfg && dfg.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dpi $$0) {
      return $$0.a(ave.S) && $$0.a(ave.k) == this.n().a(ave.k);
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$2.B) {
         return $$0.a(crv.uI) ? boh.a : boh.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      return !$$1.x_() ? crx.a($$3, $$1, $$2) : bof.d;
   }

   @Override
   public dpi a(cux $$0) {
      cym $$1 = $$0.q();
      id $$2 = $$0.a();
      elb $$3 = $$0.q().b_($$0.a());
      id $$4 = $$2.e();
      id $$5 = $$2.h();
      id $$6 = $$2.f();
      id $$7 = $$2.g();
      dpi $$8 = $$1.a_($$4);
      dpi $$9 = $$1.a_($$5);
      dpi $$10 = $$1.a_($$6);
      dpi $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ij.d), ij.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ij.e), ij.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ij.c), ij.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ij.f), ij.f)))
         .a(e, Boolean.valueOf($$3.a() == elc.c));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return $$1.o().e() == ij.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
