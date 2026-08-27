import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bpv extends bqq {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bpv(bjh $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ehd h() {
      float $$0 = this.b.dK().z.i();
      if (this.b.dK().z.i() < 0.3F) {
         return this.k();
      } else {
         ehd $$1;
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
   private ehd k() {
      return btr.a(this.b, 10, 7);
   }

   @Nullable
   private ehd l() {
      akk $$0 = (akk)this.b.dK();
      List<caz> $$1 = $$0.a(bim.bf, this.b.cG().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         caz $$2 = $$1.get(this.b.dK().z.a($$1.size()));
         ehd $$3 = $$2.di();
         return btr.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ehd m() {
      hx $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         gu $$1 = this.a($$0);
         return $$1 == null ? null : btr.a(this.b, 10, 7, ehd.c($$1));
      }
   }

   @Nullable
   private hx n() {
      akk $$0 = (akk)this.b.dK();
      List<hx> $$1 = hx.a(hx.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private gu a(hx $$0) {
      akk $$1 = (akk)this.b.dK();
      btx $$2 = $$1.w();
      List<gu> $$3 = $$2.c($$0x -> true, $$0.q(), 8, btx.b.b).map(bty::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(caz $$0) {
      return $$0.a(this.b.dK().V());
   }
}
