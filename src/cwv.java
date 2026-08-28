import java.util.List;
import java.util.Optional;

public class cwv extends cvz {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dja z;
   private final ded A;
   private final ded B;
   private final ded C;
   private final cvp D = cvp.a();

   public cwv(int $$0, crb $$1) {
      this($$0, $$1, cvi.a);
   }

   public cwv(int $$0, crb $$1, cvi $$2) {
      this($$0, $$1, $$2, $$1.h.dV());
   }

   private cwv(int $$0, crb $$1, cvi $$2, dja $$3) {
      super(cwe.v, $$0, $$1, $$2, a($$3.Q()));
      this.z = $$3;
      this.A = $$3.Q().a(ded.b);
      this.B = $$3.Q().a(ded.c);
      this.C = $$3.Q().a(ded.d);
      this.a(this.D).a(0);
   }

   private static cwa a(ddv $$0) {
      ded $$1 = $$0.a(ded.b);
      ded $$2 = $$0.a(ded.c);
      ded $$3 = $$0.a(ded.d);
      return cwa.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(eah $$0) {
      return $$0.a(dmh.oH);
   }

   @Override
   protected void a(crc $$0, czd $$1) {
      $$1.a($$0.dV(), $$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<czd> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private deq p() {
      return new deq(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      czd $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(btw $$0) {
      super.a($$0);
      if (this.z instanceof arq) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      deq $$0 = this.p();
      Optional<ddz<dep>> $$2;
      if (this.z instanceof arq $$1) {
         $$2 = $$1.t().a(def.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         czd $$2x = ((dep)$$1x.b()).a($$0, this.z.F_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, czd.k);
      });
   }

   @Override
   public boolean a(czd $$0, cws $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean c(czd $$0) {
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
