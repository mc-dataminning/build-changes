import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bzs extends byi<bwt> {
   private static final int c = 40;
   private int d;
   @Nullable
   private evh e;
   @Nullable
   private jj f;
   private float g;

   public bzs() {
      this(150, 250);
   }

   public bzs(int $$0, int $$1) {
      super(ImmutableMap.of(cft.F, cfu.c, cft.u, cfu.b, cft.n, cfu.a), $$0, $$1);
   }

   protected boolean a(arn $$0, bwt $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bxr<?> $$2 = $$1.eb();
         cfw $$3 = $$2.c(cft.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cft.n);
            if ($$4) {
               $$2.b(cft.F);
            }

            return false;
         }
      }
   }

   protected boolean a(arn $$0, bwt $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cfw> $$3 = $$1.eb().c(cft.n);
         boolean $$4 = $$3.<Boolean>map(bzs::a).orElse(false);
         cgb $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arn $$0, bwt $$1, long $$2) {
      if ($$1.eb().a(cft.n) && !this.a($$1, $$1.eb().c(cft.n).get()) && $$1.O().q()) {
         this.d = $$0.C_().a(40);
      }

      $$1.O().m();
      $$1.eb().b(cft.n);
      $$1.eb().b(cft.u);
      this.e = null;
   }

   protected void c(arn $$0, bwt $$1, long $$2) {
      $$1.eb().a(cft.u, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(arn $$0, bwt $$1, long $$2) {
      evh $$3 = $$1.O().i();
      bxr<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cft.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         cfw $$5 = $$4.c(cft.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bwt $$0, cfw $$1, long $$2) {
      jj $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      bxr<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cft.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cft.F);
         } else if (!$$4.a(cft.F)) {
            $$4.a(cft.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fcu $$6 = chk.a((bwz)$$0, 10, 7, fcu.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bwt $$0, cfw $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cfw $$0) {
      return $$0.a() instanceof byt $$2 ? $$2.c().U_() : false;
   }
}
