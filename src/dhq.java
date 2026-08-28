import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhq extends dfr {
   public static final MapCodec<dhq> a = b(dhq::new);
   public static final dtj<dth> b = dtb.ae;

   @Override
   public MapCodec<? extends dhq> a() {
      return a;
   }

   public dhq(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dth.b));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      dth $$6 = $$0.c(b);
      if ($$1.o() != jf.a.b || $$6 == dth.b != ($$1 == jf.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dth.b && $$1 == jf.a && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfk.a.o();
      }
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      ja $$1 = $$0.a();
      dcg $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, btc $$3, cud $$4) {
      ja $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dth.a)), 3);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      if ($$0.c(b) != dth.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dsl $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dth.b;
      }
   }

   public static void a(dch $$0, dsl $$1, ja $$2, int $$3) {
      ja $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dth.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dth.a)), $$3);
   }

   public static dsl c(dcj $$0, ja $$1, dsl $$2) {
      return $$2.b(dtb.C) ? $$2.a(dtb.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eV());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcg $$0, cml $$1, ja $$2, dsl $$3, @Nullable dpq $$4, cud $$5) {
      super.a($$0, $$1, $$2, dfk.a.o(), $$4, $$5);
   }

   protected static void b(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      dth $$4 = $$2.c(b);
      if ($$4 == dth.a) {
         ja $$5 = $$1.d();
         dsl $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dth.b) {
            dsl $$7 = $$6.u().b(eok.c) ? dfk.G.o() : dfk.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dfi.i($$6));
         }
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dsl $$0, ja $$1) {
      return ayg.b($$1.u(), $$1.c($$0.c(b) == dth.b ? 0 : 1).v(), $$1.w());
   }
}
