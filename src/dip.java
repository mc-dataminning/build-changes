import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dip extends dgg<dsc> implements doo {
   public static final MapCodec<dip> b = b($$0 -> new dip(() -> drx.b, $$0));
   public static final dvm c = dli.aF;
   public static final dvq<dvk> d = dvi.bc;
   public static final dvj e = dvi.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ezq i = dhm.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ezq j = dhm.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ezq k = dhm.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ezq l = dhm.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ezq m = dhm.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final djt.b<dsc, Optional<brl>> n = new djt.b<dsc, Optional<brl>>() {
      public Optional<brl> a(dsc $$0, dsc $$1) {
         return Optional.of(new brk($$0, $$1));
      }

      public Optional<brl> a(dsc $$0) {
         return Optional.of($$0);
      }

      public Optional<brl> a() {
         return Optional.empty();
      }
   };
   private static final djt.b<dsc, Optional<bru>> o = new djt.b<dsc, Optional<bru>>() {
      public Optional<bru> a(final dsc $$0, final dsc $$1) {
         final brl $$2 = new brk($$0, $$1);
         return Optional.of(new bru() {
            @Nullable
            @Override
            public cqz createMenu(int $$0x, cnw $$1x, cnx $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.k);
                  $$1.e_($$1.k);
                  return cri.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xe R_() {
               if ($$0.ak()) {
                  return $$0.R_();
               } else {
                  return (xe)($$1.ak() ? $$1.R_() : xe.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bru> a(dsc $$0) {
         return Optional.of($$0);
      }

      public Optional<bru> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dip> a() {
      return b;
   }

   protected dip(Supplier<drx<? extends dsc>> $$0, dur.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jk.c).b(d, dvk.a).b(e, Boolean.valueOf(false)));
   }

   public static djt.a h(dus $$0) {
      dvk $$1 = $$0.c(d);
      if ($$1 == dvk.a) {
         return djt.a.a;
      } else {
         return $$1 == dvk.c ? djt.a.b : djt.a.c;
      }
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.b;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dvk $$6 = $$2.c(d);
         if ($$0.c(d) == dvk.a && $$6 != dvk.a && $$0.c(c) == $$2.c(c) && i($$2) == $$1.g()) {
            return $$0.b(d, $$6.a());
         }
      } else if (i($$0) == $$1) {
         return $$0.b(d, dvk.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if ($$0.c(d) == dvk.a) {
         return m;
      } else {
         switch (i($$0)) {
            case c:
            default:
               return i;
            case d:
               return j;
            case e:
               return k;
            case f:
               return l;
         }
      }
   }

   public static jk i(dus $$0) {
      jk $$1 = $$0.c(c);
      return $$0.c(d) == dvk.b ? $$1.h() : $$1.i();
   }

   @Override
   public dus a(czn $$0) {
      dvk $$1 = dvk.a;
      jk $$2 = $$0.g().g();
      eqt $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jk $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jk $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dvk.c : dvk.b;
         }
      }

      if ($$1 == dvk.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dvk.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dvk.c;
         }
      }

      return this.n().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == equ.c));
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(e) ? equ.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jk a(czn $$0, jk $$1) {
      dus $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dvk.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      bro.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         bru $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cmo.a($$3, true);
         }
      }

      return brs.a;
   }

   protected awn<ale> c() {
      return awq.i.b(awq.ao);
   }

   public drx<? extends dsc> d() {
      return this.a.get();
   }

   @Nullable
   public static brl a(dip $$0, dus $$1, dej $$2, jf $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public djt.c<? extends dsc> a(dus $$0, dej $$1, jf $$2, boolean $$3) {
      BiPredicate<dek, jf> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dip::a;
      }

      return djt.a(this.a.get(), dip::h, dip::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static djt.b<dsc, Float2FloatFunction> a(final dta $$0) {
      return new djt.b<dsc, Float2FloatFunction>() {
         public Float2FloatFunction a(dsc $$0x, dsc $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dsc $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0.B ? a($$2, this.d(), dsc::a) : null;
   }

   public static boolean a(dek $$0, jf $$1) {
      return a((ddo)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(ddo $$0, jf $$1) {
      jf $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dek $$0, jf $$1) {
      List<cgg> $$2 = $$0.a(
         cgg.class, new eyr((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cgg $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return cqz.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      drv $$4 = $$1.c_($$2);
      if ($$4 instanceof dsc) {
         ((dsc)$$4).k();
      }
   }
}
