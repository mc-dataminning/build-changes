import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bmg extends bkx<bji> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ebb e;
   @Nullable
   private gw f;
   private float g;

   public bmg() {
      this(150, 250);
   }

   public bmg(int $$0, int $$1) {
      super(ImmutableMap.of(bsh.E, bsi.c, bsh.t, bsi.b, bsh.m, bsi.a), $$0, $$1);
   }

   protected boolean a(akr $$0, bji $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bkg<?> $$2 = $$1.dN();
         bsk $$3 = $$2.c(bsh.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bsh.m);
            if ($$4) {
               $$2.b(bsh.E);
            }

            return false;
         }
      }
   }

   protected boolean a(akr $$0, bji $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bsk> $$3 = $$1.dN().c(bsh.m);
         boolean $$4 = $$3.<Boolean>map(bmg::a).orElse(false);
         bsp $$5 = $$1.L();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(akr $$0, bji $$1, long $$2) {
      if ($$1.dN().a(bsh.m) && !this.a($$1, $$1.dN().c(bsh.m).get()) && $$1.L().r()) {
         this.d = $$0.D_().a(40);
      }

      $$1.L().n();
      $$1.dN().b(bsh.m);
      $$1.dN().b(bsh.t);
      this.e = null;
   }

   protected void c(akr $$0, bji $$1, long $$2) {
      $$1.dN().a(bsh.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(akr $$0, bji $$1, long $$2) {
      ebb $$3 = $$1.L().j();
      bkg<?> $$4 = $$1.dN();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bsh.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bsk $$5 = $$4.c(bsh.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bji $$0, bsk $$1, long $$2) {
      gw $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bkg<?> $$4 = $$0.dN();
      if (this.a($$0, $$1)) {
         $$4.b(bsh.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bsh.E);
         } else if (!$$4.a(bsh.E)) {
            $$4.a(bsh.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ehn $$6 = btw.a((bjp)$$0, 10, 7, ehn.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bji $$0, bsk $$1) {
      return $$1.a().b().k($$0.dl()) <= $$1.c();
   }

   private static boolean a(bsk $$0) {
      return $$0.a() instanceof bli $$2 ? $$2.c().M_() : false;
   }
}
