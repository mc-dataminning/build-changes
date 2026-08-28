import java.util.List;
import java.util.Optional;

public class cxs extends cww {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final djz z;
   private final dfa A;
   private final dfa B;
   private final dfa C;
   private final cwm D = cwm.a();

   public cxs(int $$0, cry $$1) {
      this($$0, $$1, cwf.a);
   }

   public cxs(int $$0, cry $$1, cwf $$2) {
      this($$0, $$1, $$2, $$1.h.dV());
   }

   private cxs(int $$0, cry $$1, cwf $$2, djz $$3) {
      super(cxb.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dfa.b);
      this.B = $$3.Q().a(dfa.c);
      this.C = $$3.Q().a(dfa.d);
      this.a(this.D).a(0);
   }

   private static cwx a(des $$0) {
      dfa $$1 = $$0.a(dfa.b);
      dfa $$2 = $$0.a(dfa.c);
      dfa $$3 = $$0.a(dfa.d);
      return cwx.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(ebg $$0) {
      return $$0.a(dng.oH);
   }

   @Override
   protected void a(crz $$0, daa $$1) {
      $$1.a($$0.dV(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<daa> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dfn p() {
      return new dfn(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      daa $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(bum $$0) {
      super.a($$0);
      if (this.z instanceof aru) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dfn $$0 = this.p();
      Optional<dew<dfm>> $$2;
      if (this.z instanceof aru $$1) {
         $$2 = $$1.t().a(dfc.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         daa $$2x = ((dfm)$$1x.b()).a($$0, this.z.J_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, daa.k);
      });
   }

   @Override
   public boolean a(daa $$0, cxp $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(daa $$0) {
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
