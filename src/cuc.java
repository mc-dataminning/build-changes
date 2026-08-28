import java.util.List;
import java.util.Optional;

public class cuc extends ctg {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dgi z;
   private final dbn A;
   private final dbn B;
   private final dbn C;
   private final csw D = csw.a();

   public cuc(int $$0, cow $$1) {
      this($$0, $$1, csp.a);
   }

   public cuc(int $$0, cow $$1, csp $$2) {
      this($$0, $$1, $$2, $$1.k.dW());
   }

   private cuc(int $$0, cow $$1, csp $$2, dgi $$3) {
      super(ctl.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dbn.b);
      this.B = $$3.Q().a(dbn.c);
      this.C = $$3.Q().a(dbn.d);
      this.a(this.D).a(0);
   }

   private static cth a(dbf $$0) {
      dbn $$1 = $$0.a(dbn.b);
      dbn $$2 = $$0.a(dbn.c);
      dbn $$3 = $$0.a(dbn.d);
      return cth.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dwx $$0) {
      return $$0.a(djo.oD);
   }

   @Override
   protected void a(cox $$0, cwp $$1) {
      $$1.a($$0.dW(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cwp> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dca p() {
      return new dca(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cwp $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(bsc $$0) {
      super.a($$0);
      if (this.z instanceof arc) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dca $$0 = this.p();
      Optional<dbj<dbz>> $$2;
      if (this.z instanceof arc $$1) {
         $$2 = $$1.t().a(dbp.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cwp $$2x = ((dbz)$$1x.b()).a($$0, this.z.K_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cwp.j);
      });
   }

   @Override
   public boolean a(cwp $$0, ctz $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cwp $$0) {
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
