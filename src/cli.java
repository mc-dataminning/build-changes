import javax.annotation.Nullable;

public class cli {
   @Nullable
   private final cbn a;
   private final bgp b;
   private final eha c;
   private final cpm d;
   private final ciy e;

   public cli(cbn $$0, bgp $$1, eha $$2) {
      this($$0.dK(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cli(cpm $$0, @Nullable cbn $$1, bgp $$2, ciy $$3, eha $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eha j() {
      return this.c;
   }

   public gu a() {
      return this.c.a();
   }

   public ha k() {
      return this.c.b();
   }

   public ehe l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public ciy n() {
      return this.e;
   }

   @Nullable
   public cbn o() {
      return this.a;
   }

   public bgp p() {
      return this.b;
   }

   public cpm q() {
      return this.d;
   }

   public ha g() {
      return this.a == null ? ha.c : this.a.cD();
   }

   public boolean h() {
      return this.a != null && this.a.fG();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dA();
   }
}
