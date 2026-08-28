import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dkq extends dih<duh> implements dqt {
   public static final MapCodec<dkq> b = b($$0 -> new dkq(() -> duc.b, $$0));
   public static final dxv<jn> c = dnl.aF;
   public static final dxv<dxq> d = dxo.bf;
   public static final dxp e = dxo.J;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fbv i = djn.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fbv j = djn.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fbv k = djn.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fbv l = djn.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fbv m = djn.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dlv.b<duh, Optional<bse>> n = new dlv.b<duh, Optional<bse>>() {
      public Optional<bse> a(duh $$0, duh $$1) {
         return Optional.of(new bsd($$0, $$1));
      }

      public Optional<bse> a(duh $$0) {
         return Optional.of($$0);
      }

      public Optional<bse> a() {
         return Optional.empty();
      }
   };
   private static final dlv.b<duh, Optional<bsn>> o = new dlv.b<duh, Optional<bsn>>() {
      public Optional<bsn> a(final duh $$0, final duh $$1) {
         final bse $$2 = new bsd($$0, $$1);
         return Optional.of(new bsn() {
            @Nullable
            @Override
            public csd createMenu(int $$0x, cox $$1x, coy $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return csm.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wp p_() {
               if ($$0.l_()) {
                  return $$0.p_();
               } else {
                  return (wp)($$1.l_() ? $$1.p_() : wp.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bsn> a(duh $$0) {
         return Optional.of($$0);
      }

      public Optional<bsn> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dkq> a() {
      return b;
   }

   protected dkq(Supplier<duc<? extends duh>> $$0, dwx.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jn.c).b(d, dxq.a).b(e, Boolean.valueOf(false)));
   }

   public static dlv.a h(dwy $$0) {
      dxq $$1 = $$0.c(d);
      if ($$1 == dxq.a) {
         return dlv.a.a;
      } else {
         return $$1 == dxq.c ? dlv.a.b : dlv.a.c;
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dxq $$8 = $$6.c(d);
         if ($$0.c(d) == dxq.a && $$8 != dxq.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dxq.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if ($$0.c(d) == dxq.a) {
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

   public static jn i(dwy $$0) {
      jn $$1 = $$0.c(c);
      return $$0.c(d) == dxq.b ? $$1.h() : $$1.i();
   }

   @Override
   public dwy a(dah $$0) {
      dxq $$1 = dxq.a;
      jn $$2 = $$0.g().g();
      eta $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jn $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jn $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dxq.c : dxq.b;
         }
      }

      if ($$1 == dxq.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dxq.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dxq.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == etb.c));
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(e) ? etb.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jn a(dah $$0, jn $$1) {
      dwy $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dxq.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      bsh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$1 instanceof ard $$5) {
         bsn $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cnn.a($$5, $$3, true);
         }
      }

      return bsl.a;
   }

   protected awh<akv> c() {
      return awk.i.b(awk.ao);
   }

   public duc<? extends duh> d() {
      return this.a.get();
   }

   @Nullable
   public static bse a(dkq $$0, dwy $$1, dgj $$2, ji $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dlv.c<? extends duh> a(dwy $$0, dgj $$1, ji $$2, boolean $$3) {
      BiPredicate<dgk, ji> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dkq::a;
      }

      return dlv.a(this.a.get(), dkq::h, dkq::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dlv.b<duh, Float2FloatFunction> a(final dvg $$0) {
      return new dlv.b<duh, Float2FloatFunction>() {
         public Float2FloatFunction a(duh $$0x, duh $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(duh $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new duh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0.C ? a($$2, this.d(), duh::a) : null;
   }

   public static boolean a(dgk $$0, ji $$1) {
      return a((dfo)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dfo $$0, ji $$1) {
      ji $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dgk $$0, ji $$1) {
      List<chc> $$2 = $$0.a(
         chc.class, new faw((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (chc $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return csd.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      dua $$4 = $$1.c_($$2);
      if ($$4 instanceof duh) {
         ((duh)$$4).k();
      }
   }
}
