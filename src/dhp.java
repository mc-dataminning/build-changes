import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhp extends dfq {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final dti<dtg> b = dta.ae;

   @Override
   public MapCodec<? extends dhp> a() {
      return a;
   }

   public dhp(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtg.b));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      dtg $$6 = $$0.c(b);
      if ($$1.o() != jf.a.b || $$6 == dtg.b != ($$1 == jf.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dtg.b && $$1 == jf.a && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfj.a.o();
      }
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      ja $$1 = $$0.a();
      dcf $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, btb $$3, cuc $$4) {
      ja $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dtg.a)), 3);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      if ($$0.c(b) != dtg.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dsk $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dtg.b;
      }
   }

   public static void a(dcg $$0, dsk $$1, ja $$2, int $$3) {
      ja $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dtg.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dtg.a)), $$3);
   }

   public static dsk c(dci $$0, ja $$1, dsk $$2) {
      return $$2.b(dta.C) ? $$2.a(dta.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
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
   public void a(dcf $$0, cmk $$1, ja $$2, dsk $$3, @Nullable dpp $$4, cuc $$5) {
      super.a($$0, $$1, $$2, dfj.a.o(), $$4, $$5);
   }

   protected static void b(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      dtg $$4 = $$2.c(b);
      if ($$4 == dtg.a) {
         ja $$5 = $$1.d();
         dsk $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dtg.b) {
            dsk $$7 = $$6.u().b(eoi.c) ? dfj.G.o() : dfj.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dfh.i($$6));
         }
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dsk $$0, ja $$1) {
      return ayg.b($$1.u(), $$1.c($$0.c(b) == dtg.b ? 0 : 1).v(), $$1.w());
   }
}
