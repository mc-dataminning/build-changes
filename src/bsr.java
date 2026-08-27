import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bsr extends brh<bpr> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ejd e;
   @Nullable
   private ib f;
   private float g;

   public bsr() {
      this(150, 250);
   }

   public bsr(int $$0, int $$1) {
      super(ImmutableMap.of(bys.E, byt.c, bys.t, byt.b, bys.m, byt.a), $$0, $$1);
   }

   protected boolean a(apf $$0, bpr $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bqq<?> $$2 = $$1.dP();
         byv $$3 = $$2.c(bys.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bys.m);
            if ($$4) {
               $$2.b(bys.E);
            }

            return false;
         }
      }
   }

   protected boolean a(apf $$0, bpr $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<byv> $$3 = $$1.dP().c(bys.m);
         boolean $$4 = $$3.<Boolean>map(bsr::a).orElse(false);
         bza $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(apf $$0, bpr $$1, long $$2) {
      if ($$1.dP().a(bys.m) && !this.a($$1, $$1.dP().c(bys.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dP().b(bys.m);
      $$1.dP().b(bys.t);
      this.e = null;
   }

   protected void c(apf $$0, bpr $$1, long $$2) {
      $$1.dP().a(bys.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(apf $$0, bpr $$1, long $$2) {
      ejd $$3 = $$1.K().j();
      bqq<?> $$4 = $$1.dP();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bys.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         byv $$5 = $$4.c(bys.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bpr $$0, byv $$1, long $$2) {
      ib $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bqq<?> $$4 = $$0.dP();
      if (this.a($$0, $$1)) {
         $$4.b(bys.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bys.E);
         } else if (!$$4.a(bys.E)) {
            $$4.a(bys.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ept $$6 = caj.a((bpx)$$0, 10, 7, ept.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bpr $$0, byv $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(byv $$0) {
      return $$0.a() instanceof brs $$2 ? $$2.c().N_() : false;
   }
}
