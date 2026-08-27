import com.mojang.serialization.MapCodec;

public class cww extends cvu {
   public static final MapCodec<cww> i = b(cww::new);
   private final eiy[] j;

   @Override
   public MapCodec<cww> a() {
      return i;
   }

   public cww(dga.d $$0) {
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
   public eiy f(dgb $$0, cqf $$1, ht $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public eiy b(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   public boolean a(dgb $$0, boolean $$1, hx $$2) {
      cua $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof cwx && cwx.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(dgb $$0) {
      return $$0.a(aqs.S) && $$0.a(aqs.k) == this.o().a(aqs.k);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         ckj $$6 = $$3.b($$4);
         return $$6.a(ckm.tQ) ? bib.a : bib.d;
      } else {
         return cko.a($$3, $$1, $$2);
      }
   }

   @Override
   public dgb a(cmr $$0) {
      cqf $$1 = $$0.q();
      ht $$2 = $$0.a();
      ebe $$3 = $$0.q().b_($$0.a());
      ht $$4 = $$2.e();
      ht $$5 = $$2.h();
      ht $$6 = $$2.f();
      ht $$7 = $$2.g();
      dgb $$8 = $$1.a_($$4);
      dgb $$9 = $$1.a_($$5);
      dgb $$10 = $$1.a_($$6);
      dgb $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, hx.d), hx.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, hx.e), hx.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, hx.c), hx.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, hx.f), hx.f)))
         .a(e, Boolean.valueOf($$3.a() == ebf.c));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return $$1.o().e() == hx.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
