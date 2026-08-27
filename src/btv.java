import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class btv extends bsl<bqv> {
   private static final int c = 40;
   private int d;
   @Nullable
   private elp e;
   @Nullable
   private id f;
   private float g;

   public btv() {
      this(150, 250);
   }

   public btv(int $$0, int $$1) {
      super(ImmutableMap.of(bzw.E, bzx.c, bzw.t, bzx.b, bzw.m, bzx.a), $$0, $$1);
   }

   protected boolean a(apu $$0, bqv $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bru<?> $$2 = $$1.dP();
         bzz $$3 = $$2.c(bzw.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Y())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bzw.m);
            if ($$4) {
               $$2.b(bzw.E);
            }

            return false;
         }
      }
   }

   protected boolean a(apu $$0, bqv $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bzz> $$3 = $$1.dP().c(bzw.m);
         boolean $$4 = $$3.<Boolean>map(btv::a).orElse(false);
         cae $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(apu $$0, bqv $$1, long $$2) {
      if ($$1.dP().a(bzw.m) && !this.a($$1, $$1.dP().c(bzw.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dP().b(bzw.m);
      $$1.dP().b(bzw.t);
      this.e = null;
   }

   protected void c(apu $$0, bqv $$1, long $$2) {
      $$1.dP().a(bzw.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(apu $$0, bqv $$1, long $$2) {
      elp $$3 = $$1.K().j();
      bru<?> $$4 = $$1.dP();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bzw.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bzz $$5 = $$4.c(bzw.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Y())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bqv $$0, bzz $$1, long $$2) {
      id $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bru<?> $$4 = $$0.dP();
      if (this.a($$0, $$1)) {
         $$4.b(bzw.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bzw.E);
         } else if (!$$4.a(bzw.E)) {
            $$4.a(bzw.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         esj $$6 = cbn.a((brb)$$0, 10, 7, esj.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bqv $$0, bzz $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(bzz $$0) {
      return $$0.a() instanceof bsw $$2 ? $$2.c().N_() : false;
   }
}
