import java.util.List;
import java.util.Optional;

public class cua extends cte {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dgg z;
   private final dbl A;
   private final dbl B;
   private final dbl C;
   private final csu D = csu.a();

   public cua(int $$0, cou $$1) {
      this($$0, $$1, csn.a);
   }

   public cua(int $$0, cou $$1, csn $$2) {
      this($$0, $$1, $$2, $$1.k.dW());
   }

   private cua(int $$0, cou $$1, csn $$2, dgg $$3) {
      super(ctj.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dbl.b);
      this.B = $$3.Q().a(dbl.c);
      this.C = $$3.Q().a(dbl.d);
      this.a(this.D).a(0);
   }

   private static ctf a(dbd $$0) {
      dbl $$1 = $$0.a(dbl.b);
      dbl $$2 = $$0.a(dbl.c);
      dbl $$3 = $$0.a(dbl.d);
      return ctf.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dwv $$0) {
      return $$0.a(djm.oD);
   }

   @Override
   protected void a(cov $$0, cwn $$1) {
      $$1.a($$0.dW(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cwn> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dby p() {
      return new dby(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cwn $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(bsb $$0) {
      super.a($$0);
      if (this.z instanceof arc) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dby $$0 = this.p();
      Optional<dbh<dbx>> $$2;
      if (this.z instanceof arc $$1) {
         $$2 = $$1.t().a(dbn.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cwn $$2x = ((dbx)$$1x.b()).a($$0, this.z.K_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cwn.j);
      });
   }

   @Override
   public boolean a(cwn $$0, ctx $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cwn $$0) {
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
