import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bvt extends buj<bss> {
   private static final int c = 40;
   private int d;
   @Nullable
   private enk e;
   @Nullable
   private io f;
   private float g;

   public bvt() {
      this(150, 250);
   }

   public bvt(int $$0, int $$1) {
      super(ImmutableMap.of(cbu.E, cbv.c, cbu.t, cbv.b, cbu.m, cbv.a), $$0, $$1);
   }

   protected boolean a(aqn $$0, bss $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bts<?> $$2 = $$1.dS();
         cbx $$3 = $$2.c(cbu.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Y())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cbu.m);
            if ($$4) {
               $$2.b(cbu.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqn $$0, bss $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cbx> $$3 = $$1.dS().c(cbu.m);
         boolean $$4 = $$3.<Boolean>map(bvt::a).orElse(false);
         ccc $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqn $$0, bss $$1, long $$2) {
      if ($$1.dS().a(cbu.m) && !this.a($$1, $$1.dS().c(cbu.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dS().b(cbu.m);
      $$1.dS().b(cbu.t);
      this.e = null;
   }

   protected void c(aqn $$0, bss $$1, long $$2) {
      $$1.dS().a(cbu.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(aqn $$0, bss $$1, long $$2) {
      enk $$3 = $$1.K().j();
      bts<?> $$4 = $$1.dS();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cbu.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cbx $$5 = $$4.c(cbu.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Y())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bss $$0, cbx $$1, long $$2) {
      io $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bts<?> $$4 = $$0.dS();
      if (this.a($$0, $$1)) {
         $$4.b(cbu.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cbu.E);
         } else if (!$$4.a(cbu.E)) {
            $$4.a(cbu.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eum $$6 = cdl.a((bsz)$$0, 10, 7, eum.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bss $$0, cbx $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(cbx $$0) {
      return $$0.a() instanceof buu $$2 ? $$2.c().N_() : false;
   }
}
