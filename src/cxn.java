import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxn extends cvo {
   public static final MapCodec<cxn> a = b(cxn::new);
   public static final dil<dij> b = did.ae;

   @Override
   public MapCodec<? extends cxn> a() {
      return a;
   }

   public cxn(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dij.b));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      dij $$6 = $$0.c(b);
      if ($$1.o() != ib.a.b || $$6 == dij.b != ($$1 == ib.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dij.b && $$1 == ib.a && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cvh.a.o();
      }
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      hx $$1 = $$0.a();
      csf $$2 = $$0.q();
      return $$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      hx $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dij.a)), 3);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      if ($$0.c(b) != dij.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dhn $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dij.b;
      }
   }

   public static void a(csg $$0, dhn $$1, hx $$2, int $$3) {
      hx $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dij.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dij.a)), $$3);
   }

   public static dhn c(csi $$0, hx $$1, dhn $$2) {
      return $$2.b(did.C) ? $$2.a(did.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
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
   public void a(csf $$0, cdz $$1, hx $$2, dhn $$3, @Nullable dfi $$4, clo $$5) {
      super.a($$0, $$1, $$2, cvh.a.o(), $$4, $$5);
   }

   protected static void b(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      dij $$4 = $$2.c(b);
      if ($$4 == dij.a) {
         hx $$5 = $$1.d();
         dhn $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dij.b) {
            dhn $$7 = $$6.u().b(ecy.c) ? cvh.G.o() : cvh.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cvf.i($$6));
         }
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(dhn $$0, hx $$1) {
      return atq.b($$1.u(), $$1.c($$0.c(b) == dij.b ? 0 : 1).v(), $$1.w());
   }
}
