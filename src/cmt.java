import javax.annotation.Nullable;

public class cmt {
   @Nullable
   private final ccx a;
   private final bia b;
   private final eib c;
   private final cqz d;
   private final ckj e;

   public cmt(ccx $$0, bia $$1, eib $$2) {
      this($$0.dL(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cmt(cqz $$0, @Nullable ccx $$1, bia $$2, ckj $$3, eib $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eib j() {
      return this.c;
   }

   public ht a() {
      return this.c.a();
   }

   public hx k() {
      return this.c.b();
   }

   public eif l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public ckj n() {
      return this.e;
   }

   @Nullable
   public ccx o() {
      return this.a;
   }

   public bia p() {
      return this.b;
   }

   public cqz q() {
      return this.d;
   }

   public hx g() {
      return this.a == null ? hx.c : this.a.cD();
   }

   public boolean h() {
      return this.a != null && this.a.fI();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dB();
   }
}
