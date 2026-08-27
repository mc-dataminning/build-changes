import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class blz extends bkq<bja> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eas e;
   @Nullable
   private gu f;
   private float g;

   public blz() {
      this(150, 250);
   }

   public blz(int $$0, int $$1) {
      super(ImmutableMap.of(bsa.E, bsb.c, bsa.t, bsb.b, bsa.m, bsb.a), $$0, $$1);
   }

   protected boolean a(akk $$0, bja $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bjz<?> $$2 = $$1.dM();
         bsd $$3 = $$2.c(bsa.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bsa.m);
            if ($$4) {
               $$2.b(bsa.E);
            }

            return false;
         }
      }
   }

   protected boolean a(akk $$0, bja $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bsd> $$3 = $$1.dM().c(bsa.m);
         boolean $$4 = $$3.<Boolean>map(blz::a).orElse(false);
         bsi $$5 = $$1.H();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(akk $$0, bja $$1, long $$2) {
      if ($$1.dM().a(bsa.m) && !this.a($$1, $$1.dM().c(bsa.m).get()) && $$1.H().r()) {
         this.d = $$0.y_().a(40);
      }

      $$1.H().n();
      $$1.dM().b(bsa.m);
      $$1.dM().b(bsa.t);
      this.e = null;
   }

   protected void c(akk $$0, bja $$1, long $$2) {
      $$1.dM().a(bsa.t, this.e);
      $$1.H().a(this.e, (double)this.g);
   }

   protected void d(akk $$0, bja $$1, long $$2) {
      eas $$3 = $$1.H().j();
      bjz<?> $$4 = $$1.dM();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bsa.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bsd $$5 = $$4.c(bsa.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bja $$0, bsd $$1, long $$2) {
      gu $$3 = $$1.a().b();
      this.e = $$0.H().a($$3, 0);
      this.g = $$1.b();
      bjz<?> $$4 = $$0.dM();
      if (this.a($$0, $$1)) {
         $$4.b(bsa.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bsa.E);
         } else if (!$$4.a(bsa.E)) {
            $$4.a(bsa.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ehe $$6 = btp.a((bjh)$$0, 10, 7, ehe.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.H().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bja $$0, bsd $$1) {
      return $$1.a().b().k($$0.dk()) <= $$1.c();
   }

   private static boolean a(bsd $$0) {
      return $$0.a() instanceof blb $$2 ? $$2.c().G_() : false;
   }
}
