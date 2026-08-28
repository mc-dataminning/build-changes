import javax.annotation.Nullable;

public class ddf {
   @Nullable
   private final crj a;
   private final buf b;
   private final fet c;
   private final djh d;
   private final czk e;

   public ddf(crj $$0, buf $$1, fet $$2) {
      this($$0.dU(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected ddf(djh $$0, @Nullable crj $$1, buf $$2, czk $$3, fet $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fet j() {
      return this.c;
   }

   public iv a() {
      return this.c.b();
   }

   public jb k() {
      return this.c.c();
   }

   public fex l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public czk n() {
      return this.e;
   }

   @Nullable
   public crj o() {
      return this.a;
   }

   public buf p() {
      return this.b;
   }

   public djh q() {
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
