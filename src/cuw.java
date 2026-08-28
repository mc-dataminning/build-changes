import java.util.List;
import java.util.Optional;

public class cuw extends cua {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dgz z;
   private final dce A;
   private final dce B;
   private final dce C;
   private final ctq D = ctq.a();

   public cuw(int $$0, cpq $$1) {
      this($$0, $$1, ctj.a);
   }

   public cuw(int $$0, cpq $$1, ctj $$2) {
      this($$0, $$1, $$2, $$1.k.dU());
   }

   private cuw(int $$0, cpq $$1, ctj $$2, dgz $$3) {
      super(cuf.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dce.b);
      this.B = $$3.Q().a(dce.c);
      this.C = $$3.Q().a(dce.d);
      this.a(this.D).a(0);
   }

   private static cub a(dbw $$0) {
      dce $$1 = $$0.a(dce.b);
      dce $$2 = $$0.a(dce.c);
      dce $$3 = $$0.a(dce.d);
      return cub.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dxq $$0) {
      return $$0.a(dkg.oD);
   }

   @Override
   protected void a(cpr $$0, cxh $$1) {
      $$1.a($$0.dU(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cxh> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dcr p() {
      return new dcr(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cxh $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(bsr $$0) {
      super.a($$0);
      if (this.z instanceof ard) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dcr $$0 = this.p();
      Optional<dca<dcq>> $$2;
      if (this.z instanceof ard $$1) {
         $$2 = $$1.t().a(dcg.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cxh $$2x = ((dcq)$$1x.b()).a($$0, this.z.F_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cxh.k);
      });
   }

   @Override
   public boolean a(cxh $$0, cut $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cxh $$0) {
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
