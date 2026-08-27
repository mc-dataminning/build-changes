import com.mojang.serialization.MapCodec;

public class cyx extends cxv {
   public static final MapCodec<cyx> i = b(cyx::new);
   private final elu[] j;

   @Override
   public MapCodec<cyx> a() {
      return i;
   }

   public cyx(dio.d $$0) {
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
   public elu f(dip $$0, cse $$1, hv $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public elu c(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   public boolean a(dip $$0, boolean $$1, ia $$2) {
      cvz $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cyy && cyy.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dip $$0) {
      return $$0.a(arr.S) && $$0.a(arr.k) == this.o().a(arr.k);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         cmh $$6 = $$3.b($$4);
         return $$6.a(cmk.uD) ? bjl.a : bjl.d;
      } else {
         return cmm.a($$3, $$1, $$2);
      }
   }

   @Override
   public dip a(coq $$0) {
      cse $$1 = $$0.q();
      hv $$2 = $$0.a();
      edz $$3 = $$0.q().b_($$0.a());
      hv $$4 = $$2.e();
      hv $$5 = $$2.h();
      hv $$6 = $$2.f();
      hv $$7 = $$2.g();
      dip $$8 = $$1.a_($$4);
      dip $$9 = $$1.a_($$5);
      dip $$10 = $$1.a_($$6);
      dip $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ia.d), ia.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ia.e), ia.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ia.c), ia.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ia.f), ia.f)))
         .a(e, Boolean.valueOf($$3.a() == eea.c));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return $$1.o().e() == ia.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
