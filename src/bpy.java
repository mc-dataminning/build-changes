import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bpy extends bqt {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bpy(bjk $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ehi h() {
      float $$0 = this.b.dK().z.i();
      if (this.b.dK().z.i() < 0.3F) {
         return this.k();
      } else {
         ehi $$1;
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
   private ehi k() {
      return btu.a(this.b, 10, 7);
   }

   @Nullable
   private ehi l() {
      akn $$0 = (akn)this.b.dK();
      List<cbc> $$1 = $$0.a(bip.bf, this.b.cG().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cbc $$2 = $$1.get(this.b.dK().z.a($$1.size()));
         ehi $$3 = $$2.di();
         return btu.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ehi m() {
      hz $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         gw $$1 = this.a($$0);
         return $$1 == null ? null : btu.a(this.b, 10, 7, ehi.c($$1));
      }
   }

   @Nullable
   private hz n() {
      akn $$0 = (akn)this.b.dK();
      List<hz> $$1 = hz.a(hz.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private gw a(hz $$0) {
      akn $$1 = (akn)this.b.dK();
      bua $$2 = $$1.w();
      List<gw> $$3 = $$2.c($$0x -> true, $$0.q(), 8, bua.b.b).map(bub::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cbc $$0) {
      return $$0.a(this.b.dK().V());
   }
}
