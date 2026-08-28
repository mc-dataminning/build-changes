import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dsf extends dna {
   public static final MapCodec<dsf> a = b(dsf::new);
   public static final eco<jc> b = drp.e;
   public static final ech c = ecg.A;
   public static final ech d = ecg.r;
   private static final fgw e = fgt.a(dno.b(16.0, 0.0, 2.0), dno.b(8.0, 2.0, 14.0));
   private static final Map<jc, fgw> f = fgt.c(
      fgt.a(dno.a(16.0, 10.0, 14.0, 1.0, 5.333333), dno.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dno.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   protected dsf(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgw d_(ebq $$0) {
      return e;
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   public ebq a(ded $$0) {
      dkj $$1 = $$0.q();
      dak $$2 = $$0.n();
      csi $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gH()) {
         dcs $$5 = $$2.a(kl.aa, dcs.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzu($$0, $$1);
   }

   public static boolean a(@Nullable byf $$0, dkj $$1, iw $$2, ebq $$3, dak $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable byf $$0, dkj $$1, iw $$2, ebq $$3, dak $$4) {
      if ($$1.c_($$2) instanceof dzu $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awy.cz, awz.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bxe $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      ebq $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(egq.c, $$2, egq.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dkj $$0, iw $$1, ebq $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dkj $$0, iw $$1, ebq $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dkj $$0, iw $$1, ebq $$2) {
      ezi $$3 = eze.a($$0, $$2.c(b).g(), jc.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$3 == jc.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      if ($$0.c(d)) {
         dyo $$3 = $$1.c_($$2);
         if ($$3 instanceof dzu) {
            return ((dzu)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$1.c(d)) {
         return bvc.f;
      } else if ($$0.a(axv.ba)) {
         return (bvc)(a($$4, $$2, $$3, $$1, $$0) ? bvc.a : bvc.e);
      } else {
         return (bvc)($$0.f() && $$5 == bvb.a ? bvc.e : bvc.f);
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bvc.a;
      } else {
         return bvc.c;
      }
   }

   @Nullable
   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dkj $$0, iw $$1, csi $$2) {
      dyo $$3 = $$0.c_($$1);
      if ($$3 instanceof dzu) {
         $$2.a((dzu)$$3);
         $$2.a(axi.au);
      }
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
