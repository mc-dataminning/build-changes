import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwb extends bur<bta> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eop e;
   @Nullable
   private ja f;
   private float g;

   public bwb() {
      this(150, 250);
   }

   public bwb(int $$0, int $$1) {
      super(ImmutableMap.of(ccc.E, ccd.c, ccc.t, ccd.b, ccc.m, ccd.a), $$0, $$1);
   }

   protected boolean a(aqk $$0, bta $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bua<?> $$2 = $$1.dT();
         ccf $$3 = $$2.c(ccc.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(ccc.m);
            if ($$4) {
               $$2.b(ccc.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqk $$0, bta $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ccf> $$3 = $$1.dT().c(ccc.m);
         boolean $$4 = $$3.<Boolean>map(bwb::a).orElse(false);
         cck $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqk $$0, bta $$1, long $$2) {
      if ($$1.dT().a(ccc.m) && !this.a($$1, $$1.dT().c(ccc.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dT().b(ccc.m);
      $$1.dT().b(ccc.t);
      this.e = null;
   }

   protected void c(aqk $$0, bta $$1, long $$2) {
      $$1.dT().a(ccc.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(aqk $$0, bta $$1, long $$2) {
      eop $$3 = $$1.K().j();
      bua<?> $$4 = $$1.dT();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(ccc.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ccf $$5 = $$4.c(ccc.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bta $$0, ccf $$1, long $$2) {
      ja $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bua<?> $$4 = $$0.dT();
      if (this.a($$0, $$1)) {
         $$4.b(ccc.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(ccc.E);
         } else if (!$$4.a(ccc.E)) {
            $$4.a(ccc.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         evz $$6 = cdt.a((bth)$$0, 10, 7, evz.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bta $$0, ccf $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(ccf $$0) {
      return $$0.a() instanceof bvc $$2 ? $$2.c().N_() : false;
   }
}
