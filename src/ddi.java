import javax.annotation.Nullable;

public class ddi {
   @Nullable
   private final crm a;
   private final buf b;
   private final fey c;
   private final djm d;
   private final czn e;

   public ddi(crm $$0, buf $$1, fey $$2) {
      this($$0.dU(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected ddi(djm $$0, @Nullable crm $$1, buf $$2, czn $$3, fey $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fey j() {
      return this.c;
   }

   public iv a() {
      return this.c.b();
   }

   public jb k() {
      return this.c.c();
   }

   public ffc l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public czn n() {
      return this.e;
   }

   @Nullable
   public crm o() {
      return this.a;
   }

   public buf p() {
      return this.b;
   }

   public djm q() {
      return this.d;
   }

   public jb g() {
      return this.a == null ? jb.c : this.a.cN();
   }

   public boolean h() {
      return this.a != null && this.a.fX();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dK();
   }
}
