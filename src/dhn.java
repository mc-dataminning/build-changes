import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhn extends dfo {
   public static final MapCodec<dhn> a = b(dhn::new);
   public static final dtf<dtd> b = dsx.ae;

   @Override
   public MapCodec<? extends dhn> a() {
      return a;
   }

   public dhn(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtd.b));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      dtd $$6 = $$0.c(b);
      if ($$1.o() != jf.a.b || $$6 == dtd.b != ($$1 == jf.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dtd.b && $$1 == jf.a && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfh.a.o();
      }
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      ja $$1 = $$0.a();
      dcd $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
      ja $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dtd.a)), 3);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      if ($$0.c(b) != dtd.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dsh $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dtd.b;
      }
   }

   public static void a(dce $$0, dsh $$1, ja $$2, int $$3) {
      ja $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dtd.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dtd.a)), $$3);
   }

   public static dsh c(dcg $$0, ja $$1, dsh $$2) {
      return $$2.b(dsx.C) ? $$2.a(dsx.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eT());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcd $$0, cmh $$1, ja $$2, dsh $$3, @Nullable dpn $$4, cua $$5) {
      super.a($$0, $$1, $$2, dfh.a.o(), $$4, $$5);
   }

   protected static void b(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      dtd $$4 = $$2.c(b);
      if ($$4 == dtd.a) {
         ja $$5 = $$1.d();
         dsh $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dtd.b) {
            dsh $$7 = $$6.u().b(eoc.c) ? dfh.G.o() : dfh.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dff.i($$6));
         }
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dsh $$0, ja $$1) {
      return aye.b($$1.u(), $$1.c($$0.c(b) == dtd.b ? 0 : 1).v(), $$1.w());
   }
}
