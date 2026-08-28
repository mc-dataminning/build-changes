import java.util.List;
import java.util.Optional;

public class cyc extends cxf {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dkj z;
   private final dfk A;
   private final dfk B;
   private final dfk C;
   private final cwv D = cwv.a();

   public cyc(int $$0, csh $$1) {
      this($$0, $$1, cwo.a);
   }

   public cyc(int $$0, csh $$1, cwo $$2) {
      this($$0, $$1, $$2, $$1.h.dV());
   }

   private cyc(int $$0, csh $$1, cwo $$2, dkj $$3) {
      super(cxk.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dfk.b);
      this.B = $$3.Q().a(dfk.c);
      this.C = $$3.Q().a(dfk.d);
      this.a(this.D).a(0);
   }

   private static cxg a(dfc $$0) {
      dfk $$1 = $$0.a(dfk.b);
      dfk $$2 = $$0.a(dfk.c);
      dfk $$3 = $$0.a(dfk.d);
      return cxg.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(ebq $$0) {
      return $$0.a(dnq.oH);
   }

   @Override
   protected void a(csi $$0, dak $$1) {
      $$1.a($$0.dV(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<dak> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dfx p() {
      return new dfx(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      dak $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(buv $$0) {
      super.a($$0);
      if (this.z instanceof asb) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dfx $$0 = this.p();
      Optional<dfg<dfw>> $$2;
      if (this.z instanceof asb $$1) {
         $$2 = $$1.t().a(dfm.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         dak $$2x = ((dfw)$$1x.b()).a($$0, this.z.J_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, dak.l);
      });
   }

   @Override
   public boolean a(dak $$0, cxz $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean b(dak $$0) {
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
