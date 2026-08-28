import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfe extends deu {
   public static final MapCodec<dfe> a = b(dfe::new);
   public static final dtf b = dje.aE;
   public static final dtj<dsz> c = dtb.V;
   public static final dtc d = dtb.w;
   private static final exa f = dfi.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final exa g = dfi.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final exa h = dfi.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final exa i = dfi.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final exa j = ewx.a(i, h);
   private static final exa k = ewx.a(j, dfi.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final exa l = ewx.a(j, dfi.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final exa m = ewx.a(j, dfi.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final exa n = ewx.a(j, dfi.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final exa o = ewx.a(j, dfi.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final exa F = ewx.a(j, dfi.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final exa G = ewx.a(j, dfi.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, dsz.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
      bsh $$4 = $$3.s();
      cml $$5 = $$4 instanceof cml ? (cml)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bqh.a($$1.B) : bqh.e;
   }

   public boolean a(dcg $$0, dsl $$1, ewd $$2, @Nullable cml $$3, boolean $$4) {
      jf $$5 = $$2.b();
      ja $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avr.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dsl $$0, jf $$1, double $$2) {
      if ($$1.o() != jf.a.b && !($$2 > 0.8124F)) {
         jf $$3 = $$0.c(b);
         dsz $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dcg $$0, ja $$1, @Nullable jf $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bsh $$0, dcg $$1, ja $$2, @Nullable jf $$3) {
      dpq $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dpo) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dpo)$$4).a($$3);
         $$1.a(null, $$2, avh.bZ, avi.e, 2.0F, 1.0F);
         $$1.a($$0, dxh.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private exa m(dsl $$0) {
      jf $$1 = $$0.c(b);
      dsz $$2 = $$0.c(c);
      if ($$2 == dsz.a) {
         return $$1 != jf.c && $$1 != jf.d ? g : f;
      } else if ($$2 == dsz.b) {
         return G;
      } else if ($$2 == dsz.d) {
         return $$1 != jf.c && $$1 != jf.d ? l : k;
      } else if ($$1 == jf.c) {
         return o;
      } else if ($$1 == jf.d) {
         return F;
      } else {
         return $$1 == jf.f ? n : m;
      }
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.m($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.m($$0);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      jf $$1 = $$0.k();
      ja $$2 = $$0.a();
      dcg $$3 = $$0.q();
      jf.a $$4 = $$1.o();
      if ($$4 == jf.a.b) {
         dsl $$5 = this.o().a(c, $$1 == jf.a ? dsz.b : dsz.a).a(b, $$0.g());
         if ($$5.a((dcj)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jf.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), jf.f) && $$3.a_($$2.h()).d($$3, $$2.h(), jf.e)
            || $$4 == jf.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), jf.d) && $$3.a_($$2.f()).d($$3, $$2.f(), jf.c);
         dsl $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dsz.d : dsz.c);
         if ($$7.a((dcj)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), jf.b);
         $$7 = $$7.a(c, $$8 ? dsz.a : dsz.b);
         if ($$7.a((dcj)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dby $$3, BiConsumer<cud, ja> $$4) {
      if ($$3.n()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      dsz $$6 = $$0.c(c);
      jf $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dsz.d) {
         return dfk.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dsz.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dsz.c).a(b, $$1.g());
            }

            if ($$6 == dsz.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dsz.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      jf $$3 = n($$0).g();
      return $$3 == jf.b ? dfi.a($$1, $$2.c(), jf.a) : dic.b($$1, $$2, $$3);
   }

   private static jf n(dsl $$0) {
      switch ((dsz)$$0.c(c)) {
         case a:
            return jf.b;
         case b:
            return jf.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.E, $$0.B ? dpo::a : dpo::b);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   public dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
