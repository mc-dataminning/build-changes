import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class brz extends bqp<boz> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eig e;
   @Nullable
   private ib f;
   private float g;

   public brz() {
      this(150, 250);
   }

   public brz(int $$0, int $$1) {
      super(ImmutableMap.of(bya.E, byb.c, bya.t, byb.b, bya.m, byb.a), $$0, $$1);
   }

   protected boolean a(apa $$0, boz $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bpy<?> $$2 = $$1.dM();
         byd $$3 = $$2.c(bya.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bya.m);
            if ($$4) {
               $$2.b(bya.E);
            }

            return false;
         }
      }
   }

   protected boolean a(apa $$0, boz $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<byd> $$3 = $$1.dM().c(bya.m);
         boolean $$4 = $$3.<Boolean>map(brz::a).orElse(false);
         byi $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(apa $$0, boz $$1, long $$2) {
      if ($$1.dM().a(bya.m) && !this.a($$1, $$1.dM().c(bya.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dM().b(bya.m);
      $$1.dM().b(bya.t);
      this.e = null;
   }

   protected void c(apa $$0, boz $$1, long $$2) {
      $$1.dM().a(bya.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(apa $$0, boz $$1, long $$2) {
      eig $$3 = $$1.N().j();
      bpy<?> $$4 = $$1.dM();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bya.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         byd $$5 = $$4.c(bya.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(boz $$0, byd $$1, long $$2) {
      ib $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bpy<?> $$4 = $$0.dM();
      if (this.a($$0, $$1)) {
         $$4.b(bya.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bya.E);
         } else if (!$$4.a(bya.E)) {
            $$4.a(bya.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eov $$6 = bzr.a((bpf)$$0, 10, 7, eov.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(boz $$0, byd $$1) {
      return $$1.a().b().k($$0.dj()) <= $$1.c();
   }

   private static boolean a(byd $$0) {
      return $$0.a() instanceof bra $$2 ? $$2.c().P_() : false;
   }
}
