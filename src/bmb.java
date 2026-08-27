import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bmb extends bks<bjd> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eaw e;
   @Nullable
   private gw f;
   private float g;

   public bmb() {
      this(150, 250);
   }

   public bmb(int $$0, int $$1) {
      super(ImmutableMap.of(bsc.E, bsd.c, bsc.t, bsd.b, bsc.m, bsd.a), $$0, $$1);
   }

   protected boolean a(akn $$0, bjd $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bkb<?> $$2 = $$1.dM();
         bsf $$3 = $$2.c(bsc.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bsc.m);
            if ($$4) {
               $$2.b(bsc.E);
            }

            return false;
         }
      }
   }

   protected boolean a(akn $$0, bjd $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bsf> $$3 = $$1.dM().c(bsc.m);
         boolean $$4 = $$3.<Boolean>map(bmb::a).orElse(false);
         bsk $$5 = $$1.H();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(akn $$0, bjd $$1, long $$2) {
      if ($$1.dM().a(bsc.m) && !this.a($$1, $$1.dM().c(bsc.m).get()) && $$1.H().r()) {
         this.d = $$0.y_().a(40);
      }

      $$1.H().n();
      $$1.dM().b(bsc.m);
      $$1.dM().b(bsc.t);
      this.e = null;
   }

   protected void c(akn $$0, bjd $$1, long $$2) {
      $$1.dM().a(bsc.t, this.e);
      $$1.H().a(this.e, (double)this.g);
   }

   protected void d(akn $$0, bjd $$1, long $$2) {
      eaw $$3 = $$1.H().j();
      bkb<?> $$4 = $$1.dM();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bsc.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bsf $$5 = $$4.c(bsc.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bjd $$0, bsf $$1, long $$2) {
      gw $$3 = $$1.a().b();
      this.e = $$0.H().a($$3, 0);
      this.g = $$1.b();
      bkb<?> $$4 = $$0.dM();
      if (this.a($$0, $$1)) {
         $$4.b(bsc.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bsc.E);
         } else if (!$$4.a(bsc.E)) {
            $$4.a(bsc.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ehi $$6 = btr.a((bjk)$$0, 10, 7, ehi.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.H().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bjd $$0, bsf $$1) {
      return $$1.a().b().k($$0.dk()) <= $$1.c();
   }

   private static boolean a(bsf $$0) {
      return $$0.a() instanceof bld $$2 ? $$2.c().G_() : false;
   }
}
