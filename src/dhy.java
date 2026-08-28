import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dhy extends dfp<drl> implements dnx {
   public static final MapCodec<dhy> b = b($$0 -> new dhy($$0, () -> drg.b));
   public static final duu c = dkr.aE;
   public static final duy<dus> d = duq.bc;
   public static final dur e = duq.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eyx i = dgv.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eyx j = dgv.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eyx k = dgv.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eyx l = dgv.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eyx m = dgv.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final djc.b<drl, Optional<brd>> n = new djc.b<drl, Optional<brd>>() {
      public Optional<brd> a(drl $$0, drl $$1) {
         return Optional.of(new brc($$0, $$1));
      }

      public Optional<brd> a(drl $$0) {
         return Optional.of($$0);
      }

      public Optional<brd> a() {
         return Optional.empty();
      }
   };
   private static final djc.b<drl, Optional<brm>> o = new djc.b<drl, Optional<brm>>() {
      public Optional<brm> a(final drl $$0, final drl $$1) {
         final brd $$2 = new brc($$0, $$1);
         return Optional.of(new brm() {
            @Nullable
            @Override
            public cqq createMenu(int $$0x, cno $$1x, cnp $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.k);
                  $$1.e_($$1.k);
                  return cqz.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xd Q_() {
               if ($$0.ak()) {
                  return $$0.Q_();
               } else {
                  return (xd)($$1.ak() ? $$1.Q_() : xd.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<brm> a(drl $$0) {
         return Optional.of($$0);
      }

      public Optional<brm> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dhy> a() {
      return b;
   }

   protected dhy(dtz.d $$0, Supplier<drg<? extends drl>> $$1) {
      super($$0, $$1);
      this.l(this.E.b().b(c, jj.c).b(d, dus.a).b(e, Boolean.valueOf(false)));
   }

   public static djc.a h(dua $$0) {
      dus $$1 = $$0.c(d);
      if ($$1 == dus.a) {
         return djc.a.a;
      } else {
         return $$1 == dus.c ? djc.a.b : djc.a.c;
      }
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.b;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dus $$6 = $$2.c(d);
         if ($$0.c(d) == dus.a && $$6 != dus.a && $$0.c(c) == $$2.c(c) && i($$2) == $$1.g()) {
            return $$0.b(d, $$6.a());
         }
      } else if (i($$0) == $$1) {
         return $$0.b(d, dus.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if ($$0.c(d) == dus.a) {
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

   public static jj i(dua $$0) {
      jj $$1 = $$0.c(c);
      return $$0.c(d) == dus.b ? $$1.h() : $$1.i();
   }

   @Override
   public dua a(cyw $$0) {
      dus $$1 = dus.a;
      jj $$2 = $$0.g().g();
      eqb $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jj $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jj $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dus.c : dus.b;
         }
      }

      if ($$1 == dus.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dus.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dus.c;
         }
      }

      return this.o().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == eqc.c));
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(e) ? eqc.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jj a(cyw $$0, jj $$1) {
      dua $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dus.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      brg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         brm $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cmg.a($$3, true);
         }
      }

      return brk.a;
   }

   protected awk<alb> c() {
      return awn.i.b(awn.ao);
   }

   public drg<? extends drl> d() {
      return this.a.get();
   }

   @Nullable
   public static brd a(dhy $$0, dua $$1, dds $$2, je $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public djc.c<? extends drl> a(dua $$0, dds $$1, je $$2, boolean $$3) {
      BiPredicate<ddt, je> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dhy::a;
      }

      return djc.a(this.a.get(), dhy::h, dhy::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static djc.b<drl, Float2FloatFunction> a(final dsj $$0) {
      return new djc.b<drl, Float2FloatFunction>() {
         public Float2FloatFunction a(drl $$0x, drl $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(drl $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new drl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0.B ? a($$2, this.d(), drl::a) : null;
   }

   public static boolean a(ddt $$0, je $$1) {
      return a((dcx)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dcx $$0, je $$1) {
      je $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(ddt $$0, je $$1) {
      List<cfy> $$2 = $$0.a(
         cfy.class, new exz((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cfy $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return cqq.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      dre $$4 = $$1.c_($$2);
      if ($$4 instanceof drl) {
         ((drl)$$4).k();
      }
   }
}
