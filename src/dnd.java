import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dnd extends dku<dxf> implements dtj {
   public static final MapCodec<dnd> b = b($$0 -> new dnd(() -> dwz.b, $$0));
   public static final eax<ja> c = dqa.e;
   public static final eax<ear> d = eap.bf;
   public static final eaq e = eap.I;
   public static final int f = 1;
   private static final ffc g = dma.b(14.0, 0.0, 14.0);
   private static final Map<ja, ffc> h = fez.c(dma.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final doi.b<dxf, Optional<btu>> i = new doi.b<dxf, Optional<btu>>() {
      public Optional<btu> a(dxf $$0, dxf $$1) {
         return Optional.of(new btt($$0, $$1));
      }

      public Optional<btu> a(dxf $$0) {
         return Optional.of($$0);
      }

      public Optional<btu> a() {
         return Optional.empty();
      }
   };
   private static final doi.b<dxf, Optional<bud>> C = new doi.b<dxf, Optional<bud>>() {
      public Optional<bud> a(final dxf $$0, final dxf $$1) {
         final btu $$2 = new btt($$0, $$1);
         return Optional.of(new bud() {
            @Nullable
            @Override
            public cuq createMenu(int $$0x, cqx $$1x, cqy $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return cuz.b($$0, $$1, $$2);
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

      public Optional<bud> a(dxf $$0) {
         return Optional.of($$0);
      }

      public Optional<bud> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dnd> a() {
      return b;
   }

   protected dnd(Supplier<dwz<? extends dxf>> $$0, dzy.d $$1) {
      super($$1, $$0);
      this.l(this.B.b().b(c, ja.c).b(d, ear.a).b(e, Boolean.valueOf(false)));
   }

   public static doi.a h(dzz $$0) {
      ear $$1 = $$0.c(d);
      if ($$1 == ear.a) {
         return doi.a.a;
      } else {
         return $$1 == ear.c ? doi.a.b : doi.a.c;
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         ear $$8 = $$6.c(d);
         if ($$0.c(d) == ear.a && $$8 != ear.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, ear.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return switch ((ear)$$0.c(d)) {
         case a -> g;
         case b, c -> (ffc)h.get(i($$0));
      };
   }

   public static ja i(dzz $$0) {
      ja $$1 = $$0.c(c);
      return $$0.c(d) == ear.b ? $$1.h() : $$1.i();
   }

   @Override
   public dzz a(dcr $$0) {
      ear $$1 = ear.a;
      ja $$2 = $$0.g().g();
      ewg $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ja $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ja $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? ear.c : ear.b;
         }
      }

      if ($$1 == ear.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = ear.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = ear.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == ewh.c));
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(e) ? ewh.c.a(false) : super.b_($$0);
   }

   @Nullable
   private ja a(dcr $$0, ja $$1) {
      dzz $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == ear.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1 instanceof arq $$5) {
         bud $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cpo.a($$5, $$3, true);
         }
      }

      return bub.a;
   }

   protected awu<alg> c() {
      return awx.i.b(awx.ao);
   }

   public dwz<? extends dxf> d() {
      return this.a.get();
   }

   @Nullable
   public static btu a(dnd $$0, dzz $$1, div $$2, iu $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public doi.c<? extends dxf> a(dzz $$0, div $$1, iu $$2, boolean $$3) {
      BiPredicate<diw, iu> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dnd::a;
      }

      return doi.a(this.a.get(), dnd::h, dnd::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return this.a($$0, $$1, $$2, false).apply(C).orElse(null);
   }

   public static doi.b<dxf, Float2FloatFunction> a(final dye $$0) {
      return new doi.b<dxf, Float2FloatFunction>() {
         public Float2FloatFunction a(dxf $$0x, dxf $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dxf $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0.C ? a($$2, this.d(), dxf::a) : null;
   }

   public static boolean a(diw $$0, iu $$1) {
      return a((dib)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dib $$0, iu $$1) {
      iu $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(diw $$0, iu $$1) {
      List<civ> $$2 = $$0.a(
         civ.class, new fed((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (civ $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return cuq.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      dwx $$4 = $$1.c_($$2);
      if ($$4 instanceof dxf) {
         ((dxf)$$4).k();
      }
   }
}
