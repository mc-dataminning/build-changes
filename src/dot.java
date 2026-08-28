import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dot extends djq {
   public static final MapCodec<dot> a = b(dot::new);
   public static final dyo<jn> b = dod.e;
   public static final dyh c = dyg.A;
   public static final dyh d = dyg.r;
   private static final fcr e = fco.a(dke.b(16.0, 0.0, 2.0), dke.b(8.0, 2.0, 14.0));
   private static final Map<jn, fcr> f = fco.c(
      fco.a(dke.a(16.0, 10.0, 14.0, 1.0, 5.333333), dke.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dke.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   protected dot(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fcr d_(dxq $$0) {
      return e;
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   public dxq a(dax $$0) {
      dgz $$1 = $$0.q();
      cxh $$2 = $$0.n();
      cpr $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gI()) {
         czo $$5 = $$2.a(kv.aa, czo.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvx($$0, $$1);
   }

   public static boolean a(@Nullable bvy $$0, dgz $$1, ji $$2, dxq $$3, cxh $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bvy $$0, dgz $$1, ji $$2, dxq $$3, cxh $$4) {
      if ($$1.c_($$2) instanceof dvx $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awa.cz, awb.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bva $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      dxq $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ecp.c, $$2, ecp.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dgz $$0, ji $$1, dxq $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dgz $$0, ji $$1, dxq $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dgz $$0, ji $$1, dxq $$2) {
      eve $$3 = eva.a($$0, $$2.c(b).g(), jn.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$3 == jn.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      if ($$0.c(d)) {
         dus $$3 = $$1.c_($$2);
         if ($$3 instanceof dvx) {
            return ((dvx)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$1.c(d)) {
         return bsy.f;
      } else if ($$0.a(awy.aY)) {
         return (bsy)(a($$4, $$2, $$3, $$1, $$0) ? bsy.a : bsy.e);
      } else {
         return (bsy)($$0.f() && $$5 == bsx.a ? bsy.e : bsy.f);
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bsy.a;
      } else {
         return bsy.c;
      }
   }

   @Nullable
   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dgz $$0, ji $$1, cpr $$2) {
      dus $$3 = $$0.c_($$1);
      if ($$3 instanceof dvx) {
         $$2.a((dvx)$$3);
         $$2.a(awk.au);
      }
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
