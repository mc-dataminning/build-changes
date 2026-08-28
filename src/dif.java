import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dif extends dhv {
   public static final MapCodec<dif> a = b(dif::new);
   public static final dwl<jm> b = dme.aF;
   public static final dwl<dwc> c = dwe.V;
   public static final dwf d = dwe.w;
   private static final fal f = dij.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fal g = dij.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fal h = dij.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fal i = dij.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fal j = fai.a(i, h);
   private static final fal k = fai.a(j, dij.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fal l = fai.a(j, dij.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fal m = fai.a(j, dij.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fal n = fai.a(j, dij.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fal o = fai.a(j, dij.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fal G = fai.a(j, dij.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fal H = fai.a(j, dij.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   public dif(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dwc.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
      bui $$4 = $$3.s();
      cor $$5 = $$4 instanceof cor ? (cor)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      return (bsh)(this.a($$1, $$0, $$4, $$3, true) ? bsh.a : bsh.e);
   }

   public boolean a(dff $$0, dvo $$1, ezn $$2, @Nullable cor $$3, boolean $$4) {
      jm $$5 = $$2.c();
      jh $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awy.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dvo $$0, jm $$1, double $$2) {
      if ($$1.o() != jm.a.b && !($$2 > 0.8124F)) {
         jm $$3 = $$0.c(b);
         dwc $$4 = $$0.c(c);
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

   public boolean a(dff $$0, jh $$1, @Nullable jm $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bui $$0, dff $$1, jh $$2, @Nullable jm $$3) {
      dsr $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dsp) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dsp)$$4).a($$3);
         $$1.a(null, $$2, awo.bZ, awp.e, 2.0F, 1.0F);
         $$1.a($$0, eak.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fal o(dvo $$0) {
      jm $$1 = $$0.c(b);
      dwc $$2 = $$0.c(c);
      if ($$2 == dwc.a) {
         return $$1 != jm.c && $$1 != jm.d ? g : f;
      } else if ($$2 == dwc.b) {
         return H;
      } else if ($$2 == dwc.d) {
         return $$1 != jm.c && $$1 != jm.d ? l : k;
      } else if ($$1 == jm.c) {
         return o;
      } else if ($$1 == jm.d) {
         return G;
      } else {
         return $$1 == jm.f ? n : m;
      }
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.o($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.o($$0);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      dff $$3 = $$0.q();
      jm.a $$4 = $$1.o();
      if ($$4 == jm.a.b) {
         dvo $$5 = this.m().b(c, $$1 == jm.a ? dwc.b : dwc.a).b(b, $$0.g());
         if ($$5.a((dfi)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jm.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jm.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jm.e)
            || $$4 == jm.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jm.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jm.c);
         dvo $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dwc.d : dwc.c);
         if ($$7.a((dfi)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jm.b);
         $$7 = $$7.b(c, $$8 ? dwc.a : dwc.b);
         if ($$7.a((dfi)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, dex $$3, BiConsumer<cwf, jh> $$4) {
      if ($$3.f()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      dwc $$8 = $$0.c(c);
      jm $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dwc.d) {
         return dil.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dwc.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dwc.c).b(b, $$4.g());
            }

            if ($$8 == dwc.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dwc.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jm $$3 = q($$0).g();
      return $$3 == jm.b ? dij.a($$1, $$2.d(), jm.a) : dlc.b($$1, $$2, $$3);
   }

   private static jm q(dvo $$0) {
      switch ((dwc)$$0.c(c)) {
         case a:
            return jm.b;
         case b:
            return jm.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.E, $$0.C ? dsp::a : dsp::b);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   public dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
