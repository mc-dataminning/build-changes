import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dna extends dfw implements dmy {
   public static final MapCodec<dna> a = b(dna::new);
   public static final dty<dui> b = dtq.bh;
   public static final dtr c = dtq.C;
   protected static final exp d = dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final exp e = dfw.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dna> a() {
      return a;
   }

   public dna(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(b, dui.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dta $$0) {
      return $$0.c(b) != dui.c;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      dui $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return exm.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      jd $$1 = $$0.a();
      dta $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dui.c).a(c, Boolean.valueOf(false));
      } else {
         eoy $$3 = $$0.q().b_($$1);
         dta $$4 = this.o().a(b, dui.b).a(c, Boolean.valueOf($$3.a() == eoz.c));
         ji $$5 = $$0.k();
         return $$5 != ji.a && ($$5 == ji.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dui.a);
      }
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      cuo $$2 = $$1.n();
      dui $$3 = $$0.c(b);
      if ($$3 == dui.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ji $$5 = $$1.k();
         return $$3 == dui.b ? $$5 == ji.b || $$4 && $$5.o().d() : $$5 == ji.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(c) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dcv $$0, jd $$1, dta $$2, eoy $$3) {
      return $$2.c(b) != dui.c ? dmy.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmv $$0, dca $$1, jd $$2, dta $$3, eox $$4) {
      return $$3.c(b) != dui.c ? dmy.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awj.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
