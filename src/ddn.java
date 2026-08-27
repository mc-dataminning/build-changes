import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddn extends cvf {
   public static final MapCodec<ddn> a = b(ddn::new);
   public static final die b = did.B;

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   public ddn(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csf $$0, hx $$1, crx $$2) {
      if (!$$0.B) {
         cat $$3 = new cat($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.e());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(csf $$0, hx $$1) {
      a($$0, $$1, null);
   }

   private static void a(csf $$0, hx $$1, @Nullable bll $$2) {
      if (!$$0.B) {
         cat $$3 = new cat($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.ds(), $$3.du(), $$3.dy(), aqv.yg, aqw.e, 1.0F, 1.0F);
         $$0.a($$2, dlx.I, $$1);
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      if (!$$6.a(clr.op) && !$$6.a(clr.tR)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cvh.a.o(), 11);
         clj $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(clr.op)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(arf.c.b($$7));
         return bjb.a($$1.B);
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         bkv $$5 = $$3.w();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bll ? (bll)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(crx $$0) {
      return false;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }
}
