import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dbd extends cyu<dkn> implements dha {
   public static final MapCodec<dbd> b = b($$0 -> new dbd($$0, () -> dki.b));
   public static final dnt c = ddv.aE;
   public static final dnx<dnr> d = dnp.bc;
   public static final dnq e = dnp.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eqk i = daa.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eqk j = daa.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eqk k = daa.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eqk l = daa.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eqk m = daa.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dch.b<dkn, Optional<bmv>> n = new dch.b<dkn, Optional<bmv>>() {
      public Optional<bmv> a(dkn $$0, dkn $$1) {
         return Optional.of(new bmu($$0, $$1));
      }

      public Optional<bmv> a(dkn $$0) {
         return Optional.of($$0);
      }

      public Optional<bmv> a() {
         return Optional.empty();
      }
   };
   private static final dch.b<dkn, Optional<bng>> o = new dch.b<dkn, Optional<bng>>() {
      public Optional<bng> a(final dkn $$0, final dkn $$1) {
         final bmv $$2 = new bmu($$0, $$1);
         return Optional.of(new bng() {
            @Nullable
            @Override
            public clo createMenu(int $$0x, cir $$1x, cis $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return clv.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public vu O_() {
               if ($$0.ae()) {
                  return $$0.O_();
               } else {
                  return (vu)($$1.ae() ? $$1.O_() : vu.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bng> a(dkn $$0) {
         return Optional.of($$0);
      }

      public Optional<bng> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dbd> a() {
      return b;
   }

   protected dbd(dmy.d $$0, Supplier<dki<? extends dkn>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ih.c).a(d, dnr.a).a(e, Boolean.valueOf(false)));
   }

   public static dch.a g(dmz $$0) {
      dnr $$1 = $$0.c(d);
      if ($$1 == dnr.a) {
         return dch.a.a;
      } else {
         return $$1 == dnr.c ? dch.a.b : dch.a.c;
      }
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.b;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dnr $$6 = $$2.c(d);
         if ($$0.c(d) == dnr.a && $$6 != dnr.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dnr.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if ($$0.c(d) == dnr.a) {
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

   public static ih h(dmz $$0) {
      ih $$1 = $$0.c(c);
      return $$0.c(d) == dnr.b ? $$1.h() : $$1.i();
   }

   @Override
   public dmz a(css $$0) {
      dnr $$1 = dnr.a;
      ih $$2 = $$0.g().g();
      ein $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ih $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ih $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dnr.c : dnr.b;
         }
      }

      if ($$1 == dnr.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dnr.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dnr.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eio.c));
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(e) ? eio.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ih a(css $$0, ih $$1) {
      dmz $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dnr.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$4.B()) {
         dkg $$5 = $$0.c_($$1);
         if ($$5 instanceof dkn) {
            ((dkn)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      bmy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         bng $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            chj.a($$3, true);
         }

         return bnc.b;
      }
   }

   protected auf<ajh> c() {
      return aui.i.b(aui.ao);
   }

   public dki<? extends dkn> d() {
      return this.a.get();
   }

   @Nullable
   public static bmv a(dbd $$0, dmz $$1, cwz $$2, ib $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dch.c<? extends dkn> a(dmz $$0, cwz $$1, ib $$2, boolean $$3) {
      BiPredicate<cxa, ib> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dbd::a;
      }

      return dch.a(this.a.get(), dbd::g, dbd::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dch.b<dkn, Float2FloatFunction> a(final dlj $$0) {
      return new dch.b<dkn, Float2FloatFunction>() {
         public Float2FloatFunction a(dkn $$0x, dkn $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dkn $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0.B ? a($$2, this.d(), dkn::a) : null;
   }

   public static boolean a(cxa $$0, ib $$1) {
      return a((cwf)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cwf $$0, ib $$1) {
      ib $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cxa $$0, ib $$1) {
      List<cbg> $$2 = $$0.a(
         cbg.class, new epm((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cbg $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return clo.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      dkg $$4 = $$1.c_($$2);
      if ($$4 instanceof dkn) {
         ((dkn)$$4).l();
      }
   }
}
