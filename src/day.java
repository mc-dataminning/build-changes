import javax.annotation.Nullable;

public class day extends cwe implements czm {
   public static final dfq a = dfp.u;
   public static final dfx<dfy> b = dfp.af;
   public static final dfq c = dfp.w;
   public static final dfq d = dfp.C;
   protected static final int e = 3;
   protected static final ehw f = csl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ehw g = csl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehw h = csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ehw i = csl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ehw j = csl.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ehw k = csl.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dfo l;

   protected day(dey.d $$0, dfo $$1) {
      super($$0.a($$1.d()));
      this.l = $$1;
      this.k(this.C.b().a(aC, ha.c).a(a, Boolean.valueOf(false)).a(b, dfy.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if (!$$0.c(a)) {
         return $$0.c(b) == dfy.a ? k : j;
      } else {
         switch ((ha)$$0.c(aC)) {
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
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
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
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if (!this.l.c()) {
         return bgq.d;
      } else {
         $$0 = $$0.a(a);
         $$1.a($$2, $$0, 2);
         if ($$0.c(d)) {
            $$1.a($$2, ead.c, ead.c.a((cpo)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(a));
         return bgq.a($$1.B);
      }
   }

   protected void a(@Nullable cbm $$0, cpl $$1, gu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), aox.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? djj.h : djj.d, $$2);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(c)) {
            if ($$0.c(a) != $$6) {
               $$0 = $$0.a(a, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 2);
            if ($$0.c(d)) {
               $$1.a($$2, ead.c, ead.c.a((cpo)$$1));
            }
         }
      }
   }

   @Override
   public dez a(clf $$0) {
      dez $$1 = this.n();
      eac $$2 = $$0.q().b_($$0.a());
      ha $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aC, $$3).a(b, $$0.l().d - (double)$$0.a().v() > 0.5 ? dfy.a : dfy.b);
      } else {
         $$1 = $$1.a(aC, $$0.g().g()).a(b, $$3 == ha.b ? dfy.b : dfy.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
      }

      return $$1.a(d, Boolean.valueOf($$2.a() == ead.c));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(aC, a, b, c, d);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(d) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
