import com.mojang.serialization.MapCodec;

public class cxy extends cww {
   public static final MapCodec<cxy> i = b(cxy::new);
   private final ekn[] j;

   @Override
   public MapCodec<cxy> a() {
      return i;
   }

   public cxy(dhh.d $$0) {
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
   public ekn f(dhi $$0, crg $$1, ht $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public ekn c(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   public boolean a(dhi $$0, boolean $$1, hx $$2) {
      cva $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cxz && cxz.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dhi $$0) {
      return $$0.a(arg.S) && $$0.a(arg.k) == this.o().a(arg.k);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         clj $$6 = $$3.b($$4);
         return $$6.a(clm.uC) ? bix.a : bix.d;
      } else {
         return clo.a($$3, $$1, $$2);
      }
   }

   @Override
   public dhi a(cnr $$0) {
      crg $$1 = $$0.q();
      ht $$2 = $$0.a();
      ecs $$3 = $$0.q().b_($$0.a());
      ht $$4 = $$2.e();
      ht $$5 = $$2.h();
      ht $$6 = $$2.f();
      ht $$7 = $$2.g();
      dhi $$8 = $$1.a_($$4);
      dhi $$9 = $$1.a_($$5);
      dhi $$10 = $$1.a_($$6);
      dhi $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hx.d), hx.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hx.e), hx.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hx.c), hx.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hx.f), hx.f)))
         .a(e, Boolean.valueOf($$3.a() == ect.c));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$1.o().e() == hx.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
