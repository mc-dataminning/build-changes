import javax.annotation.Nullable;

public class cwk {
   @Nullable
   private final clh a;
   private final bpl b;
   private final etl c;
   private final dad d;
   private final csz e;

   public cwk(clh $$0, bpl $$1, etl $$2) {
      this($$0.dN(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cwk(dad $$0, @Nullable clh $$1, bpl $$2, csz $$3, etl $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final etl j() {
      return this.c;
   }

   public in a() {
      return this.c.a();
   }

   public is k() {
      return this.c.b();
   }

   public etp l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public csz n() {
      return this.e;
   }

   @Nullable
   public clh o() {
      return this.a;
   }

   public bpl p() {
      return this.b;
   }

   public dad q() {
      return this.d;
   }

   public is g() {
      return this.a == null ? is.c : this.a.cF();
   }

   public boolean h() {
      return this.a != null && this.a.fP();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dD();
   }
}
