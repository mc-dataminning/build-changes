import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsd extends dku implements dsb {
   public static final MapCodec<dsd> a = b(dsd::new);
   public static final dzk<dzu> b = dzc.bk;
   public static final dzd c = dzc.I;
   private static final fdo d = dku.b(16.0, 0.0, 8.0);
   private static final fdo e = dku.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dsd> a() {
      return a;
   }

   public dsd(dyl.d $$0) {
      super($$0);
      this.l(this.m().b(b, dzu.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dym $$0) {
      return $$0.c(b) != dzu.c;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return switch ((dzu)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fdl.b();
      };
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      jj $$1 = $$0.a();
      dym $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dzu.c).b(c, Boolean.valueOf(false));
      } else {
         eut $$3 = $$0.q().b_($$1);
         dym $$4 = this.m().b(b, dzu.b).b(c, Boolean.valueOf($$3.a() == euu.c));
         jo $$5 = $$0.k();
         return $$5 != jo.a && ($$5 == jo.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dzu.a);
      }
   }

   @Override
   protected boolean a(dym $$0, dbn $$1) {
      cxy $$2 = $$1.n();
      dzu $$3 = $$0.c(b);
      if ($$3 == dzu.c || !$$2.a(this.i())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jo $$5 = $$1.k();
         return $$3 == dzu.b ? $$5 == jo.b || $$4 && $$5.o().d() : $$5 == jo.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(c) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dhq $$0, jj $$1, dym $$2, eut $$3) {
      return $$2.c(b) != dzu.c ? dsb.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bwr $$0, dgv $$1, jj $$2, dym $$3, eus $$4) {
      return $$3.c(b) != dzu.c ? dsb.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
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
