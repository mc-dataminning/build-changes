import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnz extends dgv implements dnx {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final duy<dvi> b = duq.bh;
   public static final dur c = duq.C;
   protected static final eyx d = dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eyx e = dgv.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dnz> a() {
      return a;
   }

   public dnz(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(b, dvi.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dua $$0) {
      return $$0.c(b) != dvi.c;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      dvi $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return eyu.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      je $$1 = $$0.a();
      dua $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dvi.c).b(c, Boolean.valueOf(false));
      } else {
         eqb $$3 = $$0.q().b_($$1);
         dua $$4 = this.o().b(b, dvi.b).b(c, Boolean.valueOf($$3.a() == eqc.c));
         jj $$5 = $$0.k();
         return $$5 != jj.a && ($$5 == jj.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dvi.a);
      }
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      cvl $$2 = $$1.n();
      dvi $$3 = $$0.c(b);
      if ($$3 == dvi.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jj $$5 = $$1.k();
         return $$3 == dvi.b ? $$5 == jj.b || $$4 && $$5.o().d() : $$5 == jj.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(ddt $$0, je $$1, dua $$2, eqb $$3) {
      return $$2.c(b) != dvi.c ? dnx.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cnp $$0, dcx $$1, je $$2, dua $$3, eqa $$4) {
      return $$3.c(b) != dvi.c ? dnx.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(awy.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
