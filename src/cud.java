import java.util.List;
import java.util.Optional;

public class cud extends cth {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dgj z;
   private final dbo A;
   private final dbo B;
   private final dbo C;
   private final csx D = csx.a();

   public cud(int $$0, cox $$1) {
      this($$0, $$1, csq.a);
   }

   public cud(int $$0, cox $$1, csq $$2) {
      this($$0, $$1, $$2, $$1.k.dV());
   }

   private cud(int $$0, cox $$1, csq $$2, dgj $$3) {
      super(ctm.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dbo.b);
      this.B = $$3.Q().a(dbo.c);
      this.C = $$3.Q().a(dbo.d);
      this.a(this.D).a(0);
   }

   private static cti a(dbg $$0) {
      dbo $$1 = $$0.a(dbo.b);
      dbo $$2 = $$0.a(dbo.c);
      dbo $$3 = $$0.a(dbo.d);
      return cti.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dwy $$0) {
      return $$0.a(djp.oD);
   }

   @Override
   protected void a(coy $$0, cwq $$1) {
      $$1.a($$0.dV(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cwq> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dcb p() {
      return new dcb(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cwq $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(bse $$0) {
      super.a($$0);
      if (this.z instanceof ard) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dcb $$0 = this.p();
      Optional<dbk<dca>> $$2;
      if (this.z instanceof ard $$1) {
         $$2 = $$1.t().a(dbq.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cwq $$2x = ((dca)$$1x.b()).a($$0, this.z.K_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cwq.j);
      });
   }

   @Override
   public boolean a(cwq $$0, cua $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cwq $$0) {
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
