import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctz extends crr<dde> implements czy {
   public static final dgf b = cwq.aC;
   public static final dgj<dgd> c = dgb.bc;
   public static final dgc d = dgb.C;
   public static final int e = 1;
   protected static final int f = 1;
   protected static final int g = 14;
   protected static final eii h = csx.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eii i = csx.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eii j = csx.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eii k = csx.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eii l = csx.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cva.b<dde, Optional<bgt>> m = new cva.b<dde, Optional<bgt>>() {
      public Optional<bgt> a(dde $$0, dde $$1) {
         return Optional.of(new bgs($$0, $$1));
      }

      public Optional<bgt> a(dde $$0) {
         return Optional.of($$0);
      }

      public Optional<bgt> a() {
         return Optional.empty();
      }
   };
   private static final cva.b<dde, Optional<bhd>> n = new cva.b<dde, Optional<bhd>>() {
      public Optional<bhd> a(final dde $$0, final dde $$1) {
         final bgt $$2 = new bgs($$0, $$1);
         return Optional.of(new bhd() {
            @Nullable
            @Override
            public cen createMenu(int $$0x, cbv $$1x, cbw $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return ceu.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public tn N_() {
               if ($$0.ac()) {
                  return $$0.N_();
               } else {
                  return (tn)($$1.ac() ? $$1.N_() : tn.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bhd> a(dde $$0) {
         return Optional.of($$0);
      }

      public Optional<bhd> a() {
         return Optional.empty();
      }
   };

   protected ctz(dfk.d $$0, Supplier<dcz<? extends dde>> $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(b, hc.c).a(c, dgd.a).a(d, Boolean.valueOf(false)));
   }

   public static cva.a g(dfl $$0) {
      dgd $$1 = $$0.c(c);
      if ($$1 == dgd.a) {
         return cva.a.a;
      } else {
         return $$1 == dgd.c ? cva.a.b : cva.a.c;
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.b;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dgd $$6 = $$2.c(c);
         if ($$0.c(c) == dgd.a && $$6 != dgd.a && $$0.c(b) == $$2.c(b) && h($$2) == $$1.g()) {
            return $$0.a(c, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(c, dgd.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if ($$0.c(c) == dgd.a) {
         return l;
      } else {
         switch (h($$0)) {
            case c:
            default:
               return h;
            case d:
               return i;
            case e:
               return j;
            case f:
               return k;
         }
      }
   }

   public static hc h(dfl $$0) {
      hc $$1 = $$0.c(b);
      return $$0.c(c) == dgd.b ? $$1.h() : $$1.i();
   }

   @Override
   public dfl a(clp $$0) {
      dgd $$1 = dgd.a;
      hc $$2 = $$0.g().g();
      eao $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      hc $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         hc $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dgd.c : dgd.b;
         }
      }

      if ($$1 == dgd.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dgd.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dgd.c;
         }
      }

      return this.n().a(b, $$2).a(c, $$1).a(d, Boolean.valueOf($$3.a() == eap.c));
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(d) ? eap.c.a(false) : super.c_($$0);
   }

   @Nullable
   private hc a(clp $$0, hc $$1) {
      dfl $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(c) == dgd.a ? $$2.c(b) : null;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof dde) {
            ((dde)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof bgt) {
            bgw.a($$1, $$2, (bgt)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         bhd $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.b());
            can.a($$3, true);
         }

         return bha.b;
      }
   }

   protected apm<aey> b() {
      return app.i.b(app.ao);
   }

   public dcz<? extends dde> c() {
      return this.a.get();
   }

   @Nullable
   public static bgt a(ctz $$0, dfl $$1, cpx $$2, gw $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(m).orElse(null);
   }

   @Override
   public cva.c<? extends dde> a(dfl $$0, cpx $$1, gw $$2, boolean $$3) {
      BiPredicate<cpy, gw> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = ctz::a;
      }

      return cva.a(this.a.get(), ctz::g, ctz::h, b, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bhd b(dfl $$0, cpx $$1, gw $$2) {
      return this.a($$0, $$1, $$2, false).apply(n).orElse(null);
   }

   public static cva.b<dde, Float2FloatFunction> a(final ddz $$0) {
      return new cva.b<dde, Float2FloatFunction>() {
         public Float2FloatFunction a(dde $$0x, dde $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dde $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dde($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return $$0.B ? a($$2, this.c(), dde::a) : null;
   }

   public static boolean a(cpy $$0, gw $$1) {
      return a((cpd)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cpd $$0, gw $$1) {
      gw $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cpy $$0, gw $$1) {
      List<buw> $$2 = $$0.a(
         buw.class, new ehk((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (buw $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return cen.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      dcx $$4 = $$1.c_($$2);
      if ($$4 instanceof dde) {
         ((dde)$$4).i();
      }
   }
}
