import javax.annotation.Nullable;

public class czu {
   @Nullable
   private final com a;
   private final bsc b;
   private final ezj c;
   private final dfb d;
   private final cwb e;

   public czu(com $$0, bsc $$1, ezj $$2) {
      this($$0.dX(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected czu(dfb $$0, @Nullable com $$1, bsc $$2, cwb $$3, ezj $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ezj j() {
      return this.c;
   }

   public jh a() {
      return this.c.b();
   }

   public jm k() {
      return this.c.c();
   }

   public ezn l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cwb n() {
      return this.e;
   }

   @Nullable
   public com o() {
      return this.a;
   }

   public bsc p() {
      return this.b;
   }

   public dfb q() {
      return this.d;
   }

   public jm g() {
      return this.a == null ? jm.c : this.a.cP();
   }

   public boolean h() {
      return this.a != null && this.a.ga();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dN();
   }
}
