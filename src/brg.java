import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class brg extends bpw<boi> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ehe e;
   @Nullable
   private hz f;
   private float g;

   public brg() {
      this(150, 250);
   }

   public brg(int $$0, int $$1) {
      super(ImmutableMap.of(bxh.E, bxi.c, bxh.t, bxi.b, bxh.m, bxi.a), $$0, $$1);
   }

   protected boolean a(aov $$0, boi $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bpf<?> $$2 = $$1.dO();
         bxk $$3 = $$2.c(bxh.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bxh.m);
            if ($$4) {
               $$2.b(bxh.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aov $$0, boi $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bxk> $$3 = $$1.dO().c(bxh.m);
         boolean $$4 = $$3.<Boolean>map(brg::a).orElse(false);
         bxp $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aov $$0, boi $$1, long $$2) {
      if ($$1.dO().a(bxh.m) && !this.a($$1, $$1.dO().c(bxh.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dO().b(bxh.m);
      $$1.dO().b(bxh.t);
      this.e = null;
   }

   protected void c(aov $$0, boi $$1, long $$2) {
      $$1.dO().a(bxh.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(aov $$0, boi $$1, long $$2) {
      ehe $$3 = $$1.N().j();
      bpf<?> $$4 = $$1.dO();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bxh.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bxk $$5 = $$4.c(bxh.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(boi $$0, bxk $$1, long $$2) {
      hz $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bpf<?> $$4 = $$0.dO();
      if (this.a($$0, $$1)) {
         $$4.b(bxh.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bxh.E);
         } else if (!$$4.a(bxh.E)) {
            $$4.a(bxh.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ens $$6 = byy.a((boo)$$0, 10, 7, ens.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(boi $$0, bxk $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(bxk $$0) {
      return $$0.a() instanceof bqh $$2 ? $$2.c().P_() : false;
   }
}
