import com.mojang.serialization.MapCodec;

public class dhy extends dgw {
   public static final MapCodec<dhy> i = b(dhy::new);
   private final ewl[] j;

   @Override
   public MapCodec<dhy> a() {
      return i;
   }

   public dhy(dsc.d $$0) {
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
   protected ewl f(dsd $$0, dbf $$1, iz $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   protected ewl c(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   public boolean a(dsd $$0, boolean $$1, je $$2) {
      dfa $$3 = $$0.b();
      boolean $$4 = this.m($$0);
      boolean $$5 = $$3 instanceof dhz && dhz.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean m(dsd $$0) {
      return $$0.a(awp.S) && $$0.a(awp.k) == this.o().a(awp.k);
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$2.B) {
         return $$0.a(cut.uK) ? bqx.a : bqx.e;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      return !$$1.x_() ? cuv.a($$3, $$1, $$2) : bqv.e;
   }

   @Override
   public dsd a(cyb $$0) {
      dbf $$1 = $$0.q();
      iz $$2 = $$0.a();
      enw $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      dsd $$8 = $$1.a_($$4);
      dsd $$9 = $$1.a_($$5);
      dsd $$10 = $$1.a_($$6);
      dsd $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, je.d), je.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, je.e), je.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, je.c), je.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, je.f), je.f)))
         .a(e, Boolean.valueOf($$3.a() == enx.c));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return $$1.o().e() == je.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
