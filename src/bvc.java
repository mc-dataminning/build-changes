import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bvc extends bts<bsc> {
   private static final int c = 40;
   private int d;
   @Nullable
   private emo e;
   @Nullable
   private in f;
   private float g;

   public bvc() {
      this(150, 250);
   }

   public bvc(int $$0, int $$1) {
      super(ImmutableMap.of(cbd.E, cbe.c, cbd.t, cbe.b, cbd.m, cbe.a), $$0, $$1);
   }

   protected boolean a(aqh $$0, bsc $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         btb<?> $$2 = $$1.dQ();
         cbg $$3 = $$2.c(cbd.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Y())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cbd.m);
            if ($$4) {
               $$2.b(cbd.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqh $$0, bsc $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cbg> $$3 = $$1.dQ().c(cbd.m);
         boolean $$4 = $$3.<Boolean>map(bvc::a).orElse(false);
         cbl $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqh $$0, bsc $$1, long $$2) {
      if ($$1.dQ().a(cbd.m) && !this.a($$1, $$1.dQ().c(cbd.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dQ().b(cbd.m);
      $$1.dQ().b(cbd.t);
      this.e = null;
   }

   protected void c(aqh $$0, bsc $$1, long $$2) {
      $$1.dQ().a(cbd.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(aqh $$0, bsc $$1, long $$2) {
      emo $$3 = $$1.K().j();
      btb<?> $$4 = $$1.dQ();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cbd.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cbg $$5 = $$4.c(cbd.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Y())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bsc $$0, cbg $$1, long $$2) {
      in $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      btb<?> $$4 = $$0.dQ();
      if (this.a($$0, $$1)) {
         $$4.b(cbd.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cbd.E);
         } else if (!$$4.a(cbd.E)) {
            $$4.a(cbd.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         etp $$6 = ccu.a((bsi)$$0, 10, 7, etp.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bsc $$0, cbg $$1) {
      return $$1.a().b().k($$0.dn()) <= $$1.c();
   }

   private static boolean a(cbg $$0) {
      return $$0.a() instanceof bud $$2 ? $$2.c().N_() : false;
   }
}
