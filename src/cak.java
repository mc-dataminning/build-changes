import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class cak extends bza<bxl> {
   private static final int c = 40;
   private int d;
   @Nullable
   private exj e;
   @Nullable
   private iv f;
   private float g;

   public cak() {
      this(150, 250);
   }

   public cak(int $$0, int $$1) {
      super(ImmutableMap.of(cgl.F, cgm.c, cgl.u, cgm.b, cgl.n, cgm.a), $$0, $$1);
   }

   protected boolean a(arq $$0, bxl $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         byj<?> $$2 = $$1.eb();
         cgo $$3 = $$2.c(cgl.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cgl.n);
            if ($$4) {
               $$2.b(cgl.F);
            }

            return false;
         }
      }
   }

   protected boolean a(arq $$0, bxl $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cgo> $$3 = $$1.eb().c(cgl.n);
         boolean $$4 = $$3.<Boolean>map(cak::a).orElse(false);
         cgt $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arq $$0, bxl $$1, long $$2) {
      if ($$1.eb().a(cgl.n) && !this.a($$1, $$1.eb().c(cgl.n).get()) && $$1.O().q()) {
         this.d = $$0.C_().a(40);
      }

      $$1.O().m();
      $$1.eb().b(cgl.n);
      $$1.eb().b(cgl.u);
      this.e = null;
   }

   protected void c(arq $$0, bxl $$1, long $$2) {
      $$1.eb().a(cgl.u, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(arq $$0, bxl $$1, long $$2) {
      exj $$3 = $$1.O().i();
      byj<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cgl.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         cgo $$5 = $$4.c(cgl.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bxl $$0, cgo $$1, long $$2) {
      iv $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      byj<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cgl.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cgl.F);
         } else if (!$$4.a(cgl.F)) {
            $$4.a(cgl.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fex $$6 = cic.a((bxr)$$0, 10, 7, fex.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bxl $$0, cgo $$1) {
      return $$1.a().b().k($$0.du()) <= $$1.c();
   }

   private static boolean a(cgo $$0) {
      return $$0.a() instanceof bzl $$2 ? $$2.c().V_() : false;
   }
}
