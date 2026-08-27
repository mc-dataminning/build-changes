import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class blx extends bko<biy> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eaq e;
   @Nullable
   private gv f;
   private float g;

   public blx() {
      this(150, 250);
   }

   public blx(int $$0, int $$1) {
      super(ImmutableMap.of(bry.E, brz.c, bry.t, brz.b, bry.m, brz.a), $$0, $$1);
   }

   protected boolean a(aki $$0, biy $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bjx<?> $$2 = $$1.dM();
         bsb $$3 = $$2.c(bry.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bry.m);
            if ($$4) {
               $$2.b(bry.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aki $$0, biy $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bsb> $$3 = $$1.dM().c(bry.m);
         boolean $$4 = $$3.<Boolean>map(blx::a).orElse(false);
         bsg $$5 = $$1.H();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aki $$0, biy $$1, long $$2) {
      if ($$1.dM().a(bry.m) && !this.a($$1, $$1.dM().c(bry.m).get()) && $$1.H().r()) {
         this.d = $$0.y_().a(40);
      }

      $$1.H().n();
      $$1.dM().b(bry.m);
      $$1.dM().b(bry.t);
      this.e = null;
   }

   protected void c(aki $$0, biy $$1, long $$2) {
      $$1.dM().a(bry.t, this.e);
      $$1.H().a(this.e, (double)this.g);
   }

   protected void d(aki $$0, biy $$1, long $$2) {
      eaq $$3 = $$1.H().j();
      bjx<?> $$4 = $$1.dM();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bry.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bsb $$5 = $$4.c(bry.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(biy $$0, bsb $$1, long $$2) {
      gv $$3 = $$1.a().b();
      this.e = $$0.H().a($$3, 0);
      this.g = $$1.b();
      bjx<?> $$4 = $$0.dM();
      if (this.a($$0, $$1)) {
         $$4.b(bry.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bry.E);
         } else if (!$$4.a(bry.E)) {
            $$4.a(bry.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ehf $$6 = btn.a((bjf)$$0, 10, 7, ehf.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.H().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(biy $$0, bsb $$1) {
      return $$1.a().b().k($$0.dk()) <= $$1.c();
   }

   private static boolean a(bsb $$0) {
      return $$0.a() instanceof bkz $$2 ? $$2.c().G_() : false;
   }
}
