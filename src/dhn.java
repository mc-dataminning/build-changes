import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhn extends czf {
   public static final MapCodec<dhn> a = b(dhn::new);
   public static final dmv b = dmu.B;

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public dhn(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cwe $$0, ib $$1, cvw $$2) {
      if (!$$0.B) {
         cem $$3 = new cem($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cwe $$0, ib $$1) {
      a($$0, $$1, null);
   }

   private static void a(cwe $$0, ib $$1, @Nullable box $$2) {
      if (!$$0.B) {
         cem $$3 = new cem($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.do(), $$3.dq(), $$3.du(), atp.yR, atq.e, 1.0F, 1.0F);
         $$0.a($$2, dqr.I, $$1);
      }
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if (!$$0.a(cpt.or) && !$$0.a(cpt.tV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, czh.a.o(), 11);
         cpl $$7 = $$0.d();
         if (!$$4.f()) {
            if ($$0.a(cpt.or)) {
               $$0.a(1, $$4, box.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(atz.c.b($$7));
         return bmn.a($$2.B);
      }
   }

   @Override
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      if (!$$0.B) {
         ib $$4 = $$2.a();
         bof $$5 = $$3.w();
         if ($$3.bK() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof box ? (box)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cvw $$0) {
      return false;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }
}
