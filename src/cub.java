import java.util.List;
import java.util.Optional;

public class cub extends ctf {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dgh z;
   private final dbm A;
   private final dbm B;
   private final dbm C;
   private final csv D = csv.a();

   public cub(int $$0, cov $$1) {
      this($$0, $$1, cso.a);
   }

   public cub(int $$0, cov $$1, cso $$2) {
      this($$0, $$1, $$2, $$1.k.dV());
   }

   private cub(int $$0, cov $$1, cso $$2, dgh $$3) {
      super(ctk.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dbm.b);
      this.B = $$3.Q().a(dbm.c);
      this.C = $$3.Q().a(dbm.d);
      this.a(this.D).a(0);
   }

   private static ctg a(dbe $$0) {
      dbm $$1 = $$0.a(dbm.b);
      dbm $$2 = $$0.a(dbm.c);
      dbm $$3 = $$0.a(dbm.d);
      return ctg.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(dww $$0) {
      return $$0.a(djn.oD);
   }

   @Override
   protected void a(cow $$0, cwo $$1) {
      $$1.a($$0.dV(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<cwo> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dbz p() {
      return new dbz(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      cwo $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(bsc $$0) {
      super.a($$0);
      if (this.z instanceof ard) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dbz $$0 = this.p();
      Optional<dbi<dby>> $$2;
      if (this.z instanceof ard $$1) {
         $$2 = $$1.t().a(dbo.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         cwo $$2x = ((dby)$$1x.b()).a($$0, this.z.K_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, cwo.j);
      });
   }

   @Override
   public boolean a(cwo $$0, cty $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(cwo $$0) {
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
