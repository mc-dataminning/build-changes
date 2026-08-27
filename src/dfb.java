import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dfb extends dcs<don> implements dkz {
   public static final MapCodec<dfb> b = b($$0 -> new dfb($$0, () -> doi.b));
   public static final drv c = dhu.aE;
   public static final drz<drt> d = drr.bc;
   public static final drs e = drr.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final evd i = ddy.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final evd j = ddy.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final evd k = ddy.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final evd l = ddy.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final evd m = ddy.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dgf.b<don, Optional<bpn>> n = new dgf.b<don, Optional<bpn>>() {
      public Optional<bpn> a(don $$0, don $$1) {
         return Optional.of(new bpm($$0, $$1));
      }

      public Optional<bpn> a(don $$0) {
         return Optional.of($$0);
      }

      public Optional<bpn> a() {
         return Optional.empty();
      }
   };
   private static final dgf.b<don, Optional<bpy>> o = new dgf.b<don, Optional<bpy>>() {
      public Optional<bpy> a(final don $$0, final don $$1) {
         final bpn $$2 = new bpm($$0, $$1);
         return Optional.of(new bpy() {
            @Nullable
            @Override
            public cot createMenu(int $$0x, clv $$1x, clw $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cpa.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wx O_() {
               if ($$0.ag()) {
                  return $$0.O_();
               } else {
                  return (wx)($$1.ag() ? $$1.O_() : wx.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bpy> a(don $$0) {
         return Optional.of($$0);
      }

      public Optional<bpy> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dfb> a() {
      return b;
   }

   protected dfb(dra.d $$0, Supplier<doi<? extends don>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, it.c).a(d, drt.a).a(e, Boolean.valueOf(false)));
   }

   public static dgf.a g(drb $$0) {
      drt $$1 = $$0.c(d);
      if ($$1 == drt.a) {
         return dgf.a.a;
      } else {
         return $$1 == drt.c ? dgf.a.b : dgf.a.c;
      }
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.b;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         drt $$6 = $$2.c(d);
         if ($$0.c(d) == drt.a && $$6 != drt.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, drt.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      if ($$0.c(d) == drt.a) {
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

   public static it h(drb $$0) {
      it $$1 = $$0.c(c);
      return $$0.c(d) == drt.b ? $$1.h() : $$1.i();
   }

   @Override
   public drb a(cwz $$0) {
      drt $$1 = drt.a;
      it $$2 = $$0.g().g();
      emu $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      it $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         it $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? drt.c : drt.b;
         }
      }

      if ($$1 == drt.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = drt.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = drt.c;
         }
      }

      return this.n().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == emv.c));
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(e) ? emv.c.a(false) : super.b_($$0);
   }

   @Nullable
   private it a(cwz $$0, it $$1) {
      drb $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == drt.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      bpq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         bpy $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            ckn.a($$3, true);
         }

         return bpu.b;
      }
   }

   protected avo<akm> c() {
      return avr.i.b(avr.ao);
   }

   public doi<? extends don> d() {
      return this.a.get();
   }

   @Nullable
   public static bpn a(dfb $$0, drb $$1, dax $$2, io $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dgf.c<? extends don> a(drb $$0, dax $$1, io $$2, boolean $$3) {
      BiPredicate<day, io> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dfb::a;
      }

      return dgf.a(this.a.get(), dfb::g, dfb::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dgf.b<don, Float2FloatFunction> a(final dpj $$0) {
      return new dgf.b<don, Float2FloatFunction>() {
         public Float2FloatFunction a(don $$0x, don $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(don $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new don($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0.B ? a($$2, this.d(), don::a) : null;
   }

   public static boolean a(day $$0, io $$1) {
      return a((dad)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dad $$0, io $$1) {
      io $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(day $$0, io $$1) {
      List<ceh> $$2 = $$0.a(
         ceh.class, new euf((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (ceh $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return cot.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      dog $$4 = $$1.c_($$2);
      if ($$4 instanceof don) {
         ((don)$$4).l();
      }
   }
}
