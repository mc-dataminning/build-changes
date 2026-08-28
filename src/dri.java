import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dri extends dmd {
   public static final MapCodec<dri> a = b(dri::new);
   public static final ebr<jb> b = dqs.e;
   public static final ebk c = ebj.A;
   public static final ebk d = ebj.r;
   private static final ffw e = fft.a(dmr.b(16.0, 0.0, 2.0), dmr.b(8.0, 2.0, 14.0));
   private static final Map<jb, ffw> f = fft.c(
      fft.a(dmr.a(16.0, 10.0, 14.0, 1.0, 5.333333), dmr.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dmr.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<dri> a() {
      return a;
   }

   protected dri(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffw d_(eat $$0) {
      return e;
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   public eat a(ddg $$0) {
      djm $$1 = $$0.q();
      czn $$2 = $$0.n();
      crm $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gF()) {
         dbv $$5 = $$2.a(kk.aa, dbv.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyx($$0, $$1);
   }

   public static boolean a(@Nullable bxj $$0, djm $$1, iv $$2, eat $$3, czn $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bxj $$0, djm $$1, iv $$2, eat $$3, czn $$4) {
      if ($$1.c_($$2) instanceof dyx $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awn.cz, awo.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bwi $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      eat $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(eft.c, $$2, eft.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(djm $$0, iv $$1, eat $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(djm $$0, iv $$1, eat $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(djm $$0, iv $$1, eat $$2) {
      eyi $$3 = eye.a($$0, $$2.c(b).g(), jb.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$3 == jb.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      if ($$0.c(d)) {
         dxr $$3 = $$1.c_($$2);
         if ($$3 instanceof dyx) {
            return ((dyx)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$1.c(d)) {
         return bug.f;
      } else if ($$0.a(axk.aZ)) {
         return (bug)(a($$4, $$2, $$3, $$1, $$0) ? bug.a : bug.e);
      } else {
         return (bug)($$0.f() && $$5 == buf.a ? bug.e : bug.f);
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bug.a;
      } else {
         return bug.c;
      }
   }

   @Nullable
   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(djm $$0, iv $$1, crm $$2) {
      dxr $$3 = $$0.c_($$1);
      if ($$3 instanceof dyx) {
         $$2.a((dyx)$$3);
         $$2.a(awx.au);
      }
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
