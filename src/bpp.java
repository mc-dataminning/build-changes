import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bpp extends bof<bmq> {
   private static final int c = 40;
   private int d;
   @Nullable
   private efo e;
   @Nullable
   private hx f;
   private float g;

   public bpp() {
      this(150, 250);
   }

   public bpp(int $$0, int $$1) {
      super(ImmutableMap.of(bvq.E, bvr.c, bvq.t, bvr.b, bvq.m, bvr.a), $$0, $$1);
   }

   protected boolean a(ane $$0, bmq $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bno<?> $$2 = $$1.dN();
         bvt $$3 = $$2.c(bvq.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bvq.m);
            if ($$4) {
               $$2.b(bvq.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ane $$0, bmq $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bvt> $$3 = $$1.dN().c(bvq.m);
         boolean $$4 = $$3.<Boolean>map(bpp::a).orElse(false);
         bvy $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ane $$0, bmq $$1, long $$2) {
      if ($$1.dN().a(bvq.m) && !this.a($$1, $$1.dN().c(bvq.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dN().b(bvq.m);
      $$1.dN().b(bvq.t);
      this.e = null;
   }

   protected void c(ane $$0, bmq $$1, long $$2) {
      $$1.dN().a(bvq.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(ane $$0, bmq $$1, long $$2) {
      efo $$3 = $$1.N().j();
      bno<?> $$4 = $$1.dN();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bvq.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bvt $$5 = $$4.c(bvq.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bmq $$0, bvt $$1, long $$2) {
      hx $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bno<?> $$4 = $$0.dN();
      if (this.a($$0, $$1)) {
         $$4.b(bvq.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bvq.E);
         } else if (!$$4.a(bvq.E)) {
            $$4.a(bvq.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         emc $$6 = bxh.a((bmx)$$0, 10, 7, emc.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bmq $$0, bvt $$1) {
      return $$1.a().b().k($$0.dl()) <= $$1.c();
   }

   private static boolean a(bvt $$0) {
      return $$0.a() instanceof boq $$2 ? $$2.c().P_() : false;
   }
}
