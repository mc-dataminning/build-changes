import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class cav extends bzl<bxw> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eyc e;
   @Nullable
   private iv f;
   private float g;

   public cav() {
      this(150, 250);
   }

   public cav(int $$0, int $$1) {
      super(ImmutableMap.of(cgw.F, cgx.c, cgw.u, cgx.b, cgw.n, cgx.a), $$0, $$1);
   }

   protected boolean a(ars $$0, bxw $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         byu<?> $$2 = $$1.ec();
         cgz $$3 = $$2.c(cgw.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cgw.n);
            if ($$4) {
               $$2.b(cgw.F);
            }

            return false;
         }
      }
   }

   protected boolean a(ars $$0, bxw $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cgz> $$3 = $$1.ec().c(cgw.n);
         boolean $$4 = $$3.<Boolean>map(cav::a).orElse(false);
         che $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ars $$0, bxw $$1, long $$2) {
      if ($$1.ec().a(cgw.n) && !this.a($$1, $$1.ec().c(cgw.n).get()) && $$1.O().q()) {
         this.d = $$0.G_().a(40);
      }

      $$1.O().m();
      $$1.ec().b(cgw.n);
      $$1.ec().b(cgw.u);
      this.e = null;
   }

   protected void c(ars $$0, bxw $$1, long $$2) {
      $$1.ec().a(cgw.u, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(ars $$0, bxw $$1, long $$2) {
      eyc $$3 = $$1.O().i();
      byu<?> $$4 = $$1.ec();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cgw.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         cgz $$5 = $$4.c(cgw.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bxw $$0, cgz $$1, long $$2) {
      iv $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      byu<?> $$4 = $$0.ec();
      if (this.a($$0, $$1)) {
         $$4.b(cgw.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cgw.F);
         } else if (!$$4.a(cgw.F)) {
            $$4.a(cgw.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ffq $$6 = cin.a((byc)$$0, 10, 7, ffq.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bxw $$0, cgz $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cgz $$0) {
      return $$0.a() instanceof bzw $$2 ? $$2.c().Z_() : false;
   }
}
