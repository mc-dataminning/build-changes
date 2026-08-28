import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwr extends bvh<btp> {
   private static final int c = 40;
   private int d;
   @Nullable
   private epq e;
   @Nullable
   private jd f;
   private float g;

   public bwr() {
      this(150, 250);
   }

   public bwr(int $$0, int $$1) {
      super(ImmutableMap.of(ccs.E, cct.c, ccs.t, cct.b, ccs.m, cct.a), $$0, $$1);
   }

   protected boolean a(aqu $$0, btp $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         buq<?> $$2 = $$1.dU();
         ccv $$3 = $$2.c(ccs.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(ccs.m);
            if ($$4) {
               $$2.b(ccs.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqu $$0, btp $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ccv> $$3 = $$1.dU().c(ccs.m);
         boolean $$4 = $$3.<Boolean>map(bwr::a).orElse(false);
         cda $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqu $$0, btp $$1, long $$2) {
      if ($$1.dU().a(ccs.m) && !this.a($$1, $$1.dU().c(ccs.m).get()) && $$1.N().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.N().n();
      $$1.dU().b(ccs.m);
      $$1.dU().b(ccs.t);
      this.e = null;
   }

   protected void c(aqu $$0, btp $$1, long $$2) {
      $$1.dU().a(ccs.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(aqu $$0, btp $$1, long $$2) {
      epq $$3 = $$1.N().j();
      buq<?> $$4 = $$1.dU();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(ccs.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ccv $$5 = $$4.c(ccs.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(btp $$0, ccv $$1, long $$2) {
      jd $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      buq<?> $$4 = $$0.dU();
      if (this.a($$0, $$1)) {
         $$4.b(ccs.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(ccs.E);
         } else if (!$$4.a(ccs.E)) {
            $$4.a(ccs.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         exa $$6 = cej.a((btw)$$0, 10, 7, exa.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(btp $$0, ccv $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(ccv $$0) {
      return $$0.a() instanceof bvs $$2 ? $$2.c().R_() : false;
   }
}
