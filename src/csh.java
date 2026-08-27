public class csh extends crf {
   private final efb[] i;

   public csh(dca.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
      this.i = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public efb f(dcb $$0, cls $$1, gu $$2) {
      return this.i[this.g($$0)];
   }

   @Override
   public efb b(dcb $$0, cls $$1, gu $$2, een $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   public boolean a(dcb $$0, boolean $$1, ha $$2) {
      cpn $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof csi && csi.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dcb $$0) {
      return $$0.a(amw.S) && $$0.a(amw.k) == this.n().a(amw.k);
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         cfz $$6 = $$3.b($$4);
         return $$6.a(cgc.tQ) ? bdx.a : bdx.d;
      } else {
         return cge.a($$3, $$1, $$2);
      }
   }

   @Override
   public dcb a(cih $$0) {
      cls $$1 = $$0.q();
      gu $$2 = $$0.a();
      dxe $$3 = $$0.q().b_($$0.a());
      gu $$4 = $$2.e();
      gu $$5 = $$2.h();
      gu $$6 = $$2.f();
      gu $$7 = $$2.g();
      dcb $$8 = $$1.a_($$4);
      dcb $$9 = $$1.a_($$5);
      dcb $$10 = $$1.a_($$6);
      dcb $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ha.d), ha.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ha.e), ha.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ha.c), ha.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ha.f), ha.f)))
         .a(e, Boolean.valueOf($$3.a() == dxf.c));
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return $$1.o().e() == ha.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
