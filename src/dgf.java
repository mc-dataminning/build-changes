import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgf extends ddv<dqj> implements dmr {
   public static final MapCodec<dgf> b = b($$0 -> new dgf($$0, () -> dqe.c));
   public static final dtw c = djc.aE;
   public static final dua<dtu> d = dts.bc;
   public static final dtt e = dts.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final exn i = dfc.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final exn j = dfc.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final exn k = dfc.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final exn l = dfc.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final exn m = dfc.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhk.b<dqj, Optional<bpt>> n = new dhk.b<dqj, Optional<bpt>>() {
      public Optional<bpt> a(dqj $$0, dqj $$1) {
         return Optional.of(new bps($$0, $$1));
      }

      public Optional<bpt> a(dqj $$0) {
         return Optional.of($$0);
      }

      public Optional<bpt> a() {
         return Optional.empty();
      }
   };
   private static final dhk.b<dqj, Optional<bqe>> o = new dhk.b<dqj, Optional<bqe>>() {
      public Optional<bqe> a(final dqj $$0, final dqj $$1) {
         final bpt $$2 = new bps($$0, $$1);
         return Optional.of(new bqe() {
            @Nullable
            @Override
            public cpg createMenu(int $$0x, clx $$1x, cly $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cpn.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xe P_() {
               if ($$0.ag()) {
                  return $$0.P_();
               } else {
                  return (xe)($$1.ag() ? $$1.P_() : xe.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqe> a(dqj $$0) {
         return Optional.of($$0);
      }

      public Optional<bqe> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dgf> a() {
      return b;
   }

   protected dgf(dtb.d $$0, Supplier<dqe<? extends dqj>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, iw.c).a(d, dtu.a).a(e, Boolean.valueOf(false)));
   }

   public static dhk.a g(dtc $$0) {
      dtu $$1 = $$0.c(d);
      if ($$1 == dtu.a) {
         return dhk.a.a;
      } else {
         return $$1 == dtu.c ? dhk.a.b : dhk.a.c;
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.b;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
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
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
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

   public static iw h(dtc $$0) {
      iw $$1 = $$0.c(c);
      return $$0.c(d) == dtu.b ? $$1.h() : $$1.i();
   }

   @Override
   public dtc a(cyd $$0) {
      dtu $$1 = dtu.a;
      iw $$2 = $$0.g().g();
      epe $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      iw $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         iw $$6 = this.a($$0, $$5.g());
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

      return this.n().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == epf.c));
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(e) ? epf.c.a(false) : super.b_($$0);
   }

   @Nullable
   private iw a(cyd $$0, iw $$1) {
      dtc $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dtu.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      bpw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         bqe $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            ckp.a($$3, true);
         }

         bpt $$6 = a(this, $$0, $$1, $$2, false);
         if ($$6 != null) {
            $$6.a($$3x -> {
               if ($$3x.b(ke.ai)) {
                  $$3x.b(ke.ai, Integer.valueOf($$3x.a(ke.ai, Integer.valueOf(0)) + 1));
                  $$3x.f().a($$3x, $$1, $$2, $$6);
               }
            });
         }

         return bqa.b;
      }
   }

   protected avw<akt> c() {
      return avz.i.b(avz.ap);
   }

   public dqe<? extends dqj> d() {
      return this.a.get();
   }

   @Nullable
   public static bpt a(dgf $$0, dtc $$1, dca $$2, ir $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhk.c<? extends dqj> a(dtc $$0, dca $$1, ir $$2, boolean $$3) {
      BiPredicate<dcb, ir> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dgf::a;
      }

      return dhk.a(this.a.get(), dgf::g, dgf::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhk.b<dqj, Float2FloatFunction> a(final drh $$0) {
      return new dhk.b<dqj, Float2FloatFunction>() {
         public Float2FloatFunction a(dqj $$0x, dqj $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dqj $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0.C ? a($$2, this.d(), dqj::a) : null;
   }

   public static boolean a(dcb $$0, ir $$1) {
      return a((dbg)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbg $$0, ir $$1) {
      ir $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dcb $$0, ir $$1) {
      List<ceh> $$2 = $$0.a(
         ceh.class, new ewp((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (ceh $$3 : $$2) {
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
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return cpg.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      dqc $$4 = $$1.c_($$2);
      if ($$4 instanceof dqj) {
         ((dqj)$$4).l();
      }
   }
}
