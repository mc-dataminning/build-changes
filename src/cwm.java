import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cwm extends cwc {
   public static final MapCodec<cwm> a = b(cwm::new);
   public static final dkb b = dal.aE;
   public static final dkf<djv> c = djx.V;
   public static final djy d = djx.w;
   private static final emm f = cwq.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final emm g = cwq.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final emm h = cwq.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final emm i = cwq.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final emm j = emj.a(i, h);
   private static final emm k = emj.a(j, cwq.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final emm l = emj.a(j, cwq.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final emm m = emj.a(j, cwq.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final emm n = emj.a(j, cwq.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final emm o = emj.a(j, cwq.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final emm F = emj.a(j, cwq.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final emm G = emj.a(j, cwq.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<cwm> a() {
      return a;
   }

   public cwm(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, djv.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
      blv $$4 = $$3.w();
      cfi $$5 = $$4 instanceof cfi ? (cfi)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bkb.a($$1.B) : bkb.d;
   }

   public boolean a(ctp $$0, djh $$1, elp $$2, @Nullable cfi $$3, boolean $$4) {
      ic $$5 = $$2.b();
      hx $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(asc.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(djh $$0, ic $$1, double $$2) {
      if ($$1.o() != ic.a.b && !($$2 > 0.8124F)) {
         ic $$3 = $$0.c(b);
         djv $$4 = $$0.c(c);
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

   public boolean a(ctp $$0, hx $$1, @Nullable ic $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable blv $$0, ctp $$1, hx $$2, @Nullable ic $$3) {
      dgv $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dgt) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dgt)$$4).a($$3);
         $$1.a(null, $$2, ars.bK, art.e, 2.0F, 1.0F);
         $$1.a($$0, dnr.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private emm h(djh $$0) {
      ic $$1 = $$0.c(b);
      djv $$2 = $$0.c(c);
      if ($$2 == djv.a) {
         return $$1 != ic.c && $$1 != ic.d ? g : f;
      } else if ($$2 == djv.b) {
         return G;
      } else if ($$2 == djv.d) {
         return $$1 != ic.c && $$1 != ic.d ? l : k;
      } else if ($$1 == ic.c) {
         return o;
      } else if ($$1 == ic.d) {
         return F;
      } else {
         return $$1 == ic.f ? n : m;
      }
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.h($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.h($$0);
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      ic $$1 = $$0.k();
      hx $$2 = $$0.a();
      ctp $$3 = $$0.q();
      ic.a $$4 = $$1.o();
      if ($$4 == ic.a.b) {
         djh $$5 = this.o().a(c, $$1 == ic.a ? djv.b : djv.a).a(b, $$0.g());
         if ($$5.a((cts)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ic.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ic.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ic.e)
            || $$4 == ic.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ic.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ic.c);
         djh $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? djv.d : djv.c);
         if ($$7.a((cts)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ic.b);
         $$7 = $$7.a(c, $$8 ? djv.a : djv.b);
         if ($$7.a((cts)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cth $$3, BiConsumer<cmy, hx> $$4) {
      if ($$3.j() == cth.a.d && !$$1.y_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      djv $$6 = $$0.c(c);
      ic $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != djv.d) {
         return cws.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == djv.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, djv.c).a(b, $$1.g());
            }

            if ($$6 == djv.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, djv.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      ic $$3 = n($$0).g();
      return $$3 == ic.b ? cwq.a($$1, $$2.c(), ic.a) : czk.b($$1, $$2, $$3);
   }

   private static ic n(djh $$0) {
      switch ((djv)$$0.c(c)) {
         case a:
            return ic.b;
         case b:
            return ic.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dgt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.E, $$0.B ? dgt::a : dgt::b);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
