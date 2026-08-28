import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class die extends dgf {
   public static final MapCodec<die> a = b(die::new);
   public static final dty<dtw> b = dtq.ae;

   @Override
   public MapCodec<? extends die> a() {
      return a;
   }

   public die(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtw.b));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      dtw $$6 = $$0.c(b);
      if ($$1.o() != ji.a.b || $$6 == dtw.b != ($$1 == ji.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dtw.b && $$1 == ji.a && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfy.a.o();
      }
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      jd $$1 = $$0.a();
      dcu $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, btl $$3, cuo $$4) {
      jd $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dtw.a)), 3);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      if ($$0.c(b) != dtw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dta $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dtw.b;
      }
   }

   public static void a(dcv $$0, dta $$1, jd $$2, int $$3) {
      jd $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dtw.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dtw.a)), $$3);
   }

   public static dta c(dcx $$0, jd $$1, dta $$2) {
      return $$2.b(dtq.C) ? $$2.a(dtq.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eU());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcu $$0, cmv $$1, jd $$2, dta $$3, @Nullable dqf $$4, cuo $$5) {
      super.a($$0, $$1, $$2, dfy.a.o(), $$4, $$5);
   }

   protected static void b(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      dtw $$4 = $$2.c(b);
      if ($$4 == dtw.a) {
         jd $$5 = $$1.d();
         dta $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dtw.b) {
            dta $$7 = $$6.u().b(eoz.c) ? dfy.G.o() : dfy.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dfw.i($$6));
         }
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dta $$0, jd $$1) {
      return ayn.b($$1.u(), $$1.c($$0.c(b) == dtw.b ? 0 : 1).v(), $$1.w());
   }
}
