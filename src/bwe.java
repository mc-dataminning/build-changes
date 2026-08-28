import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwe extends buu<btd> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eov e;
   @Nullable
   private ja f;
   private float g;

   public bwe() {
      this(150, 250);
   }

   public bwe(int $$0, int $$1) {
      super(ImmutableMap.of(ccf.E, ccg.c, ccf.t, ccg.b, ccf.m, ccg.a), $$0, $$1);
   }

   protected boolean a(aqm $$0, btd $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bud<?> $$2 = $$1.dU();
         cci $$3 = $$2.c(ccf.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(ccf.m);
            if ($$4) {
               $$2.b(ccf.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqm $$0, btd $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cci> $$3 = $$1.dU().c(ccf.m);
         boolean $$4 = $$3.<Boolean>map(bwe::a).orElse(false);
         ccn $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqm $$0, btd $$1, long $$2) {
      if ($$1.dU().a(ccf.m) && !this.a($$1, $$1.dU().c(ccf.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dU().b(ccf.m);
      $$1.dU().b(ccf.t);
      this.e = null;
   }

   protected void c(aqm $$0, btd $$1, long $$2) {
      $$1.dU().a(ccf.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(aqm $$0, btd $$1, long $$2) {
      eov $$3 = $$1.K().j();
      bud<?> $$4 = $$1.dU();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(ccf.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cci $$5 = $$4.c(ccf.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(btd $$0, cci $$1, long $$2) {
      ja $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bud<?> $$4 = $$0.dU();
      if (this.a($$0, $$1)) {
         $$4.b(ccf.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(ccf.E);
         } else if (!$$4.a(ccf.E)) {
            $$4.a(ccf.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ewf $$6 = cdw.a((btk)$$0, 10, 7, ewf.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(btd $$0, cci $$1) {
      return $$1.a().b().k($$0.dq()) <= $$1.c();
   }

   private static boolean a(cci $$0) {
      return $$0.a() instanceof bvf $$2 ? $$2.c().N_() : false;
   }
}
