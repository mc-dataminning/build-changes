import java.util.List;
import java.util.Optional;

public class cwq extends cvu {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final div z;
   private final ddy A;
   private final ddy B;
   private final ddy C;
   private final cvk D = cvk.a();

   public cwq(int $$0, cqx $$1) {
      this($$0, $$1, cvd.a);
   }

   public cwq(int $$0, cqx $$1, cvd $$2) {
      this($$0, $$1, $$2, $$1.k.dV());
   }

   private cwq(int $$0, cqx $$1, cvd $$2, div $$3) {
      super(cvz.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(ddy.b);
      this.B = $$3.Q().a(ddy.c);
      this.C = $$3.Q().a(ddy.d);
      this.a(this.D).a(0);
   }

   private static cvv a(ddq $$0) {
      ddy $$1 = $$0.a(ddy.b);
      ddy $$2 = $$0.a(ddy.c);
      ddy $$3 = $$0.a(ddy.d);
      return cvv.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dzz $$0) {
      return $$0.a(dmc.oE);
   }

   @Override
   protected void a(cqy $$0, cyy $$1) {
      $$1.a($$0.dV(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cyy> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private del p() {
      return new del(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cyy $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(btu $$0) {
      super.a($$0);
      if (this.z instanceof arq) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      del $$0 = this.p();
      Optional<ddu<dek>> $$2;
      if (this.z instanceof arq $$1) {
         $$2 = $$1.t().a(dea.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cyy $$2x = ((dek)$$1x.b()).a($$0, this.z.F_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cyy.k);
      });
   }

   @Override
   public boolean a(cyy $$0, cwn $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cyy $$0) {
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
