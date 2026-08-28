import java.util.List;
import java.util.Optional;

public class cvc extends cug {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dhi z;
   private final dcn A;
   private final dcn B;
   private final dcn C;
   private final ctw D = ctw.a();

   public cvc(int $$0, cpw $$1) {
      this($$0, $$1, ctp.a);
   }

   public cvc(int $$0, cpw $$1, ctp $$2) {
      this($$0, $$1, $$2, $$1.k.dW());
   }

   private cvc(int $$0, cpw $$1, ctp $$2, dhi $$3) {
      super(cul.v, $$0, $$1, $$2, a($$3.P()));
      this.z = $$3;
      this.A = $$3.P().a(dcn.b);
      this.B = $$3.P().a(dcn.c);
      this.C = $$3.P().a(dcn.d);
      this.a(this.D).a(0);
   }

   private static cuh a(dcf $$0) {
      dcn $$1 = $$0.a(dcn.b);
      dcn $$2 = $$0.a(dcn.c);
      dcn $$3 = $$0.a(dcn.d);
      return cuh.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dxv $$0) {
      return $$0.a(dko.ow);
   }

   @Override
   protected void a(cpx $$0, cxp $$1) {
      $$1.a($$0.dW(), $$0, $$1.L());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cxp> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dda p() {
      return new dda(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cxp $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(btc $$0) {
      super.a($$0);
      if (this.z instanceof ash) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dda $$0 = this.p();
      Optional<dcj<dcz>> $$2;
      if (this.z instanceof ash $$1) {
         $$2 = $$1.s().a(dcp.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cxp $$2x = ((dcz)$$1x.b()).a($$0, this.z.K_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cxp.j);
      });
   }

   @Override
   public boolean a(cxp $$0, cuz $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cxp $$0) {
      if (this.B.a($$0) && !this.b(0).h()) {
         return true;
      } else {
         return this.A.a($$0) && !this.b(1).h() ? true : this.C.a($$0) && !this.b(2).h();
      }
   }

   public boolean m() {
      return this.D.b() > 0;
   }
}
