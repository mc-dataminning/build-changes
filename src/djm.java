import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class djm extends dhd<dsy> implements dpk {
   public static final MapCodec<djm> b = b($$0 -> new djm(() -> dst.b, $$0));
   public static final dwl<jm> c = dme.aF;
   public static final dwl<dwg> d = dwe.bc;
   public static final dwf e = dwe.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fal i = dij.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fal j = dij.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fal k = dij.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fal l = dij.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fal m = dij.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dkq.b<dsy, Optional<bsa>> n = new dkq.b<dsy, Optional<bsa>>() {
      public Optional<bsa> a(dsy $$0, dsy $$1) {
         return Optional.of(new brz($$0, $$1));
      }

      public Optional<bsa> a(dsy $$0) {
         return Optional.of($$0);
      }

      public Optional<bsa> a() {
         return Optional.empty();
      }
   };
   private static final dkq.b<dsy, Optional<bsj>> o = new dkq.b<dsy, Optional<bsj>>() {
      public Optional<bsj> a(final dsy $$0, final dsy $$1) {
         final bsa $$2 = new brz($$0, $$1);
         return Optional.of(new bsj() {
            @Nullable
            @Override
            public crs createMenu(int $$0x, coq $$1x, cor $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.k);
                  $$1.e_($$1.k);
                  return csb.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xl S_() {
               if ($$0.an()) {
                  return $$0.S_();
               } else {
                  return (xl)($$1.an() ? $$1.S_() : xl.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bsj> a(dsy $$0) {
         return Optional.of($$0);
      }

      public Optional<bsj> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends djm> a() {
      return b;
   }

   protected djm(Supplier<dst<? extends dsy>> $$0, dvn.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jm.c).b(d, dwg.a).b(e, Boolean.valueOf(false)));
   }

   public static dkq.a h(dvo $$0) {
      dwg $$1 = $$0.c(d);
      if ($$1 == dwg.a) {
         return dkq.a.a;
      } else {
         return $$1 == dwg.c ? dkq.a.b : dkq.a.c;
      }
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.b;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dwg $$8 = $$6.c(d);
         if ($$0.c(d) == dwg.a && $$8 != dwg.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dwg.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if ($$0.c(d) == dwg.a) {
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

   public static jm i(dvo $$0) {
      jm $$1 = $$0.c(c);
      return $$0.c(d) == dwg.b ? $$1.h() : $$1.i();
   }

   @Override
   public dvo a(czw $$0) {
      dwg $$1 = dwg.a;
      jm $$2 = $$0.g().g();
      ero $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jm $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jm $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dwg.c : dwg.b;
         }
      }

      if ($$1 == dwg.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dwg.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dwg.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == erp.c));
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(e) ? erp.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jm a(czw $$0, jm $$1) {
      dvo $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dwg.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      bsd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         bsj $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cng.a($$3, true);
         }
      }

      return bsh.a;
   }

   protected awv<all> c() {
      return awy.i.b(awy.ao);
   }

   public dst<? extends dsy> d() {
      return this.a.get();
   }

   @Nullable
   public static bsa a(djm $$0, dvo $$1, dff $$2, jh $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dkq.c<? extends dsy> a(dvo $$0, dff $$1, jh $$2, boolean $$3) {
      BiPredicate<dfg, jh> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = djm::a;
      }

      return dkq.a(this.a.get(), djm::h, djm::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dkq.b<dsy, Float2FloatFunction> a(final dtw $$0) {
      return new dkq.b<dsy, Float2FloatFunction>() {
         public Float2FloatFunction a(dsy $$0x, dsy $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dsy $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0.C ? a($$2, this.d(), dsy::a) : null;
   }

   public static boolean a(dfg $$0, jh $$1) {
      return a((dek)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dek $$0, jh $$1) {
      jh $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dfg $$0, jh $$1) {
      List<cgy> $$2 = $$0.a(
         cgy.class, new ezm((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cgy $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return crs.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      dsr $$4 = $$1.c_($$2);
      if ($$4 instanceof dsy) {
         ((dsy)$$4).k();
      }
   }
}
