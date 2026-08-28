import javax.annotation.Nullable;

public class czy {
   @Nullable
   private final cor a;
   private final bsg b;
   private final ezn c;
   private final dff d;
   private final cwf e;

   public czy(cor $$0, bsg $$1, ezn $$2) {
      this($$0.dY(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected czy(dff $$0, @Nullable cor $$1, bsg $$2, cwf $$3, ezn $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ezn j() {
      return this.c;
   }

   public jh a() {
      return this.c.b();
   }

   public jm k() {
      return this.c.c();
   }

   public ezr l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cwf n() {
      return this.e;
   }

   @Nullable
   public cor o() {
      return this.a;
   }

   public bsg p() {
      return this.b;
   }

   public dff q() {
      return this.d;
   }

   public jm g() {
      return this.a == null ? jm.c : this.a.cQ();
   }

   public boolean h() {
      return this.a != null && this.a.gb();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dO();
   }
}
