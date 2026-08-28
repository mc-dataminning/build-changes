import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class cbg extends bzw<byh> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eyo e;
   @Nullable
   private iw f;
   private float g;

   public cbg() {
      this(150, 250);
   }

   public cbg(int $$0, int $$1) {
      super(ImmutableMap.of(chh.F, chi.c, chh.u, chi.b, chh.n, chi.a), $$0, $$1);
   }

   protected boolean a(asb $$0, byh $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bzf<?> $$2 = $$1.ec();
         chk $$3 = $$2.c(chh.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(chh.n);
            if ($$4) {
               $$2.b(chh.F);
            }

            return false;
         }
      }
   }

   protected boolean a(asb $$0, byh $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<chk> $$3 = $$1.ec().c(chh.n);
         boolean $$4 = $$3.<Boolean>map(cbg::a).orElse(false);
         chp $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(asb $$0, byh $$1, long $$2) {
      if ($$1.ec().a(chh.n) && !this.a($$1, $$1.ec().c(chh.n).get()) && $$1.O().q()) {
         this.d = $$0.G_().a(40);
      }

      $$1.O().m();
      $$1.ec().b(chh.n);
      $$1.ec().b(chh.u);
      this.e = null;
   }

   protected void c(asb $$0, byh $$1, long $$2) {
      $$1.ec().a(chh.u, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(asb $$0, byh $$1, long $$2) {
      eyo $$3 = $$1.O().i();
      bzf<?> $$4 = $$1.ec();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(chh.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         chk $$5 = $$4.c(chh.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(byh $$0, chk $$1, long $$2) {
      iw $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      bzf<?> $$4 = $$0.ec();
      if (this.a($$0, $$1)) {
         $$4.b(chh.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(chh.F);
         } else if (!$$4.a(chh.F)) {
            $$4.a(chh.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fgc $$6 = ciy.a((byn)$$0, 10, 7, fgc.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(byh $$0, chk $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(chk $$0) {
      return $$0.a() instanceof cah $$2 ? $$2.c().aa_() : false;
   }
}
