import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dhb extends des<dqo> implements dna {
   public static final MapCodec<dhb> b = b($$0 -> new dhb($$0, () -> dqj.b));
   public static final dtw c = dju.aE;
   public static final dua<dtu> d = dts.bc;
   public static final dtt e = dts.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ext i = dfy.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ext j = dfy.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ext k = dfy.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ext l = dfy.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ext m = dfy.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dif.b<dqo, Optional<bqk>> n = new dif.b<dqo, Optional<bqk>>() {
      public Optional<bqk> a(dqo $$0, dqo $$1) {
         return Optional.of(new bqj($$0, $$1));
      }

      public Optional<bqk> a(dqo $$0) {
         return Optional.of($$0);
      }

      public Optional<bqk> a() {
         return Optional.empty();
      }
   };
   private static final dif.b<dqo, Optional<bqv>> o = new dif.b<dqo, Optional<bqv>>() {
      public Optional<bqv> a(final dqo $$0, final dqo $$1) {
         final bqk $$2 = new bqj($$0, $$1);
         return Optional.of(new bqv() {
            @Nullable
            @Override
            public cpu createMenu(int $$0x, cmw $$1x, cmx $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cqc.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wz S_() {
               if ($$0.ai()) {
                  return $$0.S_();
               } else {
                  return (wz)($$1.ai() ? $$1.S_() : wz.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqv> a(dqo $$0) {
         return Optional.of($$0);
      }

      public Optional<bqv> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dhb> a() {
      return b;
   }

   protected dhb(dtb.d $$0, Supplier<dqj<? extends dqo>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ji.c).a(d, dtu.a).a(e, Boolean.valueOf(false)));
   }

   public static dif.a g(dtc $$0) {
      dtu $$1 = $$0.c(d);
      if ($$1 == dtu.a) {
         return dif.a.a;
      } else {
         return $$1 == dtu.c ? dif.a.b : dif.a.c;
      }
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.b;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dtu $$6 = $$2.c(d);
         if ($$0.c(d) == dtu.a && $$6 != dtu.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dtu.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      if ($$0.c(d) == dtu.a) {
         return m;
      } else {
         switch (h($$0)) {
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

   public static ji h(dtc $$0) {
      ji $$1 = $$0.c(c);
      return $$0.c(d) == dtu.b ? $$1.h() : $$1.i();
   }

   @Override
   public dtc a(cyd $$0) {
      dtu $$1 = dtu.a;
      ji $$2 = $$0.g().g();
      epc $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ji $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ji $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dtu.c : dtu.b;
         }
      }

      if ($$1 == dtu.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dtu.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dtu.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == epd.c));
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(e) ? epd.c.a(false) : super.b_($$0);
   }

   @Nullable
   private ji a(cyd $$0, ji $$1) {
      dtc $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dtu.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      bqn.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         bqv $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clo.a($$3, true);
         }

         return bqr.c;
      }
   }

   protected avw<akr> c() {
      return avz.i.b(avz.ao);
   }

   public dqj<? extends dqo> d() {
      return this.a.get();
   }

   @Nullable
   public static bqk a(dhb $$0, dtc $$1, dcw $$2, jd $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dif.c<? extends dqo> a(dtc $$0, dcw $$1, jd $$2, boolean $$3) {
      BiPredicate<dcx, jd> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dhb::a;
      }

      return dif.a(this.a.get(), dhb::g, dhb::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dif.b<dqo, Float2FloatFunction> a(final drl $$0) {
      return new dif.b<dqo, Float2FloatFunction>() {
         public Float2FloatFunction a(dqo $$0x, dqo $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dqo $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$0.B ? a($$2, this.d(), dqo::a) : null;
   }

   public static boolean a(dcx $$0, jd $$1) {
      return a((dcc)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dcc $$0, jd $$1) {
      jd $$2 = $$1.d();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dcx $$0, jd $$1) {
      List<cfh> $$2 = $$0.a(
         cfh.class, new ewv((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cfh $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return cpu.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      dqh $$4 = $$1.c_($$2);
      if ($$4 instanceof dqo) {
         ((dqo)$$4).l();
      }
   }
}
