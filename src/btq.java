import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class btq extends bsg<bqq> {
   private static final int c = 40;
   private int d;
   @Nullable
   private elg e;
   @Nullable
   private ib f;
   private float g;

   public btq() {
      this(150, 250);
   }

   public btq(int $$0, int $$1) {
      super(ImmutableMap.of(bzr.E, bzs.c, bzr.t, bzs.b, bzr.m, bzs.a), $$0, $$1);
   }

   protected boolean a(aps $$0, bqq $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         brp<?> $$2 = $$1.dP();
         bzu $$3 = $$2.c(bzr.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Y())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bzr.m);
            if ($$4) {
               $$2.b(bzr.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aps $$0, bqq $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bzu> $$3 = $$1.dP().c(bzr.m);
         boolean $$4 = $$3.<Boolean>map(btq::a).orElse(false);
         bzz $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aps $$0, bqq $$1, long $$2) {
      if ($$1.dP().a(bzr.m) && !this.a($$1, $$1.dP().c(bzr.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dP().b(bzr.m);
      $$1.dP().b(bzr.t);
      this.e = null;
   }

   protected void c(aps $$0, bqq $$1, long $$2) {
      $$1.dP().a(bzr.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(aps $$0, bqq $$1, long $$2) {
      elg $$3 = $$1.K().j();
      brp<?> $$4 = $$1.dP();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bzr.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bzu $$5 = $$4.c(bzr.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Y())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bqq $$0, bzu $$1, long $$2) {
      ib $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      brp<?> $$4 = $$0.dP();
      if (this.a($$0, $$1)) {
         $$4.b(bzr.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bzr.E);
         } else if (!$$4.a(bzr.E)) {
            $$4.a(bzr.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         esa $$6 = cbi.a((bqw)$$0, 10, 7, esa.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bqq $$0, bzu $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(bzu $$0) {
      return $$0.a() instanceof bsr $$2 ? $$2.c().N_() : false;
   }
}
