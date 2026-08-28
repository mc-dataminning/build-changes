import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djj extends diz {
   public static final MapCodec<djj> a = b(djj::new);
   public static final dxv<jn> b = dnl.aF;
   public static final dxv<dxm> c = dxo.Y;
   public static final dxp d = dxo.B;
   private static final fbv f = djn.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fbv g = djn.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fbv h = djn.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fbv i = djn.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fbv j = fbs.a(i, h);
   private static final fbv k = fbs.a(j, djn.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fbv l = fbs.a(j, djn.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fbv m = fbs.a(j, djn.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fbv n = fbs.a(j, djn.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fbv o = fbs.a(j, djn.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fbv G = fbs.a(j, djn.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fbv H = fbs.a(j, djn.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, dxm.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      bum $$4 = $$3.p();
      coy $$5 = $$4 instanceof coy ? (coy)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      return (bsl)(this.a($$1, $$0, $$4, $$3, true) ? bsl.a : bsl.e);
   }

   public boolean a(dgj $$0, dwy $$1, fax $$2, @Nullable coy $$3, boolean $$4) {
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

   private boolean a(dwy $$0, jn $$1, double $$2) {
      if ($$1.o() != jn.a.b && !($$2 > 0.8124F)) {
         jn $$3 = $$0.c(b);
         dxm $$4 = $$0.c(c);
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

   public boolean a(dgj $$0, ji $$1, @Nullable jn $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bum $$0, dgj $$1, ji $$2, @Nullable jn $$3) {
      dua $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dty) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dty)$$4).a($$3);
         $$1.a(null, $$2, awa.bZ, awb.e, 2.0F, 1.0F);
         $$1.a($$0, ebu.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fbv o(dwy $$0) {
      jn $$1 = $$0.c(b);
      dxm $$2 = $$0.c(c);
      if ($$2 == dxm.a) {
         return $$1 != jn.c && $$1 != jn.d ? g : f;
      } else if ($$2 == dxm.b) {
         return H;
      } else if ($$2 == dxm.d) {
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
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.o($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      dgj $$3 = $$0.q();
      jn.a $$4 = $$1.o();
      if ($$4 == jn.a.b) {
         dwy $$5 = this.m().b(c, $$1 == jn.a ? dxm.b : dxm.a).b(b, $$0.g());
         if ($$5.a((dgm)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jn.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jn.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jn.e)
            || $$4 == jn.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jn.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jn.c);
         dwy $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dxm.d : dxm.c);
         if ($$7.a((dgm)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jn.b);
         $$7 = $$7.b(c, $$8 ? dxm.a : dxm.b);
         if ($$7.a((dgm)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, dgb $$3, BiConsumer<cwq, ji> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      dxm $$8 = $$0.c(c);
      jn $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dxm.d) {
         return djp.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dxm.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dxm.c).b(b, $$4.g());
            }

            if ($$8 == dxm.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dxm.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      jn $$3 = q($$0).g();
      return $$3 == jn.b ? djn.a($$1, $$2.d(), jn.a) : dmi.b($$1, $$2, $$3);
   }

   private static jn q(dwy $$0) {
      switch ((dxm)$$0.c(c)) {
         case a:
            return jn.b;
         case b:
            return jn.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dty($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.F, $$0.C ? dty::a : dty::b);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   public dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
