import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqj extends dlg {
   public static final MapCodec<dqj> a = b(dqj::new);
   public static final eam<ja> b = dpt.e;
   public static final eaf c = eae.A;
   public static final eaf d = eae.r;
   private static final feq e = fen.a(dlu.b(16.0, 0.0, 2.0), dlu.b(8.0, 2.0, 14.0));
   private static final Map<ja, feq> f = fen.c(
      fen.a(dlu.a(16.0, 10.0, 14.0, 1.0, 5.333333), dlu.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dlu.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   protected dqj(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected feq d_(dzo $$0) {
      return e;
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   public dzo a(dcl $$0) {
      dip $$1 = $$0.q();
      cys $$2 = $$0.n();
      cqs $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gF()) {
         dba $$5 = $$2.a(kj.aa, dba.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxt($$0, $$1);
   }

   public static boolean a(@Nullable bwz $$0, dip $$1, iu $$2, dzo $$3, cys $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bwz $$0, dip $$1, iu $$2, dzo $$3, cys $$4) {
      if ($$1.c_($$2) instanceof dxt $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awl.cz, awm.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bwa $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      dzo $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(eeo.c, $$2, eeo.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dip $$0, iu $$1, dzo $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dip $$0, iu $$1, dzo $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dip $$0, iu $$1, dzo $$2) {
      exd $$3 = ewz.a($$0, $$2.c(b).g(), ja.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$3 == ja.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      if ($$0.c(d)) {
         dwn $$3 = $$1.c_($$2);
         if ($$3 instanceof dxt) {
            return ((dxt)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$1.c(d)) {
         return bty.f;
      } else if ($$0.a(axi.aY)) {
         return (bty)(a($$4, $$2, $$3, $$1, $$0) ? bty.a : bty.e);
      } else {
         return (bty)($$0.f() && $$5 == btx.a ? bty.e : bty.f);
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bty.a;
      } else {
         return bty.c;
      }
   }

   @Nullable
   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dip $$0, iu $$1, cqs $$2) {
      dwn $$3 = $$0.c_($$1);
      if ($$3 instanceof dxt) {
         $$2.a((dxt)$$3);
         $$2.a(awv.au);
      }
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
