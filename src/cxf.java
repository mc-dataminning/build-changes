import java.util.List;
import java.util.Optional;

public class cxf extends cwj {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final djm z;
   private final den A;
   private final den B;
   private final den C;
   private final cvz D = cvz.a();

   public cxf(int $$0, crl $$1) {
      this($$0, $$1, cvs.a);
   }

   public cxf(int $$0, crl $$1, cvs $$2) {
      this($$0, $$1, $$2, $$1.h.dU());
   }

   private cxf(int $$0, crl $$1, cvs $$2, djm $$3) {
      super(cwo.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(den.b);
      this.B = $$3.Q().a(den.c);
      this.C = $$3.Q().a(den.d);
      this.a(this.D).a(0);
   }

   private static cwk a(def $$0) {
      den $$1 = $$0.a(den.b);
      den $$2 = $$0.a(den.c);
      den $$3 = $$0.a(den.d);
      return cwk.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(eat $$0) {
      return $$0.a(dmt.oH);
   }

   @Override
   protected void a(crm $$0, czn $$1) {
      $$1.a($$0.dU(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<czn> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dfa p() {
      return new dfa(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      czn $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(btz $$0) {
      super.a($$0);
      if (this.z instanceof arq) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dfa $$0 = this.p();
      Optional<dej<dez>> $$2;
      if (this.z instanceof arq $$1) {
         $$2 = $$1.t().a(dep.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         czn $$2x = ((dez)$$1x.b()).a($$0, this.z.F_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, czn.k);
      });
   }

   @Override
   public boolean a(czn $$0, cxc $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(czn $$0) {
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
