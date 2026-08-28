import javax.annotation.Nullable;

public class daz {
   @Nullable
   private final cpo a;
   private final bsz b;
   private final fbn c;
   private final dgz d;
   private final cxg e;

   public daz(cpo $$0, bsz $$1, fbn $$2) {
      this($$0.dW(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected daz(dgz $$0, @Nullable cpo $$1, bsz $$2, cxg $$3, fbn $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fbn j() {
      return this.c;
   }

   public jh a() {
      return this.c.b();
   }

   public jm k() {
      return this.c.c();
   }

   public fbr l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cxg n() {
      return this.e;
   }

   @Nullable
   public cpo o() {
      return this.a;
   }

   public bsz p() {
      return this.b;
   }

   public dgz q() {
      return this.d;
   }

   public jm g() {
      return this.a == null ? jm.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fY();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dM();
   }
}
