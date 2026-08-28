import javax.annotation.Nullable;

public class ddv {
   @Nullable
   private final crz a;
   private final bus b;
   private final ffo c;
   private final djz d;
   private final daa e;

   public ddv(crz $$0, bus $$1, ffo $$2) {
      this($$0.dV(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected ddv(djz $$0, @Nullable crz $$1, bus $$2, daa $$3, ffo $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ffo j() {
      return this.c;
   }

   public iw a() {
      return this.c.b();
   }

   public jc k() {
      return this.c.c();
   }

   public ffs l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public daa n() {
      return this.e;
   }

   @Nullable
   public crz o() {
      return this.a;
   }

   public bus p() {
      return this.b;
   }

   public djz q() {
      return this.d;
   }

   public jc g() {
      return this.a == null ? jc.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fY();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dL();
   }
}
