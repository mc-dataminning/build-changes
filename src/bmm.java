import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bmm extends bld<bjo> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eav e;
   @Nullable
   private gw f;
   private float g;

   public bmm() {
      this(150, 250);
   }

   public bmm(int $$0, int $$1) {
      super(ImmutableMap.of(bsn.E, bso.c, bsn.t, bso.b, bsn.m, bso.a), $$0, $$1);
   }

   protected boolean a(akt $$0, bjo $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bkm<?> $$2 = $$1.dN();
         bsq $$3 = $$2.c(bsn.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bsn.m);
            if ($$4) {
               $$2.b(bsn.E);
            }

            return false;
         }
      }
   }

   protected boolean a(akt $$0, bjo $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bsq> $$3 = $$1.dN().c(bsn.m);
         boolean $$4 = $$3.<Boolean>map(bmm::a).orElse(false);
         bsv $$5 = $$1.L();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(akt $$0, bjo $$1, long $$2) {
      if ($$1.dN().a(bsn.m) && !this.a($$1, $$1.dN().c(bsn.m).get()) && $$1.L().r()) {
         this.d = $$0.D_().a(40);
      }

      $$1.L().n();
      $$1.dN().b(bsn.m);
      $$1.dN().b(bsn.t);
      this.e = null;
   }

   protected void c(akt $$0, bjo $$1, long $$2) {
      $$1.dN().a(bsn.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(akt $$0, bjo $$1, long $$2) {
      eav $$3 = $$1.L().j();
      bkm<?> $$4 = $$1.dN();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bsn.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bsq $$5 = $$4.c(bsn.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bjo $$0, bsq $$1, long $$2) {
      gw $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bkm<?> $$4 = $$0.dN();
      if (this.a($$0, $$1)) {
         $$4.b(bsn.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bsn.E);
         } else if (!$$4.a(bsn.E)) {
            $$4.a(bsn.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ehh $$6 = buc.a((bjv)$$0, 10, 7, ehh.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bjo $$0, bsq $$1) {
      return $$1.a().b().k($$0.dl()) <= $$1.c();
   }

   private static boolean a(bsq $$0) {
      return $$0.a() instanceof blo $$2 ? $$2.c().M_() : false;
   }
}
