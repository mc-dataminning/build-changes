import javax.annotation.Nullable;

public class dbi extends cwo implements czw {
   public static final dga a = dfz.u;
   public static final dgh<dgi> b = dfz.af;
   public static final dga c = dfz.w;
   public static final dga d = dfz.C;
   protected static final int e = 3;
   protected static final eig f = csv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eig g = csv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eig h = csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eig i = csv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eig j = csv.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eig k = csv.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dfy l;

   protected dbi(dfi.d $$0, dfy $$1) {
      super($$0.a($$1.d()));
      this.l = $$1;
      this.k(this.C.b().a(aC, hc.c).a(a, Boolean.valueOf(false)).a(b, dgi.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if (!$$0.c(a)) {
         return $$0.c(b) == dgi.a ? k : j;
      } else {
         switch ((hc)$$0.c(aC)) {
            case c:
            default:
               return i;
            case d:
               return h;
            case e:
               return g;
            case f:
               return f;
         }
      }
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      switch ($$3) {
         case a:
            return $$0.c(a);
         case b:
            return $$0.c(d);
         case c:
            return $$0.c(a);
         default:
            return false;
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if (!this.l.c()) {
         return bgy.d;
      } else {
         $$0 = $$0.a(a);
         $$1.a($$2, $$0, 2);
         if ($$0.c(d)) {
            $$1.a($$2, ean.c, ean.c.a((cpy)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(a));
         return bgy.a($$1.B);
      }
   }

   protected void a(@Nullable cbu $$0, cpv $$1, gw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), apf.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? djt.h : djt.d, $$2);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(c)) {
            if ($$0.c(a) != $$6) {
               $$0 = $$0.a(a, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 2);
            if ($$0.c(d)) {
               $$1.a($$2, ean.c, ean.c.a((cpy)$$1));
            }
         }
      }
   }

   @Override
   public dfj a(cln $$0) {
      dfj $$1 = this.n();
      eam $$2 = $$0.q().b_($$0.a());
      hc $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aC, $$3).a(b, $$0.l().d - (double)$$0.a().v() > 0.5 ? dgi.a : dgi.b);
      } else {
         $$1 = $$1.a(aC, $$0.g().g()).a(b, $$3 == hc.b ? dgi.b : dgi.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
      }

      return $$1.a(d, Boolean.valueOf($$2.a() == ean.c));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(aC, a, b, c, d);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(d) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
