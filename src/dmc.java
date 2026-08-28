import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmc extends dez implements dma {
   public static final MapCodec<dmc> a = b(dmc::new);
   public static final dta<dtk> b = dss.bh;
   public static final dst c = dss.C;
   protected static final ewk d = dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final ewk e = dez.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dmc> a() {
      return a;
   }

   public dmc(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(b, dtk.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsc $$0) {
      return $$0.c(b) != dtk.c;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      dtk $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ewh.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      iz $$1 = $$0.a();
      dsc $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dtk.c).a(c, Boolean.valueOf(false));
      } else {
         env $$3 = $$0.q().b_($$1);
         dsc $$4 = this.o().a(b, dtk.b).a(c, Boolean.valueOf($$3.a() == enw.c));
         je $$5 = $$0.k();
         return $$5 != je.a && ($$5 == je.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dtk.a);
      }
   }

   @Override
   protected boolean a(dsc $$0, cya $$1) {
      cup $$2 = $$1.n();
      dtk $$3 = $$0.c(b);
      if ($$3 == dtk.c || !$$2.a(this.r())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         je $$5 = $$1.k();
         return $$3 == dtk.b ? $$5 == je.b || $$4 && $$5.o().d() : $$5 == je.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dbz $$0, iz $$1, dsc $$2, env $$3) {
      return $$2.c(b) != dtk.c ? dma.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cmx $$0, dbe $$1, iz $$2, dsc $$3, enu $$4) {
      return $$3.c(b) != dtk.c ? dma.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.u().a(awv.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
