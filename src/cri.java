import javax.annotation.Nullable;

public class cri {
   @Nullable
   private final chh a;
   private final blt b;
   private final eno c;
   private final cvn d;
   private final coz e;

   public cri(chh $$0, blt $$1, eno $$2) {
      this($$0.dM(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cri(cvn $$0, @Nullable chh $$1, blt $$2, coz $$3, eno $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eno j() {
      return this.c;
   }

   public hz a() {
      return this.c.a();
   }

   public ie k() {
      return this.c.b();
   }

   public ens l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public coz n() {
      return this.e;
   }

   @Nullable
   public chh o() {
      return this.a;
   }

   public blt p() {
      return this.b;
   }

   public cvn q() {
      return this.d;
   }

   public ie g() {
      return this.a == null ? ie.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fI();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dC();
   }
}
