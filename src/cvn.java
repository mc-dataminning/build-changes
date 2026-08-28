import java.util.List;
import java.util.Optional;

public class cvn extends cur {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dhp z;
   private final dcu A;
   private final dcu B;
   private final dcu C;
   private final cuh D = cuh.a();

   public cvn(int $$0, cqh $$1) {
      this($$0, $$1, cua.a);
   }

   public cvn(int $$0, cqh $$1, cua $$2) {
      this($$0, $$1, $$2, $$1.k.dV());
   }

   private cvn(int $$0, cqh $$1, cua $$2, dhp $$3) {
      super(cuw.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dcu.b);
      this.B = $$3.Q().a(dcu.c);
      this.C = $$3.Q().a(dcu.d);
      this.a(this.D).a(0);
   }

   private static cus a(dcm $$0) {
      dcu $$1 = $$0.a(dcu.b);
      dcu $$2 = $$0.a(dcu.c);
      dcu $$3 = $$0.a(dcu.d);
      return cus.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dym $$0) {
      return $$0.a(dkw.oD);
   }

   @Override
   protected void a(cqi $$0, cxy $$1) {
      $$1.a($$0.dV(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cxy> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private ddh p() {
      return new ddh(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cxy $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(btj $$0) {
      super.a($$0);
      if (this.z instanceof arn) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      ddh $$0 = this.p();
      Optional<dcq<ddg>> $$2;
      if (this.z instanceof arn $$1) {
         $$2 = $$1.t().a(dcw.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cxy $$2x = ((ddg)$$1x.b()).a($$0, this.z.F_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cxy.k);
      });
   }

   @Override
   public boolean a(cxy $$0, cvk $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cxy $$0) {
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
