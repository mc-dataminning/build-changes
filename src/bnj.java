import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bnj extends bma<bkl> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ebt e;
   @Nullable
   private ht f;
   private float g;

   public bnj() {
      this(150, 250);
   }

   public bnj(int $$0, int $$1) {
      super(ImmutableMap.of(btk.E, btl.c, btk.t, btl.b, btk.m, btl.a), $$0, $$1);
   }

   protected boolean a(alq $$0, bkl $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         blj<?> $$2 = $$1.dN();
         btn $$3 = $$2.c(btk.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(btk.m);
            if ($$4) {
               $$2.b(btk.E);
            }

            return false;
         }
      }
   }

   protected boolean a(alq $$0, bkl $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<btn> $$3 = $$1.dN().c(btk.m);
         boolean $$4 = $$3.<Boolean>map(bnj::a).orElse(false);
         bts $$5 = $$1.L();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(alq $$0, bkl $$1, long $$2) {
      if ($$1.dN().a(btk.m) && !this.a($$1, $$1.dN().c(btk.m).get()) && $$1.L().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.L().n();
      $$1.dN().b(btk.m);
      $$1.dN().b(btk.t);
      this.e = null;
   }

   protected void c(alq $$0, bkl $$1, long $$2) {
      $$1.dN().a(btk.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(alq $$0, bkl $$1, long $$2) {
      ebt $$3 = $$1.L().j();
      blj<?> $$4 = $$1.dN();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(btk.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         btn $$5 = $$4.c(btk.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bkl $$0, btn $$1, long $$2) {
      ht $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      blj<?> $$4 = $$0.dN();
      if (this.a($$0, $$1)) {
         $$4.b(btk.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(btk.E);
         } else if (!$$4.a(btk.E)) {
            $$4.a(btk.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eif $$6 = buz.a((bks)$$0, 10, 7, eif.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bkl $$0, btn $$1) {
      return $$1.a().b().k($$0.dl()) <= $$1.c();
   }

   private static boolean a(btn $$0) {
      return $$0.a() instanceof bml $$2 ? $$2.c().N_() : false;
   }
}
