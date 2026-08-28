import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class caa extends byq<bxb> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ewj e;
   @Nullable
   private iu f;
   private float g;

   public caa() {
      this(150, 250);
   }

   public caa(int $$0, int $$1) {
      super(ImmutableMap.of(cgb.F, cgc.c, cgb.u, cgc.b, cgb.n, cgc.a), $$0, $$1);
   }

   protected boolean a(aro $$0, bxb $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bxz<?> $$2 = $$1.eb();
         cge $$3 = $$2.c(cgb.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cgb.n);
            if ($$4) {
               $$2.b(cgb.F);
            }

            return false;
         }
      }
   }

   protected boolean a(aro $$0, bxb $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cge> $$3 = $$1.eb().c(cgb.n);
         boolean $$4 = $$3.<Boolean>map(caa::a).orElse(false);
         cgj $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aro $$0, bxb $$1, long $$2) {
      if ($$1.eb().a(cgb.n) && !this.a($$1, $$1.eb().c(cgb.n).get()) && $$1.O().q()) {
         this.d = $$0.C_().a(40);
      }

      $$1.O().m();
      $$1.eb().b(cgb.n);
      $$1.eb().b(cgb.u);
      this.e = null;
   }

   protected void c(aro $$0, bxb $$1, long $$2) {
      $$1.eb().a(cgb.u, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(aro $$0, bxb $$1, long $$2) {
      ewj $$3 = $$1.O().i();
      bxz<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cgb.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         cge $$5 = $$4.c(cgb.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bxb $$0, cge $$1, long $$2) {
      iu $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      bxz<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cgb.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cgb.F);
         } else if (!$$4.a(cgb.F)) {
            $$4.a(cgb.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fdw $$6 = chs.a((bxh)$$0, 10, 7, fdw.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bxb $$0, cge $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cge $$0) {
      return $$0.a() instanceof bzb $$2 ? $$2.c().U_() : false;
   }
}
