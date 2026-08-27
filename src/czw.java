import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class czw extends czm {
   public static final MapCodec<czw> a = b(czw::new);
   public static final dnt b = ddv.aE;
   public static final dnx<dnn> c = dnp.V;
   public static final dnq d = dnp.w;
   private static final eqk f = daa.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eqk g = daa.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eqk h = daa.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eqk i = daa.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eqk j = eqh.a(i, h);
   private static final eqk k = eqh.a(j, daa.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eqk l = eqh.a(j, daa.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eqk m = eqh.a(j, daa.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eqk n = eqh.a(j, daa.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eqk o = eqh.a(j, daa.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eqk F = eqh.a(j, daa.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eqk G = eqh.a(j, daa.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   public czw(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, dnn.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
      bow $$4 = $$3.af_();
      cis $$5 = $$4 instanceof cis ? (cis)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bnc.a($$1.B) : bnc.d;
   }

   public boolean a(cwz $$0, dmz $$1, epn $$2, @Nullable cis $$3, boolean $$4) {
      ih $$5 = $$2.b();
      ib $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(aui.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dmz $$0, ih $$1, double $$2) {
      if ($$1.o() != ih.a.b && !($$2 > 0.8124F)) {
         ih $$3 = $$0.c(b);
         dnn $$4 = $$0.c(c);
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

   public boolean a(cwz $$0, ib $$1, @Nullable ih $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bow $$0, cwz $$1, ib $$2, @Nullable ih $$3) {
      dkg $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dke) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dke)$$4).a($$3);
         $$1.a(null, $$2, aty.bZ, atz.e, 2.0F, 1.0F);
         $$1.a($$0, drn.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eqk m(dmz $$0) {
      ih $$1 = $$0.c(b);
      dnn $$2 = $$0.c(c);
      if ($$2 == dnn.a) {
         return $$1 != ih.c && $$1 != ih.d ? g : f;
      } else if ($$2 == dnn.b) {
         return G;
      } else if ($$2 == dnn.d) {
         return $$1 != ih.c && $$1 != ih.d ? l : k;
      } else if ($$1 == ih.c) {
         return o;
      } else if ($$1 == ih.d) {
         return F;
      } else {
         return $$1 == ih.f ? n : m;
      }
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.m($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.m($$0);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ih $$1 = $$0.k();
      ib $$2 = $$0.a();
      cwz $$3 = $$0.q();
      ih.a $$4 = $$1.o();
      if ($$4 == ih.a.b) {
         dmz $$5 = this.o().a(c, $$1 == ih.a ? dnn.b : dnn.a).a(b, $$0.g());
         if ($$5.a((cxc)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ih.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ih.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ih.e)
            || $$4 == ih.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ih.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ih.c);
         dmz $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dnn.d : dnn.c);
         if ($$7.a((cxc)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ih.b);
         $$7 = $$7.a(c, $$8 ? dnn.a : dnn.b);
         if ($$7.a((cxc)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cwr $$3, BiConsumer<cqk, ib> $$4) {
      if ($$3.j() == cwr.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      dnn $$6 = $$0.c(c);
      ih $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dnn.d) {
         return dac.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dnn.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dnn.c).a(b, $$1.g());
            }

            if ($$6 == dnn.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dnn.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ih $$3 = n($$0).g();
      return $$3 == ih.b ? daa.a($$1, $$2.c(), ih.a) : dcu.b($$1, $$2, $$3);
   }

   private static ih n(dmz $$0) {
      switch ((dnn)$$0.c(c)) {
         case a:
            return ih.b;
         case b:
            return ih.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dke($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.E, $$0.B ? dke::a : dke::b);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   public dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
