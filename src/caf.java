import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class caf extends byv<bxg> {
   private static final int c = 40;
   private int d;
   @Nullable
   private exc e;
   @Nullable
   private iu f;
   private float g;

   public caf() {
      this(150, 250);
   }

   public caf(int $$0, int $$1) {
      super(ImmutableMap.of(cgg.F, cgh.c, cgg.u, cgh.b, cgg.n, cgh.a), $$0, $$1);
   }

   protected boolean a(arq $$0, bxg $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bye<?> $$2 = $$1.ec();
         cgj $$3 = $$2.c(cgg.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cgg.n);
            if ($$4) {
               $$2.b(cgg.F);
            }

            return false;
         }
      }
   }

   protected boolean a(arq $$0, bxg $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cgj> $$3 = $$1.ec().c(cgg.n);
         boolean $$4 = $$3.<Boolean>map(caf::a).orElse(false);
         cgo $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arq $$0, bxg $$1, long $$2) {
      if ($$1.ec().a(cgg.n) && !this.a($$1, $$1.ec().c(cgg.n).get()) && $$1.O().q()) {
         this.d = $$0.C_().a(40);
      }

      $$1.O().m();
      $$1.ec().b(cgg.n);
      $$1.ec().b(cgg.u);
      this.e = null;
   }

   protected void c(arq $$0, bxg $$1, long $$2) {
      $$1.ec().a(cgg.u, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(arq $$0, bxg $$1, long $$2) {
      exc $$3 = $$1.O().i();
      bye<?> $$4 = $$1.ec();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cgg.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         cgj $$5 = $$4.c(cgg.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bxg $$0, cgj $$1, long $$2) {
      iu $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      bye<?> $$4 = $$0.ec();
      if (this.a($$0, $$1)) {
         $$4.b(cgg.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cgg.F);
         } else if (!$$4.a(cgg.F)) {
            $$4.a(cgg.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         feq $$6 = chx.a((bxm)$$0, 10, 7, feq.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bxg $$0, cgj $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cgj $$0) {
      return $$0.a() instanceof bzg $$2 ? $$2.c().V_() : false;
   }
}
