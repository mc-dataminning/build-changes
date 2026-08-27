import com.mojang.serialization.MapCodec;

public class dgy extends dfw {
   public static final MapCodec<dgy> i = b(dgy::new);
   private final evf[] j;

   @Override
   public MapCodec<dgy> a() {
      return i;
   }

   public dgy(drc.d $$0) {
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
   protected evf f(drd $$0, daf $$1, io $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected evf c(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   public boolean a(drd $$0, boolean $$1, it $$2) {
      dea $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dgz && dgz.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(drd $$0) {
      return $$0.a(avx.S) && $$0.a(avx.k) == this.n().a(avx.k);
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$2.B) {
         return $$0.a(ctt.uK) ? bpy.a : bpy.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      return !$$1.x_() ? ctv.a($$3, $$1, $$2) : bpw.d;
   }

   @Override
   public drd a(cxb $$0) {
      daf $$1 = $$0.q();
      io $$2 = $$0.a();
      emw $$3 = $$0.q().b_($$0.a());
      io $$4 = $$2.e();
      io $$5 = $$2.h();
      io $$6 = $$2.f();
      io $$7 = $$2.g();
      drd $$8 = $$1.a_($$4);
      drd $$9 = $$1.a_($$5);
      drd $$10 = $$1.a_($$6);
      drd $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, it.d), it.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, it.e), it.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, it.c), it.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, it.f), it.f)))
         .a(e, Boolean.valueOf($$3.a() == emx.c));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$1.o().e() == it.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
