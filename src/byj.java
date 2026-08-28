import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class byj extends bwz<bvi> {
   private static final int c = 40;
   private int d;
   @Nullable
   private etm e;
   @Nullable
   private ji f;
   private float g;

   public byj() {
      this(150, 250);
   }

   public byj(int $$0, int $$1) {
      super(ImmutableMap.of(cek.E, cel.c, cek.t, cel.b, cek.m, cel.a), $$0, $$1);
   }

   protected boolean a(ard $$0, bvi $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bwi<?> $$2 = $$1.eb();
         cen $$3 = $$2.c(cek.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ad())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cek.m);
            if ($$4) {
               $$2.b(cek.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ard $$0, bvi $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cen> $$3 = $$1.eb().c(cek.m);
         boolean $$4 = $$3.<Boolean>map(byj::a).orElse(false);
         ces $$5 = $$1.P();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ard $$0, bvi $$1, long $$2) {
      if ($$1.eb().a(cek.m) && !this.a($$1, $$1.eb().c(cek.m).get()) && $$1.P().q()) {
         this.d = $$0.H_().a(40);
      }

      $$1.P().m();
      $$1.eb().b(cek.m);
      $$1.eb().b(cek.t);
      this.e = null;
   }

   protected void c(ard $$0, bvi $$1, long $$2) {
      $$1.eb().a(cek.t, this.e);
      $$1.P().a(this.e, (double)this.g);
   }

   protected void d(ard $$0, bvi $$1, long $$2) {
      etm $$3 = $$1.P().i();
      bwi<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cek.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cen $$5 = $$4.c(cek.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ad())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bvi $$0, cen $$1, long $$2) {
      ji $$3 = $$1.a().b();
      this.e = $$0.P().a($$3, 0);
      this.g = $$1.b();
      bwi<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cek.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cek.E);
         } else if (!$$4.a(cek.E)) {
            $$4.a(cek.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         faz $$6 = cgb.a((bvo)$$0, 10, 7, faz.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.P().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bvi $$0, cen $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cen $$0) {
      return $$0.a() instanceof bxk $$2 ? $$2.c().Z_() : false;
   }
}
