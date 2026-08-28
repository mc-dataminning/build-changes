import java.util.List;
import java.util.Optional;

public class cvb extends cuf {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dhh z;
   private final dcm A;
   private final dcm B;
   private final dcm C;

   public cvb(int $$0, cpv $$1) {
      this($$0, $$1, cto.a);
   }

   public cvb(int $$0, cpv $$1, cto $$2) {
      this($$0, $$1, $$2, $$1.k.dV());
   }

   private cvb(int $$0, cpv $$1, cto $$2, dhh $$3) {
      super(cuk.v, $$0, $$1, $$2, a($$3.P()));
      this.z = $$3;
      this.A = $$3.P().a(dcm.b);
      this.B = $$3.P().a(dcm.c);
      this.C = $$3.P().a(dcm.d);
   }

   private static cug a(dce $$0) {
      dcm $$1 = $$0.a(dcm.b);
      dcm $$2 = $$0.a(dcm.c);
      dcm $$3 = $$0.a(dcm.d);
      return cug.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dxu $$0) {
      return $$0.a(dkn.ow);
   }

   @Override
   protected void a(cpw $$0, cxo $$1) {
      $$1.a($$0.dV(), $$0, $$1.L());
      this.t.a($$0, this.m());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cxo> m() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dcz o() {
      return new dcz(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cxo $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      dcz $$0 = this.o();
      Optional<dci<dcy>> $$2;
      if (this.z instanceof ash $$1) {
         $$2 = $$1.s().a(dco.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cxo $$2x = ((dcy)$$1x.b()).a($$0, this.z.K_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cxo.k);
      });
   }

   @Override
   public boolean a(cxo $$0, cuy $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cxo $$0) {
      if (this.B.a($$0) && !this.b(0).h()) {
         return true;
      } else {
         return this.A.a($$0) && !this.b(1).h() ? true : this.C.a($$0) && !this.b(2).h();
      }
   }
}
