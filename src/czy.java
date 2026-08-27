import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class czy extends czo {
   public static final MapCodec<czy> a = b(czy::new);
   public static final dnv b = ddx.aE;
   public static final dnz<dnp> c = dnr.V;
   public static final dns d = dnr.w;
   private static final eqm f = dac.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eqm g = dac.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eqm h = dac.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eqm i = dac.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eqm j = eqj.a(i, h);
   private static final eqm k = eqj.a(j, dac.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eqm l = eqj.a(j, dac.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eqm m = eqj.a(j, dac.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eqm n = eqj.a(j, dac.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eqm o = eqj.a(j, dac.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eqm F = eqj.a(j, dac.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eqm G = eqj.a(j, dac.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<czy> a() {
      return a;
   }

   public czy(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, dnp.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      box $$4 = $$3.af_();
      ciu $$5 = $$4 instanceof ciu ? (ciu)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bnd.a($$1.B) : bnd.d;
   }

   public boolean a(cxb $$0, dnb $$1, epp $$2, @Nullable ciu $$3, boolean $$4) {
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

   private boolean a(dnb $$0, ih $$1, double $$2) {
      if ($$1.o() != ih.a.b && !($$2 > 0.8124F)) {
         ih $$3 = $$0.c(b);
         dnp $$4 = $$0.c(c);
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

   public boolean a(cxb $$0, ib $$1, @Nullable ih $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable box $$0, cxb $$1, ib $$2, @Nullable ih $$3) {
      dki $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dkg) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dkg)$$4).a($$3);
         $$1.a(null, $$2, aty.bZ, atz.e, 2.0F, 1.0F);
         $$1.a($$0, drp.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eqm m(dnb $$0) {
      ih $$1 = $$0.c(b);
      dnp $$2 = $$0.c(c);
      if ($$2 == dnp.a) {
         return $$1 != ih.c && $$1 != ih.d ? g : f;
      } else if ($$2 == dnp.b) {
         return G;
      } else if ($$2 == dnp.d) {
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
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.m($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.m($$0);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      ih $$1 = $$0.k();
      ib $$2 = $$0.a();
      cxb $$3 = $$0.q();
      ih.a $$4 = $$1.o();
      if ($$4 == ih.a.b) {
         dnb $$5 = this.o().a(c, $$1 == ih.a ? dnp.b : dnp.a).a(b, $$0.g());
         if ($$5.a((cxe)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ih.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ih.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ih.e)
            || $$4 == ih.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ih.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ih.c);
         dnb $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dnp.d : dnp.c);
         if ($$7.a((cxe)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ih.b);
         $$7 = $$7.a(c, $$8 ? dnp.a : dnp.b);
         if ($$7.a((cxe)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, cwt $$3, BiConsumer<cqm, ib> $$4) {
      if ($$3.j() == cwt.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      dnp $$6 = $$0.c(c);
      ih $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dnp.d) {
         return dae.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dnp.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dnp.c).a(b, $$1.g());
            }

            if ($$6 == dnp.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dnp.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ih $$3 = n($$0).g();
      return $$3 == ih.b ? dac.a($$1, $$2.c(), ih.a) : dcw.b($$1, $$2, $$3);
   }

   private static ih n(dnb $$0) {
      switch ((dnp)$$0.c(c)) {
         case a:
            return ih.b;
         case b:
            return ih.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.E, $$0.B ? dkg::a : dkg::b);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   public dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
