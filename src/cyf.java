import javax.annotation.Nullable;

public class cyf {
   @Nullable
   private final cly a;
   private final bpz b;
   private final ewq c;
   private final dca d;
   private final cuh e;

   public cyf(cly $$0, bpz $$1, ewq $$2) {
      this($$0.dU(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cyf(dca $$0, @Nullable cly $$1, bpz $$2, cuh $$3, ewq $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ewq j() {
      return this.c;
   }

   public ir a() {
      return this.c.a();
   }

   public iw k() {
      return this.c.b();
   }

   public ewu l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cuh n() {
      return this.e;
   }

   @Nullable
   public cly o() {
      return this.a;
   }

   public bpz p() {
      return this.b;
   }

   public dca q() {
      return this.d;
   }

   public iw g() {
      return this.a == null ? iw.c : this.a.cM();
   }

   public boolean h() {
      return this.a != null && this.a.ga();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dK();
   }
}
