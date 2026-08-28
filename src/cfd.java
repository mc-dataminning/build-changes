import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cfd extends cfy {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cfd(byn $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fgc h() {
      float $$0 = this.b.dV().A.i();
      if (this.b.dV().A.i() < 0.3F) {
         return this.k();
      } else {
         fgc $$1;
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
   private fgc k() {
      return cjb.a(this.b, 10, 7);
   }

   @Nullable
   private fgc l() {
      asb $$0 = (asb)this.b.dV();
      List<cru> $$1 = $$0.a(bxn.bE, this.b.cR().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cru $$2 = $$1.get(this.b.dV().A.a($$1.size()));
         fgc $$3 = $$2.dt();
         return cjb.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fgc m() {
      jz $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         iw $$1 = this.a($$0);
         return $$1 == null ? null : cjb.a(this.b, 10, 7, fgc.c($$1));
      }
   }

   @Nullable
   private jz n() {
      asb $$0 = (asb)this.b.dV();
      List<jz> $$1 = jz.a(jz.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private iw a(jz $$0) {
      asb $$1 = (asb)this.b.dV();
      cjh $$2 = $$1.A();
      List<iw> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cjh.b.b).map(cji::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cru $$0) {
      return $$0.a(this.b.dV().ae());
   }
}
