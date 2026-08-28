import java.util.List;
import java.util.Optional;

public class cxc extends cwg {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final djh z;
   private final dek A;
   private final dek B;
   private final dek C;
   private final cvw D = cvw.a();

   public cxc(int $$0, cri $$1) {
      this($$0, $$1, cvp.a);
   }

   public cxc(int $$0, cri $$1, cvp $$2) {
      this($$0, $$1, $$2, $$1.h.dU());
   }

   private cxc(int $$0, cri $$1, cvp $$2, djh $$3) {
      super(cwl.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(dek.b);
      this.B = $$3.Q().a(dek.c);
      this.C = $$3.Q().a(dek.d);
      this.a(this.D).a(0);
   }

   private static cwh a(dec $$0) {
      dek $$1 = $$0.a(dek.b);
      dek $$2 = $$0.a(dek.c);
      dek $$3 = $$0.a(dek.d);
      return cwh.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(eao $$0) {
      return $$0.a(dmo.oH);
   }

   @Override
   protected void a(crj $$0, czk $$1) {
      $$1.a($$0.dU(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<czk> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dex p() {
      return new dex(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      czk $$1 = this.s.a($$0);
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
      dex $$0 = this.p();
      Optional<deg<dew>> $$2;
      if (this.z instanceof arq $$1) {
         $$2 = $$1.t().a(dem.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         czk $$2x = ((dew)$$1x.b()).a($$0, this.z.F_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, czk.k);
      });
   }

   @Override
   public boolean a(czk $$0, cwz $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(czk $$0) {
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
