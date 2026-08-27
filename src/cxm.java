import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cxm extends cvd<dgv> implements ddj {
   public static final MapCodec<cxm> b = b($$0 -> new cxm($$0, () -> dgq.b));
   public static final dju c = dae.aE;
   public static final djy<djs> d = djq.bc;
   public static final djr e = djq.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final emf i = cwj.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final emf j = cwj.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final emf k = cwj.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final emf l = cwj.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final emf m = cwj.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cyq.b<dgv, Optional<bjo>> n = new cyq.b<dgv, Optional<bjo>>() {
      public Optional<bjo> a(dgv $$0, dgv $$1) {
         return Optional.of(new bjn($$0, $$1));
      }

      public Optional<bjo> a(dgv $$0) {
         return Optional.of($$0);
      }

      public Optional<bjo> a() {
         return Optional.empty();
      }
   };
   private static final cyq.b<dgv, Optional<bjy>> o = new cyq.b<dgv, Optional<bjy>>() {
      public Optional<bjy> a(final dgv $$0, final dgv $$1) {
         final bjo $$2 = new bjn($$0, $$1);
         return Optional.of(new bjy() {
            @Nullable
            @Override
            public chu createMenu(int $$0x, cfa $$1x, cfb $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return cib.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public vd Q_() {
               if ($$0.ae()) {
                  return $$0.Q_();
               } else {
                  return (vd)($$1.ae() ? $$1.Q_() : vd.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bjy> a(dgv $$0) {
         return Optional.of($$0);
      }

      public Optional<bjy> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cxm> a() {
      return b;
   }

   protected cxm(diz.d $$0, Supplier<dgq<? extends dgv>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ic.c).a(d, djs.a).a(e, Boolean.valueOf(false)));
   }

   public static cyq.a g(dja $$0) {
      djs $$1 = $$0.c(d);
      if ($$1 == djs.a) {
         return cyq.a.a;
      } else {
         return $$1 == djs.c ? cyq.a.b : cyq.a.c;
      }
   }

   @Override
   public dco b_(dja $$0) {
      return dco.b;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         djs $$6 = $$2.c(d);
         if ($$0.c(d) == djs.a && $$6 != djs.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, djs.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      if ($$0.c(d) == djs.a) {
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

   public static ic h(dja $$0) {
      ic $$1 = $$0.c(c);
      return $$0.c(d) == djs.b ? $$1.h() : $$1.i();
   }

   @Override
   public dja a(cpa $$0) {
      djs $$1 = djs.a;
      ic $$2 = $$0.g().g();
      eek $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ic $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ic $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? djs.c : djs.b;
         }
      }

      if ($$1 == djs.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = djs.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = djs.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eel.c));
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(e) ? eel.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ic a(cpa $$0, ic $$1) {
      dja $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == djs.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dgv) {
            ((dgv)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      bjr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         bjy $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cds.a($$3, true);
         }

         return bjv.b;
      }
   }

   protected art<ahd> c() {
      return arw.i.b(arw.ao);
   }

   public dgq<? extends dgv> d() {
      return this.a.get();
   }

   @Nullable
   public static bjo a(cxm $$0, dja $$1, cti $$2, hx $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cyq.c<? extends dgv> a(dja $$0, cti $$1, hx $$2, boolean $$3) {
      BiPredicate<ctj, hx> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cxm::a;
      }

      return cyq.a(this.a.get(), cxm::g, cxm::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cyq.b<dgv, Float2FloatFunction> a(final dhr $$0) {
      return new cyq.b<dgv, Float2FloatFunction>() {
         public Float2FloatFunction a(dgv $$0x, dgv $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dgv $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0.B ? a($$2, this.d(), dgv::a) : null;
   }

   public static boolean a(ctj $$0, hx $$1) {
      return a((cso)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cso $$0, hx $$1) {
      hx $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(ctj $$0, hx $$1) {
      List<bxv> $$2 = $$0.a(
         bxv.class, new elh((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bxv $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return chu.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      dgo $$4 = $$1.c_($$2);
      if ($$4 instanceof dgv) {
         ((dgv)$$4).m();
      }
   }
}
