import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class cax extends bzn<bxy> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eye e;
   @Nullable
   private iw f;
   private float g;

   public cax() {
      this(150, 250);
   }

   public cax(int $$0, int $$1) {
      super(ImmutableMap.of(cgy.F, cgz.c, cgy.u, cgz.b, cgy.n, cgz.a), $$0, $$1);
   }

   protected boolean a(aru $$0, bxy $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         byw<?> $$2 = $$1.ec();
         chb $$3 = $$2.c(cgy.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cgy.n);
            if ($$4) {
               $$2.b(cgy.F);
            }

            return false;
         }
      }
   }

   protected boolean a(aru $$0, bxy $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<chb> $$3 = $$1.ec().c(cgy.n);
         boolean $$4 = $$3.<Boolean>map(cax::a).orElse(false);
         chg $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aru $$0, bxy $$1, long $$2) {
      if ($$1.ec().a(cgy.n) && !this.a($$1, $$1.ec().c(cgy.n).get()) && $$1.O().q()) {
         this.d = $$0.G_().a(40);
      }

      $$1.O().m();
      $$1.ec().b(cgy.n);
      $$1.ec().b(cgy.u);
      this.e = null;
   }

   protected void c(aru $$0, bxy $$1, long $$2) {
      $$1.ec().a(cgy.u, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(aru $$0, bxy $$1, long $$2) {
      eye $$3 = $$1.O().i();
      byw<?> $$4 = $$1.ec();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cgy.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         chb $$5 = $$4.c(cgy.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bxy $$0, chb $$1, long $$2) {
      iw $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      byw<?> $$4 = $$0.ec();
      if (this.a($$0, $$1)) {
         $$4.b(cgy.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cgy.F);
         } else if (!$$4.a(cgy.F)) {
            $$4.a(cgy.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ffs $$6 = cip.a((bye)$$0, 10, 7, ffs.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bxy $$0, chb $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(chb $$0) {
      return $$0.a() instanceof bzy $$2 ? $$2.c().Z_() : false;
   }
}
