import javax.annotation.Nullable;

public class csw {
   @Nullable
   private final ciu a;
   private final bnc b;
   private final epp c;
   private final cxb d;
   private final cqm e;

   public csw(ciu $$0, bnc $$1, epp $$2) {
      this($$0.dM(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected csw(cxb $$0, @Nullable ciu $$1, bnc $$2, cqm $$3, epp $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final epp j() {
      return this.c;
   }

   public ib a() {
      return this.c.a();
   }

   public ih k() {
      return this.c.b();
   }

   public ept l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cqm n() {
      return this.e;
   }

   @Nullable
   public ciu o() {
      return this.a;
   }

   public bnc p() {
      return this.b;
   }

   public cxb q() {
      return this.d;
   }

   public ih g() {
      return this.a == null ? ih.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fO();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dC();
   }
}
