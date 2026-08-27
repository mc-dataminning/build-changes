import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class csy extends cso {
   public static final MapCodec<csy> a = b(csy::new);
   public static final dfx b = cww.aE;
   public static final dgb<dfr> c = dft.V;
   public static final dfu d = dft.w;
   private static final eia f = ctc.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eia g = ctc.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eia h = ctc.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eia i = ctc.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eia j = ehx.a(i, h);
   private static final eia k = ehx.a(j, ctc.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eia l = ehx.a(j, ctc.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eia m = ehx.a(j, ctc.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eia n = ehx.a(j, ctc.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eia o = ehx.a(j, ctc.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eia F = ehx.a(j, ctc.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eia G = ehx.a(j, ctc.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<csy> a() {
      return a;
   }

   public csy(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c).a(c, dfr.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      biw $$4 = $$3.v();
      cca $$5 = $$4 instanceof cca ? (cca)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bhe.a($$1.B) : bhe.d;
   }

   public boolean a(cqb $$0, dfd $$1, ehd $$2, @Nullable cca $$3, boolean $$4) {
      ha $$5 = $$2.b();
      gw $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(apq.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dfd $$0, ha $$1, double $$2) {
      if ($$1.o() != ha.a.b && !($$2 > 0.8124F)) {
         ha $$3 = $$0.c(b);
         dfr $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(cqb $$0, gw $$1, @Nullable ha $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable biw $$0, cqb $$1, gw $$2, @Nullable ha $$3) {
      dcz $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dcx) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dcx)$$4).a($$3);
         $$1.a(null, $$2, apg.bK, aph.e, 2.0F, 1.0F);
         $$1.a($$0, djn.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eia h(dfd $$0) {
      ha $$1 = $$0.c(b);
      dfr $$2 = $$0.c(c);
      if ($$2 == dfr.a) {
         return $$1 != ha.c && $$1 != ha.d ? g : f;
      } else if ($$2 == dfr.b) {
         return G;
      } else if ($$2 == dfr.d) {
         return $$1 != ha.c && $$1 != ha.d ? l : k;
      } else if ($$1 == ha.c) {
         return o;
      } else if ($$1 == ha.d) {
         return F;
      } else {
         return $$1 == ha.f ? n : m;
      }
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.h($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.h($$0);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      ha $$1 = $$0.k();
      gw $$2 = $$0.a();
      cqb $$3 = $$0.q();
      ha.a $$4 = $$1.o();
      if ($$4 == ha.a.b) {
         dfd $$5 = this.o().a(c, $$1 == ha.a ? dfr.b : dfr.a).a(b, $$0.g());
         if ($$5.a((cqe)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ha.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ha.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ha.e)
            || $$4 == ha.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ha.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ha.c);
         dfd $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dfr.d : dfr.c);
         if ($$7.a((cqe)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ha.b);
         $$7 = $$7.a(c, $$8 ? dfr.a : dfr.b);
         if ($$7.a((cqe)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      dfr $$6 = $$0.c(c);
      ha $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dfr.d) {
         return cte.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dfr.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dfr.c).a(b, $$1.g());
            }

            if ($$6 == dfr.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dfr.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      ha $$3 = n($$0).g();
      return $$3 == ha.b ? ctc.a($$1, $$2.c(), ha.a) : cvu.b($$1, $$2, $$3);
   }

   private static ha n(dfd $$0) {
      switch ((dfr)$$0.c(c)) {
         case a:
            return ha.b;
         case b:
            return ha.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dcx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.E, $$0.B ? dcx::a : dcx::b);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
