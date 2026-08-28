import com.mojang.serialization.MapCodec;

public class did extends dhb {
   public static final MapCodec<did> i = b(did::new);
   private final ews[] j;

   @Override
   public MapCodec<did> a() {
      return i;
   }

   public did(dsg.d $$0) {
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
   protected ews f(dsh $$0, dbj $$1, ja $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ews c(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   public boolean a(dsh $$0, boolean $$1, jf $$2) {
      dff $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof die && die.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dsh $$0) {
      return $$0.a(avu.S) && $$0.a(avu.k) == this.o().a(avu.k);
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$2.B) {
         return $$0.a(cud.uK) ? bqf.a : bqf.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      return !$$1.x_() ? cuf.a($$3, $$1, $$2) : bqd.e;
   }

   @Override
   public dsh a(cxk $$0) {
      dbj $$1 = $$0.q();
      ja $$2 = $$0.a();
      eob $$3 = $$0.q().b_($$0.a());
      ja $$4 = $$2.e();
      ja $$5 = $$2.h();
      ja $$6 = $$2.f();
      ja $$7 = $$2.g();
      dsh $$8 = $$1.a_($$4);
      dsh $$9 = $$1.a_($$5);
      dsh $$10 = $$1.a_($$6);
      dsh $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, jf.d), jf.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, jf.e), jf.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, jf.c), jf.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, jf.f), jf.f)))
         .a(e, Boolean.valueOf($$3.a() == eoc.c));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return $$1.o().e() == jf.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
