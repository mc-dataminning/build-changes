import javax.annotation.Nullable;

public class dbk extends cwq implements czy {
   public static final dgc a = dgb.u;
   public static final dgj<dgk> b = dgb.af;
   public static final dgc c = dgb.w;
   public static final dgc d = dgb.C;
   protected static final int e = 3;
   protected static final eii f = csx.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eii g = csx.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eii h = csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eii i = csx.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eii j = csx.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eii k = csx.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dga l;

   protected dbk(dfk.d $$0, dga $$1) {
      super($$0.a($$1.d()));
      this.l = $$1;
      this.k(this.C.b().a(aC, hc.c).a(a, Boolean.valueOf(false)).a(b, dgk.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if (!$$0.c(a)) {
         return $$0.c(b) == dgk.a ? k : j;
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
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
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
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if (!this.l.c()) {
         return bha.d;
      } else {
         $$0 = $$0.a(a);
         $$1.a($$2, $$0, 2);
         if ($$0.c(d)) {
            $$1.a($$2, eap.c, eap.c.a((cqa)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(a));
         return bha.a($$1.B);
      }
   }

   protected void a(@Nullable cbw $$0, cpx $$1, gw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), apg.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? djv.h : djv.d, $$2);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(c)) {
            if ($$0.c(a) != $$6) {
               $$0 = $$0.a(a, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 2);
            if ($$0.c(d)) {
               $$1.a($$2, eap.c, eap.c.a((cqa)$$1));
            }
         }
      }
   }

   @Override
   public dfl a(clp $$0) {
      dfl $$1 = this.n();
      eao $$2 = $$0.q().b_($$0.a());
      hc $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aC, $$3).a(b, $$0.l().d - (double)$$0.a().v() > 0.5 ? dgk.a : dgk.b);
      } else {
         $$1 = $$1.a(aC, $$0.g().g()).a(b, $$3 == hc.b ? dgk.b : dgk.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
      }

      return $$1.a(d, Boolean.valueOf($$2.a() == eap.c));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(aC, a, b, c, d);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(d) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
