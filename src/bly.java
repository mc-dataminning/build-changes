import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bly extends bkp<bja> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ear e;
   @Nullable
   private gu f;
   private float g;

   public bly() {
      this(150, 250);
   }

   public bly(int $$0, int $$1) {
      super(ImmutableMap.of(brz.E, bsa.c, brz.t, bsa.b, brz.m, bsa.a), $$0, $$1);
   }

   protected boolean a(akk $$0, bja $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bjy<?> $$2 = $$1.dM();
         bsc $$3 = $$2.c(brz.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(brz.m);
            if ($$4) {
               $$2.b(brz.E);
            }

            return false;
         }
      }
   }

   protected boolean a(akk $$0, bja $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bsc> $$3 = $$1.dM().c(brz.m);
         boolean $$4 = $$3.<Boolean>map(bly::a).orElse(false);
         bsh $$5 = $$1.H();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(akk $$0, bja $$1, long $$2) {
      if ($$1.dM().a(brz.m) && !this.a($$1, $$1.dM().c(brz.m).get()) && $$1.H().r()) {
         this.d = $$0.y_().a(40);
      }

      $$1.H().n();
      $$1.dM().b(brz.m);
      $$1.dM().b(brz.t);
      this.e = null;
   }

   protected void c(akk $$0, bja $$1, long $$2) {
      $$1.dM().a(brz.t, this.e);
      $$1.H().a(this.e, (double)this.g);
   }

   protected void d(akk $$0, bja $$1, long $$2) {
      ear $$3 = $$1.H().j();
      bjy<?> $$4 = $$1.dM();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(brz.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bsc $$5 = $$4.c(brz.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bja $$0, bsc $$1, long $$2) {
      gu $$3 = $$1.a().b();
      this.e = $$0.H().a($$3, 0);
      this.g = $$1.b();
      bjy<?> $$4 = $$0.dM();
      if (this.a($$0, $$1)) {
         $$4.b(brz.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(brz.E);
         } else if (!$$4.a(brz.E)) {
            $$4.a(brz.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ehd $$6 = bto.a((bjh)$$0, 10, 7, ehd.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.H().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bja $$0, bsc $$1) {
      return $$1.a().b().k($$0.dk()) <= $$1.c();
   }

   private static boolean a(bsc $$0) {
      return $$0.a() instanceof bla $$2 ? $$2.c().G_() : false;
   }
}
