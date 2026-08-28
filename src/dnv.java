import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dnv extends dll<dxz> implements duc {
   public static final MapCodec<dnv> b = b($$0 -> new dnv(() -> dxt.b, $$0));
   public static final ebr<jb> c = dqs.e;
   public static final ebr<ebl> d = ebj.bf;
   public static final ebk e = ebj.I;
   public static final int f = 1;
   private static final ffw g = dmr.b(14.0, 0.0, 14.0);
   private static final Map<jb, ffw> h = fft.c(dmr.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final doz.b<dxz, Optional<btz>> i = new doz.b<dxz, Optional<btz>>() {
      public Optional<btz> a(dxz $$0, dxz $$1) {
         return Optional.of(new bty($$0, $$1));
      }

      public Optional<btz> a(dxz $$0) {
         return Optional.of($$0);
      }

      public Optional<btz> a() {
         return Optional.empty();
      }
   };
   private static final doz.b<dxz, Optional<bui>> D = new doz.b<dxz, Optional<bui>>() {
      public Optional<bui> a(final dxz $$0, final dxz $$1) {
         final btz $$2 = new bty($$0, $$1);
         return Optional.of(new bui() {
            @Nullable
            @Override
            public cvf createMenu(int $$0x, crl $$1x, crm $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.h);
                  $$1.d_($$1.h);
                  return cvo.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wy m_() {
               if ($$0.h_()) {
                  return $$0.m_();
               } else {
                  return (wy)($$1.h_() ? $$1.m_() : wy.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bui> a(dxz $$0) {
         return Optional.of($$0);
      }

      public Optional<bui> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dnv> a() {
      return b;
   }

   protected dnv(Supplier<dxt<? extends dxz>> $$0, eas.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(c, jb.c).b(d, ebl.a).b(e, Boolean.valueOf(false)));
   }

   public static doz.a h(eat $$0) {
      ebl $$1 = $$0.c(d);
      if ($$1 == ebl.a) {
         return doz.a.a;
      } else {
         return $$1 == ebl.c ? doz.a.b : doz.a.c;
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         ebl $$8 = $$6.c(d);
         if ($$0.c(d) == ebl.a && $$8 != ebl.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, ebl.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return switch ((ebl)$$0.c(d)) {
         case a -> g;
         case b, c -> (ffw)h.get(i($$0));
      };
   }

   public static jb i(eat $$0) {
      jb $$1 = $$0.c(c);
      return $$0.c(d) == ebl.b ? $$1.h() : $$1.i();
   }

   @Override
   public eat a(ddg $$0) {
      ebl $$1 = ebl.a;
      jb $$2 = $$0.g().g();
      exa $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jb $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jb $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? ebl.c : ebl.b;
         }
      }

      if ($$1 == ebl.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = ebl.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = ebl.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == exb.c));
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(e) ? exb.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jb a(ddg $$0, jb $$1) {
      eat $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == ebl.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1 instanceof arq $$5) {
         bui $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cqc.a($$5, $$3, true);
         }
      }

      return bug.a;
   }

   protected awu<alg> c() {
      return awx.i.b(awx.ao);
   }

   public dxt<? extends dxz> d() {
      return this.a.get();
   }

   @Nullable
   public static btz a(dnv $$0, eat $$1, djm $$2, iv $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public doz.c<? extends dxz> a(eat $$0, djm $$1, iv $$2, boolean $$3) {
      BiPredicate<djn, iv> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dnv::a;
      }

      return doz.a(this.a.get(), dnv::h, dnv::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return this.a($$0, $$1, $$2, false).apply(D).orElse(null);
   }

   public static doz.b<dxz, Float2FloatFunction> a(final dyy $$0) {
      return new doz.b<dxz, Float2FloatFunction>() {
         public Float2FloatFunction a(dxz $$0x, dxz $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dxz $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0.C ? a($$2, this.d(), dxz::a) : null;
   }

   public static boolean a(djn $$0, iv $$1) {
      return a((diq)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(diq $$0, iv $$1) {
      iv $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(djn $$0, iv $$1) {
      List<cjc> $$2 = $$0.a(
         cjc.class, new fex((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cjc $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return cvf.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      dxr $$4 = $$1.c_($$2);
      if ($$4 instanceof dxz) {
         ((dxz)$$4).k();
      }
   }
}
