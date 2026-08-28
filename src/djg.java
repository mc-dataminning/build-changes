import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djg extends diw {
   public static final MapCodec<djg> a = b(djg::new);
   public static final dxs<jn> b = dni.aF;
   public static final dxs<dxj> c = dxl.Y;
   public static final dxm d = dxl.B;
   private static final fbs f = djk.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fbs g = djk.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fbs h = djk.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fbs i = djk.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fbs j = fbp.a(i, h);
   private static final fbs k = fbp.a(j, djk.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fbs l = fbp.a(j, djk.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fbs m = fbp.a(j, djk.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fbs n = fbp.a(j, djk.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fbs o = fbp.a(j, djk.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fbs G = fbp.a(j, djk.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fbs H = fbp.a(j, djk.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, dxj.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
      buj $$4 = $$3.p();
      cov $$5 = $$4 instanceof cov ? (cov)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      return (bsi)(this.a($$1, $$0, $$4, $$3, true) ? bsi.a : bsi.e);
   }

   public boolean a(dgg $$0, dwv $$1, fau $$2, @Nullable cov $$3, boolean $$4) {
      jn $$5 = $$2.c();
      ji $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awj.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dwv $$0, jn $$1, double $$2) {
      if ($$1.o() != jn.a.b && !($$2 > 0.8124F)) {
         jn $$3 = $$0.c(b);
         dxj $$4 = $$0.c(c);
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

   public boolean a(dgg $$0, ji $$1, @Nullable jn $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable buj $$0, dgg $$1, ji $$2, @Nullable jn $$3) {
      dtx $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dtv) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dtv)$$4).a($$3);
         $$1.a(null, $$2, avz.bZ, awa.e, 2.0F, 1.0F);
         $$1.a($$0, ebr.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fbs o(dwv $$0) {
      jn $$1 = $$0.c(b);
      dxj $$2 = $$0.c(c);
      if ($$2 == dxj.a) {
         return $$1 != jn.c && $$1 != jn.d ? g : f;
      } else if ($$2 == dxj.b) {
         return H;
      } else if ($$2 == dxj.d) {
         return $$1 != jn.c && $$1 != jn.d ? l : k;
      } else if ($$1 == jn.c) {
         return o;
      } else if ($$1 == jn.d) {
         return G;
      } else {
         return $$1 == jn.f ? n : m;
      }
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.o($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      dgg $$3 = $$0.q();
      jn.a $$4 = $$1.o();
      if ($$4 == jn.a.b) {
         dwv $$5 = this.m().b(c, $$1 == jn.a ? dxj.b : dxj.a).b(b, $$0.g());
         if ($$5.a((dgj)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jn.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jn.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jn.e)
            || $$4 == jn.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jn.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jn.c);
         dwv $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dxj.d : dxj.c);
         if ($$7.a((dgj)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jn.b);
         $$7 = $$7.b(c, $$8 ? dxj.a : dxj.b);
         if ($$7.a((dgj)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      dxj $$8 = $$0.c(c);
      jn $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dxj.d) {
         return djm.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dxj.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dxj.c).b(b, $$4.g());
            }

            if ($$8 == dxj.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dxj.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      jn $$3 = q($$0).g();
      return $$3 == jn.b ? djk.a($$1, $$2.d(), jn.a) : dmf.b($$1, $$2, $$3);
   }

   private static jn q(dwv $$0) {
      switch ((dxj)$$0.c(c)) {
         case a:
            return jn.b;
         case b:
            return jn.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dtv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.F, $$0.C ? dtv::a : dtv::b);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   public dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
