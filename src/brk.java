import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class brk extends bqa<bok> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ehl e;
   @Nullable
   private hz f;
   private float g;

   public brk() {
      this(150, 250);
   }

   public brk(int $$0, int $$1) {
      super(ImmutableMap.of(bxl.E, bxm.c, bxl.t, bxm.b, bxl.m, bxm.a), $$0, $$1);
   }

   protected boolean a(aow $$0, bok $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bpj<?> $$2 = $$1.dO();
         bxo $$3 = $$2.c(bxl.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bxl.m);
            if ($$4) {
               $$2.b(bxl.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aow $$0, bok $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bxo> $$3 = $$1.dO().c(bxl.m);
         boolean $$4 = $$3.<Boolean>map(brk::a).orElse(false);
         bxt $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aow $$0, bok $$1, long $$2) {
      if ($$1.dO().a(bxl.m) && !this.a($$1, $$1.dO().c(bxl.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dO().b(bxl.m);
      $$1.dO().b(bxl.t);
      this.e = null;
   }

   protected void c(aow $$0, bok $$1, long $$2) {
      $$1.dO().a(bxl.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(aow $$0, bok $$1, long $$2) {
      ehl $$3 = $$1.N().j();
      bpj<?> $$4 = $$1.dO();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bxl.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bxo $$5 = $$4.c(bxl.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bok $$0, bxo $$1, long $$2) {
      hz $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bpj<?> $$4 = $$0.dO();
      if (this.a($$0, $$1)) {
         $$4.b(bxl.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bxl.E);
         } else if (!$$4.a(bxl.E)) {
            $$4.a(bxl.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         enz $$6 = bzc.a((boq)$$0, 10, 7, enz.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bok $$0, bxo $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(bxo $$0) {
      return $$0.a() instanceof bql $$2 ? $$2.c().P_() : false;
   }
}
