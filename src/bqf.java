import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bqf extends bra {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bqf(bjr $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ehp h() {
      float $$0 = this.b.dL().z.i();
      if (this.b.dL().z.i() < 0.3F) {
         return this.k();
      } else {
         ehp $$1;
         if ($$0 < 0.7F) {
            $$1 = this.l();
            if ($$1 == null) {
               $$1 = this.m();
            }
         } else {
            $$1 = this.m();
            if ($$1 == null) {
               $$1 = this.l();
            }
         }

         return $$1 == null ? this.k() : $$1;
      }
   }

   @Nullable
   private ehp k() {
      return bub.a(this.b, 10, 7);
   }

   @Nullable
   private ehp l() {
      aks $$0 = (aks)this.b.dL();
      List<cbj> $$1 = $$0.a(biw.bf, this.b.cG().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cbj $$2 = $$1.get(this.b.dL().z.a($$1.size()));
         ehp $$3 = $$2.dj();
         return bub.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ehp m() {
      hz $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         gw $$1 = this.a($$0);
         return $$1 == null ? null : bub.a(this.b, 10, 7, ehp.c($$1));
      }
   }

   @Nullable
   private hz n() {
      aks $$0 = (aks)this.b.dL();
      List<hz> $$1 = hz.a(hz.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private gw a(hz $$0) {
      aks $$1 = (aks)this.b.dL();
      buh $$2 = $$1.w();
      List<gw> $$3 = $$2.c($$0x -> true, $$0.q(), 8, buh.b.b).map(bui::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cbj $$0) {
      return $$0.a(this.b.dL().V());
   }
}
