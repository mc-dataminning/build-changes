import javax.annotation.Nullable;

public class dbd extends cwj implements czr {
   public static final dfv a = dfu.u;
   public static final dgc<dgd> b = dfu.af;
   public static final dfv c = dfu.w;
   public static final dfv d = dfu.C;
   protected static final int e = 3;
   protected static final eib f = csq.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eib g = csq.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eib h = csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eib i = csq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eib j = csq.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eib k = csq.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dft l;

   protected dbd(dfd.d $$0, dft $$1) {
      super($$0.a($$1.d()));
      this.l = $$1;
      this.k(this.C.b().a(aC, hc.c).a(a, Boolean.valueOf(false)).a(b, dgd.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if (!$$0.c(a)) {
         return $$0.c(b) == dgd.a ? k : j;
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
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
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
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if (!this.l.c()) {
         return bgt.d;
      } else {
         $$0 = $$0.a(a);
         $$1.a($$2, $$0, 2);
         if ($$0.c(d)) {
            $$1.a($$2, eai.c, eai.c.a((cpt)$$1));
         }

         this.a($$3, $$1, $$2, $$0.c(a));
         return bgt.a($$1.B);
      }
   }

   protected void a(@Nullable cbp $$0, cpq $$1, gw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), apa.e, 1.0F, $$1.y_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? djo.h : djo.d, $$2);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$6 != $$0.c(c)) {
            if ($$0.c(a) != $$6) {
               $$0 = $$0.a(a, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 2);
            if ($$0.c(d)) {
               $$1.a($$2, eai.c, eai.c.a((cpt)$$1));
            }
         }
      }
   }

   @Override
   public dfe a(cli $$0) {
      dfe $$1 = this.n();
      eah $$2 = $$0.q().b_($$0.a());
      hc $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aC, $$3).a(b, $$0.l().d - (double)$$0.a().v() > 0.5 ? dgd.a : dgd.b);
      } else {
         $$1 = $$1.a(aC, $$0.g().g()).a(b, $$3 == hc.b ? dgd.b : dgd.a);
      }

      if ($$0.q().B($$0.a())) {
         $$1 = $$1.a(a, Boolean.valueOf(true)).a(c, Boolean.valueOf(true));
      }

      return $$1.a(d, Boolean.valueOf($$2.a() == eai.c));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(aC, a, b, c, d);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(d) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
