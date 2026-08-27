import javax.annotation.Nullable;

public class clh {
   @Nullable
   private final cbm a;
   private final bgp b;
   private final egz c;
   private final cpl d;
   private final cix e;

   public clh(cbm $$0, bgp $$1, egz $$2) {
      this($$0.dK(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected clh(cpl $$0, @Nullable cbm $$1, bgp $$2, cix $$3, egz $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final egz j() {
      return this.c;
   }

   public gu a() {
      return this.c.a();
   }

   public ha k() {
      return this.c.b();
   }

   public ehd l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cix n() {
      return this.e;
   }

   @Nullable
   public cbm o() {
      return this.a;
   }

   public bgp p() {
      return this.b;
   }

   public cpl q() {
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
