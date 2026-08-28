import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cab extends caw {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cab(btk $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ewf h() {
      float $$0 = this.b.dQ().z.i();
      if (this.b.dQ().z.i() < 0.3F) {
         return this.k();
      } else {
         ewf $$1;
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
   private ewf k() {
      return cdz.a(this.b, 10, 7);
   }

   @Nullable
   private ewf l() {
      aqm $$0 = (aqm)this.b.dQ();
      List<clx> $$1 = $$0.a(bsm.bj, this.b.cL().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         clx $$2 = $$1.get(this.b.dQ().z.a($$1.size()));
         ewf $$3 = $$2.do();
         return cdz.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ewf m() {
      kc $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         ja $$1 = this.a($$0);
         return $$1 == null ? null : cdz.a(this.b, 10, 7, ewf.c($$1));
      }
   }

   @Nullable
   private kc n() {
      aqm $$0 = (aqm)this.b.dQ();
      List<kc> $$1 = kc.a(kc.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private ja a(kc $$0) {
      aqm $$1 = (aqm)this.b.dQ();
      cef $$2 = $$1.y();
      List<ja> $$3 = $$2.c($$0x -> true, $$0.q(), 8, cef.b.b).map(ceg::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(clx $$0) {
      return $$0.a(this.b.dQ().Z());
   }
}
