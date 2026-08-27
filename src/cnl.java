import javax.annotation.Nullable;

public class cnl {
   @Nullable
   private final cdm a;
   private final bip b;
   private final eje c;
   private final crs d;
   private final clb e;

   public cnl(cdm $$0, bip $$1, eje $$2) {
      this($$0.dL(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cnl(crs $$0, @Nullable cdm $$1, bip $$2, clb $$3, eje $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eje j() {
      return this.c;
   }

   public ht a() {
      return this.c.a();
   }

   public hx k() {
      return this.c.b();
   }

   public eji l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public clb n() {
      return this.e;
   }

   @Nullable
   public cdm o() {
      return this.a;
   }

   public bip p() {
      return this.b;
   }

   public crs q() {
      return this.d;
   }

   public hx g() {
      return this.a == null ? hx.c : this.a.cD();
   }

   public boolean h() {
      return this.a != null && this.a.fI();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dB();
   }
}
