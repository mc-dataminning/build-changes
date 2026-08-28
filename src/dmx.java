import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dmx extends dko<dwv> implements dtb {
   public static final MapCodec<dmx> b = b($$0 -> new dmx(() -> dwp.b, $$0));
   public static final eam<ja> c = dpt.e;
   public static final eam<eag> d = eae.bf;
   public static final eaf e = eae.I;
   public static final int f = 1;
   private static final feq g = dlu.b(14.0, 0.0, 14.0);
   private static final Map<ja, feq> h = fen.c(dlu.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final doc.b<dwv, Optional<btr>> i = new doc.b<dwv, Optional<btr>>() {
      public Optional<btr> a(dwv $$0, dwv $$1) {
         return Optional.of(new btq($$0, $$1));
      }

      public Optional<btr> a(dwv $$0) {
         return Optional.of($$0);
      }

      public Optional<btr> a() {
         return Optional.empty();
      }
   };
   private static final doc.b<dwv, Optional<bua>> C = new doc.b<dwv, Optional<bua>>() {
      public Optional<bua> a(final dwv $$0, final dwv $$1) {
         final btr $$2 = new btq($$0, $$1);
         return Optional.of(new bua() {
            @Nullable
            @Override
            public cuk createMenu(int $$0x, cqr $$1x, cqs $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return cut.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public ww m_() {
               if ($$0.h_()) {
                  return $$0.m_();
               } else {
                  return (ww)($$1.h_() ? $$1.m_() : ww.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bua> a(dwv $$0) {
         return Optional.of($$0);
      }

      public Optional<bua> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dmx> a() {
      return b;
   }

   protected dmx(Supplier<dwp<? extends dwv>> $$0, dzn.d $$1) {
      super($$1, $$0);
      this.l(this.B.b().b(c, ja.c).b(d, eag.a).b(e, Boolean.valueOf(false)));
   }

   public static doc.a h(dzo $$0) {
      eag $$1 = $$0.c(d);
      if ($$1 == eag.a) {
         return doc.a.a;
      } else {
         return $$1 == eag.c ? doc.a.b : doc.a.c;
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         eag $$8 = $$6.c(d);
         if ($$0.c(d) == eag.a && $$8 != eag.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, eag.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return switch ((eag)$$0.c(d)) {
         case a -> g;
         case b, c -> (feq)h.get(i($$0));
      };
   }

   public static ja i(dzo $$0) {
      ja $$1 = $$0.c(c);
      return $$0.c(d) == eag.b ? $$1.h() : $$1.i();
   }

   @Override
   public dzo a(dcl $$0) {
      eag $$1 = eag.a;
      ja $$2 = $$0.g().g();
      evv $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ja $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ja $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? eag.c : eag.b;
         }
      }

      if ($$1 == eag.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = eag.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = eag.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == evw.c));
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(e) ? evw.c.a(false) : super.b_($$0);
   }

   @Nullable
   private ja a(dcl $$0, ja $$1) {
      dzo $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == eag.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1 instanceof aro $$5) {
         bua $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cpi.a($$5, $$3, true);
         }
      }

      return bty.a;
   }

   protected aws<ale> c() {
      return awv.i.b(awv.ao);
   }

   public dwp<? extends dwv> d() {
      return this.a.get();
   }

   @Nullable
   public static btr a(dmx $$0, dzo $$1, dip $$2, iu $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public doc.c<? extends dwv> a(dzo $$0, dip $$1, iu $$2, boolean $$3) {
      BiPredicate<diq, iu> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dmx::a;
      }

      return doc.a(this.a.get(), dmx::h, dmx::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return this.a($$0, $$1, $$2, false).apply(C).orElse(null);
   }

   public static doc.b<dwv, Float2FloatFunction> a(final dxu $$0) {
      return new doc.b<dwv, Float2FloatFunction>() {
         public Float2FloatFunction a(dwv $$0x, dwv $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dwv $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0.C ? a($$2, this.d(), dwv::a) : null;
   }

   public static boolean a(diq $$0, iu $$1) {
      return a((dhv)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dhv $$0, iu $$1) {
      iu $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(diq $$0, iu $$1) {
      List<cir> $$2 = $$0.a(
         cir.class, new fdr((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cir $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return cuk.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dwn $$4 = $$1.c_($$2);
      if ($$4 instanceof dwv) {
         ((dwv)$$4).k();
      }
   }
}
