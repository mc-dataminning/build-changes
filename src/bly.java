import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bly extends bkz<bjk> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private gw h;
   private int i;
   private int j;
   private int k;

   public bly(float $$0) {
      super(ImmutableMap.of(bsj.w, bsk.a, bsj.m, bsk.b));
      this.g = $$0;
   }

   protected boolean a(aks $$0, bjk $$1) {
      return $$1.m_() && this.b($$0, $$1);
   }

   protected void a(aks $$0, bjk $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aks $$0, bjk $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aks $$0, bjk $$1, long $$2) {
      return $$1.m_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aks $$0, bjk $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.K().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(bjk $$0, gw $$1) {
      $$0.dN().a(bsj.m, new bsm($$1, this.g, 0));
   }

   private boolean b(aks $$0, bjk $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aks $$0, bjk $$1) {
      gw $$2 = $$1.dl();
      gw $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aks $$0, bjk $$1) {
      return this.a($$0, $$1.dl());
   }

   private boolean a(aks $$0, gw $$1) {
      return $$0.a_($$1).a(apu.R);
   }

   private Optional<gw> a(bjk $$0) {
      return $$0.dN().c(bsj.w);
   }

   private boolean e(aks $$0, bjk $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aks $$0, bjk $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
