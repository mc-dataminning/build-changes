import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cwu extends cwk {
   public static final MapCodec<cwu> a = b(cwu::new);
   public static final dkj b = dat.aE;
   public static final dkn<dkd> c = dkf.V;
   public static final dkg d = dkf.w;
   private static final emv f = cwy.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final emv g = cwy.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final emv h = cwy.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final emv i = cwy.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final emv j = ems.a(i, h);
   private static final emv k = ems.a(j, cwy.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final emv l = ems.a(j, cwy.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final emv m = ems.a(j, cwy.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final emv n = ems.a(j, cwy.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final emv o = ems.a(j, cwy.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final emv F = ems.a(j, cwy.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final emv G = ems.a(j, cwy.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<cwu> a() {
      return a;
   }

   public cwu(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, dkd.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      blw $$4 = $$3.w();
      cfq $$5 = $$4 instanceof cfq ? (cfq)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bkc.a($$1.B) : bkc.d;
   }

   public boolean a(ctx $$0, djp $$1, ely $$2, @Nullable cfq $$3, boolean $$4) {
      ic $$5 = $$2.b();
      hx $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(asd.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(djp $$0, ic $$1, double $$2) {
      if ($$1.o() != ic.a.b && !($$2 > 0.8124F)) {
         ic $$3 = $$0.c(b);
         dkd $$4 = $$0.c(c);
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

   public boolean a(ctx $$0, hx $$1, @Nullable ic $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable blw $$0, ctx $$1, hx $$2, @Nullable ic $$3) {
      dhd $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dhb) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dhb)$$4).a($$3);
         $$1.a(null, $$2, art.bW, aru.e, 2.0F, 1.0F);
         $$1.a($$0, dnz.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private emv h(djp $$0) {
      ic $$1 = $$0.c(b);
      dkd $$2 = $$0.c(c);
      if ($$2 == dkd.a) {
         return $$1 != ic.c && $$1 != ic.d ? g : f;
      } else if ($$2 == dkd.b) {
         return G;
      } else if ($$2 == dkd.d) {
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
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.h($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.h($$0);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      ic $$1 = $$0.k();
      hx $$2 = $$0.a();
      ctx $$3 = $$0.q();
      ic.a $$4 = $$1.o();
      if ($$4 == ic.a.b) {
         djp $$5 = this.o().a(c, $$1 == ic.a ? dkd.b : dkd.a).a(b, $$0.g());
         if ($$5.a((cua)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ic.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ic.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ic.e)
            || $$4 == ic.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ic.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ic.c);
         djp $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dkd.d : dkd.c);
         if ($$7.a((cua)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ic.b);
         $$7 = $$7.a(c, $$8 ? dkd.a : dkd.b);
         if ($$7.a((cua)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, ctp $$3, BiConsumer<cng, hx> $$4) {
      if ($$3.j() == ctp.a.d && !$$1.y_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      dkd $$6 = $$0.c(c);
      ic $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dkd.d) {
         return cxa.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dkd.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dkd.c).a(b, $$1.g());
            }

            if ($$6 == dkd.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dkd.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      ic $$3 = n($$0).g();
      return $$3 == ic.b ? cwy.a($$1, $$2.c(), ic.a) : czs.b($$1, $$2, $$3);
   }

   private static ic n(djp $$0) {
      switch ((dkd)$$0.c(c)) {
         case a:
            return ic.b;
         case b:
            return ic.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.E, $$0.B ? dhb::a : dhb::b);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
