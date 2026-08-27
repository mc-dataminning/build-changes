import javax.annotation.Nullable;

public class clv {
   @Nullable
   private final cca a;
   private final bhd b;
   private final ehd c;
   private final cqb d;
   private final cjl e;

   public clv(cca $$0, bhd $$1, ehd $$2) {
      this($$0.dL(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected clv(cqb $$0, @Nullable cca $$1, bhd $$2, cjl $$3, ehd $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ehd j() {
      return this.c;
   }

   public gw a() {
      return this.c.a();
   }

   public ha k() {
      return this.c.b();
   }

   public ehh l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cjl n() {
      return this.e;
   }

   @Nullable
   public cca o() {
      return this.a;
   }

   public bhd p() {
      return this.b;
   }

   public cqb q() {
      return this.d;
   }

   public ha g() {
      return this.a == null ? ha.c : this.a.cD();
   }

   public boolean h() {
      return this.a != null && this.a.fI();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dB();
   }
}
