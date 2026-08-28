import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class cad extends byt<bxe> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ewu e;
   @Nullable
   private iu f;
   private float g;

   public cad() {
      this(150, 250);
   }

   public cad(int $$0, int $$1) {
      super(ImmutableMap.of(cge.F, cgf.c, cge.u, cgf.b, cge.n, cgf.a), $$0, $$1);
   }

   protected boolean a(arq $$0, bxe $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         byc<?> $$2 = $$1.eb();
         cgh $$3 = $$2.c(cge.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cge.n);
            if ($$4) {
               $$2.b(cge.F);
            }

            return false;
         }
      }
   }

   protected boolean a(arq $$0, bxe $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cgh> $$3 = $$1.eb().c(cge.n);
         boolean $$4 = $$3.<Boolean>map(cad::a).orElse(false);
         cgm $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arq $$0, bxe $$1, long $$2) {
      if ($$1.eb().a(cge.n) && !this.a($$1, $$1.eb().c(cge.n).get()) && $$1.O().q()) {
         this.d = $$0.C_().a(40);
      }

      $$1.O().m();
      $$1.eb().b(cge.n);
      $$1.eb().b(cge.u);
      this.e = null;
   }

   protected void c(arq $$0, bxe $$1, long $$2) {
      $$1.eb().a(cge.u, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(arq $$0, bxe $$1, long $$2) {
      ewu $$3 = $$1.O().i();
      byc<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cge.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         cgh $$5 = $$4.c(cge.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bxe $$0, cgh $$1, long $$2) {
      iu $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      byc<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cge.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cge.F);
         } else if (!$$4.a(cge.F)) {
            $$4.a(cge.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fei $$6 = chv.a((bxk)$$0, 10, 7, fei.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bxe $$0, cgh $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cgh $$0) {
      return $$0.a() instanceof bze $$2 ? $$2.c().U_() : false;
   }
}
