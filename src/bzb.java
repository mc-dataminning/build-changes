import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bzb extends bxr<bwa> {
   private static final int c = 40;
   private int d;
   @Nullable
   private euk e;
   @Nullable
   private ji f;
   private float g;

   public bzb() {
      this(150, 250);
   }

   public bzb(int $$0, int $$1) {
      super(ImmutableMap.of(cfc.E, cfd.c, cfc.t, cfd.b, cfc.m, cfd.a), $$0, $$1);
   }

   protected boolean a(ard $$0, bwa $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bxa<?> $$2 = $$1.ea();
         cff $$3 = $$2.c(cfc.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cfc.m);
            if ($$4) {
               $$2.b(cfc.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ard $$0, bwa $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cff> $$3 = $$1.ea().c(cfc.m);
         boolean $$4 = $$3.<Boolean>map(bzb::a).orElse(false);
         cfk $$5 = $$1.O();
         return !$$5.k() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ard $$0, bwa $$1, long $$2) {
      if ($$1.ea().a(cfc.m) && !this.a($$1, $$1.ea().c(cfc.m).get()) && $$1.O().q()) {
         this.d = $$0.C_().a(40);
      }

      $$1.O().m();
      $$1.ea().b(cfc.m);
      $$1.ea().b(cfc.t);
      this.e = null;
   }

   protected void c(ard $$0, bwa $$1, long $$2) {
      $$1.ea().a(cfc.t, this.e);
      $$1.O().a(this.e, (double)this.g);
   }

   protected void d(ard $$0, bwa $$1, long $$2) {
      euk $$3 = $$1.O().i();
      bxa<?> $$4 = $$1.ea();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cfc.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cff $$5 = $$4.c(cfc.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bwa $$0, cff $$1, long $$2) {
      ji $$3 = $$1.a().b();
      this.e = $$0.O().a($$3, 0);
      this.g = $$1.b();
      bxa<?> $$4 = $$0.ea();
      if (this.a($$0, $$1)) {
         $$4.b(cfc.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cfc.E);
         } else if (!$$4.a(cfc.E)) {
            $$4.a(cfc.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fbx $$6 = cgt.a((bwg)$$0, 10, 7, fbx.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.O().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bwa $$0, cff $$1) {
      return $$1.a().b().k($$0.du()) <= $$1.c();
   }

   private static boolean a(cff $$0) {
      return $$0.a() instanceof byc $$2 ? $$2.c().U_() : false;
   }
}
