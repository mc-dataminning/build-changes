import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bpl extends bob<bmm> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eff e;
   @Nullable
   private hx f;
   private float g;

   public bpl() {
      this(150, 250);
   }

   public bpl(int $$0, int $$1) {
      super(ImmutableMap.of(bvm.E, bvn.c, bvm.t, bvn.b, bvm.m, bvn.a), $$0, $$1);
   }

   protected boolean a(and $$0, bmm $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bnk<?> $$2 = $$1.dO();
         bvp $$3 = $$2.c(bvm.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bvm.m);
            if ($$4) {
               $$2.b(bvm.E);
            }

            return false;
         }
      }
   }

   protected boolean a(and $$0, bmm $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bvp> $$3 = $$1.dO().c(bvm.m);
         boolean $$4 = $$3.<Boolean>map(bpl::a).orElse(false);
         bvu $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(and $$0, bmm $$1, long $$2) {
      if ($$1.dO().a(bvm.m) && !this.a($$1, $$1.dO().c(bvm.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dO().b(bvm.m);
      $$1.dO().b(bvm.t);
      this.e = null;
   }

   protected void c(and $$0, bmm $$1, long $$2) {
      $$1.dO().a(bvm.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(and $$0, bmm $$1, long $$2) {
      eff $$3 = $$1.N().j();
      bnk<?> $$4 = $$1.dO();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bvm.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bvp $$5 = $$4.c(bvm.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bmm $$0, bvp $$1, long $$2) {
      hx $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bnk<?> $$4 = $$0.dO();
      if (this.a($$0, $$1)) {
         $$4.b(bvm.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bvm.E);
         } else if (!$$4.a(bvm.E)) {
            $$4.a(bvm.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         els $$6 = bxc.a((bmt)$$0, 10, 7, els.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bmm $$0, bvp $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(bvp $$0) {
      return $$0.a() instanceof bom $$2 ? $$2.c().P_() : false;
   }
}
