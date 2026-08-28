import java.util.List;
import java.util.Optional;

public class cxq extends cwu {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final djx z;
   private final dey A;
   private final dey B;
   private final dey C;
   private final cwk D = cwk.a();

   public cxq(int $$0, crw $$1) {
      this($$0, $$1, cwd.a);
   }

   public cxq(int $$0, crw $$1, cwd $$2) {
      this($$0, $$1, $$2, $$1.h.dV());
   }

   private cxq(int $$0, crw $$1, cwd $$2, djx $$3) {
      super(cwz.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dey.b);
      this.B = $$3.Q().a(dey.c);
      this.C = $$3.Q().a(dey.d);
      this.a(this.D).a(0);
   }

   private static cwv a(deq $$0) {
      dey $$1 = $$0.a(dey.b);
      dey $$2 = $$0.a(dey.c);
      dey $$3 = $$0.a(dey.d);
      return cwv.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(ebe $$0) {
      return $$0.a(dne.oH);
   }

   @Override
   protected void a(crx $$0, czy $$1) {
      $$1.a($$0.dV(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<czy> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dfl p() {
      return new dfl(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      czy $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(buk $$0) {
      super.a($$0);
      if (this.z instanceof ars) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dfl $$0 = this.p();
      Optional<deu<dfk>> $$2;
      if (this.z instanceof ars $$1) {
         $$2 = $$1.t().a(dfa.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         czy $$2x = ((dfk)$$1x.b()).a($$0, this.z.J_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, czy.k);
      });
   }

   @Override
   public boolean a(czy $$0, cxn $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(czy $$0) {
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
