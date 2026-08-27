import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bol extends bnc<bln> {
   private static final int c = 40;
   private int d;
   @Nullable
   private edm e;
   @Nullable
   private hx f;
   private float g;

   public bol() {
      this(150, 250);
   }

   public bol(int $$0, int $$1) {
      super(ImmutableMap.of(bum.E, bun.c, bum.t, bun.b, bum.m, bun.a), $$0, $$1);
   }

   protected boolean a(ami $$0, bln $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bml<?> $$2 = $$1.dP();
         bup $$3 = $$2.c(bum.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.W())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bum.m);
            if ($$4) {
               $$2.b(bum.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ami $$0, bln $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bup> $$3 = $$1.dP().c(bum.m);
         boolean $$4 = $$3.<Boolean>map(bol::a).orElse(false);
         buu $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ami $$0, bln $$1, long $$2) {
      if ($$1.dP().a(bum.m) && !this.a($$1, $$1.dP().c(bum.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dP().b(bum.m);
      $$1.dP().b(bum.t);
      this.e = null;
   }

   protected void c(ami $$0, bln $$1, long $$2) {
      $$1.dP().a(bum.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(ami $$0, bln $$1, long $$2) {
      edm $$3 = $$1.N().j();
      bml<?> $$4 = $$1.dP();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bum.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bup $$5 = $$4.c(bum.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.W())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bln $$0, bup $$1, long $$2) {
      hx $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bml<?> $$4 = $$0.dP();
      if (this.a($$0, $$1)) {
         $$4.b(bum.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bum.E);
         } else if (!$$4.a(bum.E)) {
            $$4.a(bum.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ejz $$6 = bwb.a((blu)$$0, 10, 7, ejz.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bln $$0, bup $$1) {
      return $$1.a().b().k($$0.dn()) <= $$1.c();
   }

   private static boolean a(bup $$0) {
      return $$0.a() instanceof bnn $$2 ? $$2.c().P_() : false;
   }
}
