import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djh extends dix {
   public static final MapCodec<djh> a = b(djh::new);
   public static final dxt<jn> b = dnj.aF;
   public static final dxt<dxk> c = dxm.Y;
   public static final dxn d = dxm.B;
   private static final fbt f = djl.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fbt g = djl.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fbt h = djl.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fbt i = djl.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fbt j = fbq.a(i, h);
   private static final fbt k = fbq.a(j, djl.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fbt l = fbq.a(j, djl.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fbt m = fbq.a(j, djl.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fbt n = fbq.a(j, djl.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fbt o = fbq.a(j, djl.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fbt G = fbq.a(j, djl.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fbt H = fbq.a(j, djl.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, dxk.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
      buk $$4 = $$3.p();
      cow $$5 = $$4 instanceof cow ? (cow)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      return (bsj)(this.a($$1, $$0, $$4, $$3, true) ? bsj.a : bsj.e);
   }

   public boolean a(dgh $$0, dww $$1, fav $$2, @Nullable cow $$3, boolean $$4) {
      jn $$5 = $$2.c();
      ji $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awk.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dww $$0, jn $$1, double $$2) {
      if ($$1.o() != jn.a.b && !($$2 > 0.8124F)) {
         jn $$3 = $$0.c(b);
         dxk $$4 = $$0.c(c);
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

   public boolean a(dgh $$0, ji $$1, @Nullable jn $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable buk $$0, dgh $$1, ji $$2, @Nullable jn $$3) {
      dty $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dtw) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dtw)$$4).a($$3);
         $$1.a(null, $$2, awa.bZ, awb.e, 2.0F, 1.0F);
         $$1.a($$0, ebs.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fbt o(dww $$0) {
      jn $$1 = $$0.c(b);
      dxk $$2 = $$0.c(c);
      if ($$2 == dxk.a) {
         return $$1 != jn.c && $$1 != jn.d ? g : f;
      } else if ($$2 == dxk.b) {
         return H;
      } else if ($$2 == dxk.d) {
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
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.o($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      dgh $$3 = $$0.q();
      jn.a $$4 = $$1.o();
      if ($$4 == jn.a.b) {
         dww $$5 = this.m().b(c, $$1 == jn.a ? dxk.b : dxk.a).b(b, $$0.g());
         if ($$5.a((dgk)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jn.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jn.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jn.e)
            || $$4 == jn.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jn.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jn.c);
         dww $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dxk.d : dxk.c);
         if ($$7.a((dgk)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jn.b);
         $$7 = $$7.b(c, $$8 ? dxk.a : dxk.b);
         if ($$7.a((dgk)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, dfz $$3, BiConsumer<cwo, ji> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      dxk $$8 = $$0.c(c);
      jn $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dxk.d) {
         return djn.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dxk.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dxk.c).b(b, $$4.g());
            }

            if ($$8 == dxk.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dxk.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      jn $$3 = q($$0).g();
      return $$3 == jn.b ? djl.a($$1, $$2.d(), jn.a) : dmg.b($$1, $$2, $$3);
   }

   private static jn q(dww $$0) {
      switch ((dxk)$$0.c(c)) {
         case a:
            return jn.b;
         case b:
            return jn.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dtw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.F, $$0.C ? dtw::a : dtw::b);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   public dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
