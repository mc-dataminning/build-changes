import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bvq extends bug<bsq> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eps e;
   @Nullable
   private ir f;
   private float g;

   public bvq() {
      this(150, 250);
   }

   public bvq(int $$0, int $$1) {
      super(ImmutableMap.of(cbr.E, cbs.c, cbr.t, cbs.b, cbr.m, cbs.a), $$0, $$1);
   }

   protected boolean a(aqt $$0, bsq $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         btp<?> $$2 = $$1.dZ();
         cbu $$3 = $$2.c(cbr.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cbr.m);
            if ($$4) {
               $$2.b(cbr.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqt $$0, bsq $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cbu> $$3 = $$1.dZ().c(cbr.m);
         boolean $$4 = $$3.<Boolean>map(bvq::a).orElse(false);
         cbz $$5 = $$1.J();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqt $$0, bsq $$1, long $$2) {
      if ($$1.dZ().a(cbr.m) && !this.a($$1, $$1.dZ().c(cbr.m).get()) && $$1.J().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.J().n();
      $$1.dZ().b(cbr.m);
      $$1.dZ().b(cbr.t);
      this.e = null;
   }

   protected void c(aqt $$0, bsq $$1, long $$2) {
      $$1.dZ().a(cbr.t, this.e);
      $$1.J().a(this.e, (double)this.g);
   }

   protected void d(aqt $$0, bsq $$1, long $$2) {
      eps $$3 = $$1.J().j();
      btp<?> $$4 = $$1.dZ();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cbr.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cbu $$5 = $$4.c(cbr.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bsq $$0, cbu $$1, long $$2) {
      ir $$3 = $$1.a().b();
      this.e = $$0.J().a($$3, 0);
      this.g = $$1.b();
      btp<?> $$4 = $$0.dZ();
      if (this.a($$0, $$1)) {
         $$4.b(cbr.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cbr.E);
         } else if (!$$4.a(cbr.E)) {
            $$4.a(cbr.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ewu $$6 = cdi.a((bsw)$$0, 10, 7, ewu.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.J().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bsq $$0, cbu $$1) {
      return $$1.a().b().k($$0.du()) <= $$1.c();
   }

   private static boolean a(cbu $$0) {
      return $$0.a() instanceof bur $$2 ? $$2.c().O_() : false;
   }
}
