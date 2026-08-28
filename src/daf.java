import javax.annotation.Nullable;

public class daf {
   @Nullable
   private final cou a;
   private final bsj b;
   private final ezu c;
   private final dfm d;
   private final cwm e;

   public daf(cou $$0, bsj $$1, ezu $$2) {
      this($$0.dV(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected daf(dfm $$0, @Nullable cou $$1, bsj $$2, cwm $$3, ezu $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ezu j() {
      return this.c;
   }

   public jh a() {
      return this.c.b();
   }

   public jm k() {
      return this.c.c();
   }

   public ezy l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cwm n() {
      return this.e;
   }

   @Nullable
   public cou o() {
      return this.a;
   }

   public bsj p() {
      return this.b;
   }

   public dfm q() {
      return this.d;
   }

   public jm g() {
      return this.a == null ? jm.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fW();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dL();
   }
}
