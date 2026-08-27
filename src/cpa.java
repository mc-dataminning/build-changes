import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpa implements dbg, dbk {
   protected final dca a;
   protected final coz b;
   private cpb d = new cpb(0, 0, 0);
   protected ja<dcz> c;
   private ewp e = new ewp(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

   public cpa(dca $$0, coz $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$0.I_().d(li.az).g(ddg.b);
      this.a($$1.dz(), $$1.dB(), $$1.dF());
   }

   public void a(double $$0, double $$1, double $$2) {
      this.e = new ewp($$0, $$1, $$2, $$0 + (double)this.d.a() + 1.0, $$1 + (double)this.d.b() + 1.0, $$2 + (double)this.d.c() + 1.0);
   }

   public void a(cpb $$0) {
      this.d = $$0;
      this.a(this.b.dz(), this.b.dB(), this.b.dF());
   }

   public void a(ja<dcz> $$0) {
      this.c = $$0;
   }

   public dca a() {
      return this.a;
   }

   @Override
   public dtc a_(ir $$0) {
      return this.d.b($$0);
   }

   @Override
   public epe b_(ir $$0) {
      return this.a_($$0).u();
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Nullable
   @Override
   public dqc c_(ir $$0) {
      return null;
   }

   @Override
   public int K_() {
      return this.d.b();
   }

   @Override
   public int J_() {
      return 0;
   }

   public UUID c() {
      return this.b.cE();
   }

   public coz d() {
      return this.b;
   }

   public cpb e() {
      return this.d;
   }

   public ja<dcz> g() {
      return this.c;
   }

   public ewp h() {
      return this.e;
   }

   public ewp i() {
      ewu $$0 = this.j();
      return this.e.d(-$$0.c, -$$0.d, -$$0.e);
   }

   @Override
   public dut D_() {
      return this.a.D_();
   }

   @Nullable
   @Override
   public dbg a(int $$0, int $$1) {
      return this;
   }

   @Override
   public List<exn> a(@Nullable brv $$0, ewp $$1) {
      return List.of();
   }

   public ewu j() {
      return new ewu(this.b.dz() - this.b.ae, this.b.dB() - this.b.af, this.b.dF() - this.b.ag);
   }
}
