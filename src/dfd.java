import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dfd extends dcu<dop> implements dlb {
   public static final MapCodec<dfd> b = b($$0 -> new dfd($$0, () -> dok.b));
   public static final drx c = dhw.aE;
   public static final dsb<drv> d = drt.bc;
   public static final dru e = drt.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final evf i = dea.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final evf j = dea.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final evf k = dea.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final evf l = dea.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final evf m = dea.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dgh.b<dop, Optional<bpp>> n = new dgh.b<dop, Optional<bpp>>() {
      public Optional<bpp> a(dop $$0, dop $$1) {
         return Optional.of(new bpo($$0, $$1));
      }

      public Optional<bpp> a(dop $$0) {
         return Optional.of($$0);
      }

      public Optional<bpp> a() {
         return Optional.empty();
      }
   };
   private static final dgh.b<dop, Optional<bqa>> o = new dgh.b<dop, Optional<bqa>>() {
      public Optional<bqa> a(final dop $$0, final dop $$1) {
         final bpp $$2 = new bpo($$0, $$1);
         return Optional.of(new bqa() {
            @Nullable
            @Override
            public cov createMenu(int $$0x, clx $$1x, cly $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cpc.b($$0, $$1, $$2);
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

      public Optional<bqa> a(dop $$0) {
         return Optional.of($$0);
      }

      public Optional<bqa> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dfd> a() {
      return b;
   }

   protected dfd(drc.d $$0, Supplier<dok<? extends dop>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, it.c).a(d, drv.a).a(e, Boolean.valueOf(false)));
   }

   public static dgh.a g(drd $$0) {
      drv $$1 = $$0.c(d);
      if ($$1 == drv.a) {
         return dgh.a.a;
      } else {
         return $$1 == drv.c ? dgh.a.b : dgh.a.c;
      }
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.b;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         drv $$6 = $$2.c(d);
         if ($$0.c(d) == drv.a && $$6 != drv.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, drv.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      if ($$0.c(d) == drv.a) {
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

   public static it h(drd $$0) {
      it $$1 = $$0.c(c);
      return $$0.c(d) == drv.b ? $$1.h() : $$1.i();
   }

   @Override
   public drd a(cxb $$0) {
      drv $$1 = drv.a;
      it $$2 = $$0.g().g();
      emw $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      it $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         it $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? drv.c : drv.b;
         }
      }

      if ($$1 == drv.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = drv.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = drv.c;
         }
      }

      return this.n().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == emx.c));
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(e) ? emx.c.a(false) : super.b_($$0);
   }

   @Nullable
   private it a(cxb $$0, it $$1) {
      drd $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == drv.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      bps.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         bqa $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            ckp.a($$3, true);
         }

         return bpw.b;
      }
   }

   protected avp<akn> c() {
      return avs.i.b(avs.ao);
   }

   public dok<? extends dop> d() {
      return this.a.get();
   }

   @Nullable
   public static bpp a(dfd $$0, drd $$1, daz $$2, io $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dgh.c<? extends dop> a(drd $$0, daz $$1, io $$2, boolean $$3) {
      BiPredicate<dba, io> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dfd::a;
      }

      return dgh.a(this.a.get(), dfd::g, dfd::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dgh.b<dop, Float2FloatFunction> a(final dpl $$0) {
      return new dgh.b<dop, Float2FloatFunction>() {
         public Float2FloatFunction a(dop $$0x, dop $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dop $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dop($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0.B ? a($$2, this.d(), dop::a) : null;
   }

   public static boolean a(dba $$0, io $$1) {
      return a((daf)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(daf $$0, io $$1) {
      io $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dba $$0, io $$1) {
      List<cej> $$2 = $$0.a(
         cej.class, new euh((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cej $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return cov.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      doi $$4 = $$1.c_($$2);
      if ($$4 instanceof dop) {
         ((dop)$$4).l();
      }
   }
}
