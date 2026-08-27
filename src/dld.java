import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dld extends dea implements dlb {
   public static final MapCodec<dld> a = b(dld::new);
   public static final dsb<dsl> b = drt.bh;
   public static final dru c = drt.C;
   protected static final evf d = dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final evf e = dea.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dld> a() {
      return a;
   }

   public dld(drc.d $$0) {
      super($$0);
      this.k(this.n().a(b, dsl.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drd $$0) {
      return $$0.c(b) != dsl.c;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      dsl $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return evc.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      io $$1 = $$0.a();
      drd $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dsl.c).a(c, Boolean.valueOf(false));
      } else {
         emw $$3 = $$0.q().b_($$1);
         drd $$4 = this.n().a(b, dsl.b).a(c, Boolean.valueOf($$3.a() == emx.c));
         it $$5 = $$0.k();
         return $$5 != it.a && ($$5 == it.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dsl.a);
      }
   }

   @Override
   protected boolean a(drd $$0, cxb $$1) {
      ctq $$2 = $$1.n();
      dsl $$3 = $$0.c(b);
      if ($$3 == dsl.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         it $$5 = $$1.k();
         return $$3 == dsl.b ? $$5 == it.b || $$4 && $$5.o().d() : $$5 == it.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dba $$0, io $$1, drd $$2, emw $$3) {
      return $$2.c(b) != dsl.c ? dlb.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cly $$0, daf $$1, io $$2, drd $$3, emv $$4) {
      return $$3.c(b) != dsl.c ? dlb.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awc.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
