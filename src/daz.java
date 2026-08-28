import javax.annotation.Nullable;

public class daz {
   @Nullable
   private final cpr a;
   private final bsx b;
   private final fbt c;
   private final dgz d;
   private final cxh e;

   public daz(cpr $$0, bsx $$1, fbt $$2) {
      this($$0.dU(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected daz(dgz $$0, @Nullable cpr $$1, bsx $$2, cxh $$3, fbt $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fbt j() {
      return this.c;
   }

   public ji a() {
      return this.c.b();
   }

   public jn k() {
      return this.c.c();
   }

   public fbx l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cxh n() {
      return this.e;
   }

   @Nullable
   public cpr o() {
      return this.a;
   }

   public bsx p() {
      return this.b;
   }

   public dgz q() {
      return this.d;
   }

   public jn g() {
      return this.a == null ? jn.c : this.a.cN();
   }

   public boolean h() {
      return this.a != null && this.a.ga();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dK();
   }
}
