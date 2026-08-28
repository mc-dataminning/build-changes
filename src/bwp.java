import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwp extends bvf<btn> {
   private static final int c = 40;
   private int d;
   @Nullable
   private epm e;
   @Nullable
   private jd f;
   private float g;

   public bwp() {
      this(150, 250);
   }

   public bwp(int $$0, int $$1) {
      super(ImmutableMap.of(ccq.E, ccr.c, ccq.t, ccr.b, ccq.m, ccr.a), $$0, $$1);
   }

   protected boolean a(aqt $$0, btn $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         buo<?> $$2 = $$1.dU();
         cct $$3 = $$2.c(ccq.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(ccq.m);
            if ($$4) {
               $$2.b(ccq.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqt $$0, btn $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cct> $$3 = $$1.dU().c(ccq.m);
         boolean $$4 = $$3.<Boolean>map(bwp::a).orElse(false);
         ccy $$5 = $$1.J();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqt $$0, btn $$1, long $$2) {
      if ($$1.dU().a(ccq.m) && !this.a($$1, $$1.dU().c(ccq.m).get()) && $$1.J().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.J().n();
      $$1.dU().b(ccq.m);
      $$1.dU().b(ccq.t);
      this.e = null;
   }

   protected void c(aqt $$0, btn $$1, long $$2) {
      $$1.dU().a(ccq.t, this.e);
      $$1.J().a(this.e, (double)this.g);
   }

   protected void d(aqt $$0, btn $$1, long $$2) {
      epm $$3 = $$1.J().j();
      buo<?> $$4 = $$1.dU();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(ccq.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cct $$5 = $$4.c(ccq.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(btn $$0, cct $$1, long $$2) {
      jd $$3 = $$1.a().b();
      this.e = $$0.J().a($$3, 0);
      this.g = $$1.b();
      buo<?> $$4 = $$0.dU();
      if (this.a($$0, $$1)) {
         $$4.b(ccq.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(ccq.E);
         } else if (!$$4.a(ccq.E)) {
            $$4.a(ccq.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eww $$6 = ceh.a((btu)$$0, 10, 7, eww.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.J().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(btn $$0, cct $$1) {
      return $$1.a().b().k($$0.dq()) <= $$1.c();
   }

   private static boolean a(cct $$0) {
      return $$0.a() instanceof bvq $$2 ? $$2.c().N_() : false;
   }
}
