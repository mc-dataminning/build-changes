import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhl extends dfl {
   public static final MapCodec<dhl> a = b(dhl::new);
   public static final dua<dty> b = dts.ae;

   @Override
   public MapCodec<? extends dhl> a() {
      return a;
   }

   public dhl(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dty.b));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      dty $$6 = $$0.c(b);
      if ($$1.o() != iw.a.b || $$6 == dty.b != ($$1 == iw.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dty.b && $$1 == iw.a && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfe.a.n();
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      ir $$1 = $$0.a();
      dca $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, bso $$3, cuh $$4) {
      ir $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.n().a(b, dty.a)), 3);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      if ($$0.c(b) != dty.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dtc $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dty.b;
      }
   }

   public static void a(dcb $$0, dtc $$1, ir $$2, int $$3) {
      ir $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dty.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dty.a)), $$3);
   }

   public static dtc c(dcd $$0, ir $$1, dtc $$2) {
      return $$2.b(dts.C) ? $$2.a(dts.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      if (!$$0.C) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fg());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dca $$0, cly $$1, ir $$2, dtc $$3, @Nullable dqc $$4, cuh $$5) {
      super.a($$0, $$1, $$2, dfe.a.n(), $$4, $$5);
   }

   protected static void b(dca $$0, ir $$1, dtc $$2, cly $$3) {
      dty $$4 = $$2.c(b);
      if ($$4 == dty.a) {
         ir $$5 = $$1.d();
         dtc $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dty.b) {
            dtc $$7 = $$6.u().b(epf.c) ? dfe.al.n() : dfe.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dfc.i($$6));
         }
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dtc $$0, ir $$1) {
      return aym.b($$1.u(), $$1.c($$0.c(b) == dty.b ? 0 : 1).v(), $$1.w());
   }
}
