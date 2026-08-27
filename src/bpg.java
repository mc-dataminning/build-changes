import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bpg extends bnw<bmh> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eez e;
   @Nullable
   private hx f;
   private float g;

   public bpg() {
      this(150, 250);
   }

   public bpg(int $$0, int $$1) {
      super(ImmutableMap.of(bvh.E, bvi.c, bvh.t, bvi.b, bvh.m, bvi.a), $$0, $$1);
   }

   protected boolean a(amz $$0, bmh $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bnf<?> $$2 = $$1.dO();
         bvk $$3 = $$2.c(bvh.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bvh.m);
            if ($$4) {
               $$2.b(bvh.E);
            }

            return false;
         }
      }
   }

   protected boolean a(amz $$0, bmh $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bvk> $$3 = $$1.dO().c(bvh.m);
         boolean $$4 = $$3.<Boolean>map(bpg::a).orElse(false);
         bvp $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(amz $$0, bmh $$1, long $$2) {
      if ($$1.dO().a(bvh.m) && !this.a($$1, $$1.dO().c(bvh.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dO().b(bvh.m);
      $$1.dO().b(bvh.t);
      this.e = null;
   }

   protected void c(amz $$0, bmh $$1, long $$2) {
      $$1.dO().a(bvh.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(amz $$0, bmh $$1, long $$2) {
      eez $$3 = $$1.N().j();
      bnf<?> $$4 = $$1.dO();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bvh.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bvk $$5 = $$4.c(bvh.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bmh $$0, bvk $$1, long $$2) {
      hx $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bnf<?> $$4 = $$0.dO();
      if (this.a($$0, $$1)) {
         $$4.b(bvh.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bvh.E);
         } else if (!$$4.a(bvh.E)) {
            $$4.a(bvh.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         elm $$6 = bwx.a((bmo)$$0, 10, 7, elm.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bmh $$0, bvk $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(bvk $$0) {
      return $$0.a() instanceof boh $$2 ? $$2.c().P_() : false;
   }
}
