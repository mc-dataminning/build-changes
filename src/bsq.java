import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bsq extends brg<bpq> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ejc e;
   @Nullable
   private ib f;
   private float g;

   public bsq() {
      this(150, 250);
   }

   public bsq(int $$0, int $$1) {
      super(ImmutableMap.of(byr.E, bys.c, byr.t, bys.b, byr.m, bys.a), $$0, $$1);
   }

   protected boolean a(apf $$0, bpq $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bqp<?> $$2 = $$1.dP();
         byu $$3 = $$2.c(byr.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(byr.m);
            if ($$4) {
               $$2.b(byr.E);
            }

            return false;
         }
      }
   }

   protected boolean a(apf $$0, bpq $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<byu> $$3 = $$1.dP().c(byr.m);
         boolean $$4 = $$3.<Boolean>map(bsq::a).orElse(false);
         byz $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(apf $$0, bpq $$1, long $$2) {
      if ($$1.dP().a(byr.m) && !this.a($$1, $$1.dP().c(byr.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dP().b(byr.m);
      $$1.dP().b(byr.t);
      this.e = null;
   }

   protected void c(apf $$0, bpq $$1, long $$2) {
      $$1.dP().a(byr.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(apf $$0, bpq $$1, long $$2) {
      ejc $$3 = $$1.K().j();
      bqp<?> $$4 = $$1.dP();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(byr.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         byu $$5 = $$4.c(byr.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bpq $$0, byu $$1, long $$2) {
      ib $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bqp<?> $$4 = $$0.dP();
      if (this.a($$0, $$1)) {
         $$4.b(byr.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(byr.E);
         } else if (!$$4.a(byr.E)) {
            $$4.a(byr.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         epr $$6 = cai.a((bpw)$$0, 10, 7, epr.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bpq $$0, byu $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(byu $$0) {
      return $$0.a() instanceof brr $$2 ? $$2.c().N_() : false;
   }
}
