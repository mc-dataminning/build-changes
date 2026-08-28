import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtd extends dlu implements dtb {
   public static final MapCodec<dtd> a = b(dtd::new);
   public static final eam<eaw> b = eae.bk;
   public static final eaf c = eae.I;
   private static final feq d = dlu.b(16.0, 0.0, 8.0);
   private static final feq e = dlu.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dtd> a() {
      return a;
   }

   public dtd(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(b, eaw.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dzo $$0) {
      return $$0.c(b) != eaw.c;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return switch ((eaw)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fen.b();
      };
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      iu $$1 = $$0.a();
      dzo $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, eaw.c).b(c, Boolean.valueOf(false));
      } else {
         evv $$3 = $$0.q().b_($$1);
         dzo $$4 = this.m().b(b, eaw.b).b(c, Boolean.valueOf($$3.a() == evw.c));
         ja $$5 = $$0.k();
         return $$5 != ja.a && ($$5 == ja.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, eaw.a);
      }
   }

   @Override
   protected boolean a(dzo $$0, dcl $$1) {
      cys $$2 = $$1.n();
      eaw $$3 = $$0.c(b);
      if ($$3 == eaw.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         ja $$5 = $$1.k();
         return $$3 == eaw.b ? $$5 == ja.b || $$4 && $$5.o().d() : $$5 == ja.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(c) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(diq $$0, iu $$1, dzo $$2, evv $$3) {
      return $$2.c(b) != eaw.c ? dtb.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bwz $$0, dhv $$1, iu $$2, dzo $$3, evu $$4) {
      return $$3.c(b) != eaw.c ? dtb.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axf.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
