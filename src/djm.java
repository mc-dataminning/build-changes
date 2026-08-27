import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djm extends dfc implements dmr {
   public static final MapCodec<djm> a = b(djm::new);
   public static final dtw b = djc.aE;
   public static final dtt c = dts.C;
   protected static final float d = 3.0F;
   protected static final exn e = dfc.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final exn f = dfc.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exn g = dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exn h = dfc.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   protected djm(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      switch ((iw)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dbg $$0, ir $$1, iw $$2) {
      dtc $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      iw $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfe.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      if (!$$0.c()) {
         dtc $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dtc $$2 = this.n();
      dcd $$3 = $$0.q();
      ir $$4 = $$0.a();
      epe $$5 = $$0.q().b_($$0.a());

      for (iw $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == epf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }
}
