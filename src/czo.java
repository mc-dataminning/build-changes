import com.mojang.serialization.MapCodec;

public class czo extends cym {
   public static final MapCodec<czo> i = b(czo::new);
   private final emm[] j;

   @Override
   public MapCodec<czo> a() {
      return i;
   }

   public czo(djg.d $$0) {
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
   public emm f(djh $$0, csv $$1, hx $$2) {
      return this.j[this.g($$0)];
   }

   @Override
   public emm c(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   public boolean a(djh $$0, boolean $$1, ic $$2) {
      cwq $$3 = $$0.b();
      boolean $$4 = this.h($$0);
      boolean $$5 = $$3 instanceof czp && czp.a($$0, $$2);
      return !j($$0) && $$1 || $$4 || $$5;
   }

   private boolean h(djh $$0) {
      return $$0.a(ash.S) && $$0.a(ash.k) == this.o().a(ash.k);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         cmy $$6 = $$3.b($$4);
         return $$6.a(cnb.uD) ? bkb.a : bkb.d;
      } else {
         return cnd.a($$3, $$1, $$2);
      }
   }

   @Override
   public djh a(cph $$0) {
      csv $$1 = $$0.q();
      hx $$2 = $$0.a();
      eer $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      djh $$8 = $$1.a_($$4);
      djh $$9 = $$1.a_($$5);
      djh $$10 = $$1.a_($$6);
      djh $$11 = $$1.a_($$7);
      return super.a($$0)
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ic.d), ic.d)))
         .a(b, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ic.e), ic.e)))
         .a(c, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ic.c), ic.c)))
         .a(d, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ic.f), ic.f)))
         .a(e, Boolean.valueOf($$3.a() == ees.c));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return $$1.o().e() == ic.c.a ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g()), $$1.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
