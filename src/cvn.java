import javax.annotation.Nullable;

public class cvn {
   @Nullable
   private final ckl a;
   private final bop b;
   private final etb c;
   private final czu d;
   private final csd e;

   public cvn(ckl $$0, bop $$1, etb $$2) {
      this($$0.dN(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cvn(czu $$0, @Nullable ckl $$1, bop $$2, csd $$3, etb $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final etb j() {
      return this.c;
   }

   public im a() {
      return this.c.a();
   }

   public ir k() {
      return this.c.b();
   }

   public etf l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public csd n() {
      return this.e;
   }

   @Nullable
   public ckl o() {
      return this.a;
   }

   public bop p() {
      return this.b;
   }

   public czu q() {
      return this.d;
   }

   public ir g() {
      return this.a == null ? ir.c : this.a.cF();
   }

   public boolean h() {
      return this.a != null && this.a.fP();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dD();
   }
}
