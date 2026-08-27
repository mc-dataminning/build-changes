import javax.annotation.Nullable;

public class clp {
   @Nullable
   private final cbu a;
   private final bgx b;
   private final ehj c;
   private final cpv d;
   private final cjf e;

   public clp(cbu $$0, bgx $$1, ehj $$2) {
      this($$0.dL(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected clp(cpv $$0, @Nullable cbu $$1, bgx $$2, cjf $$3, ehj $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ehj j() {
      return this.c;
   }

   public gw a() {
      return this.c.a();
   }

   public hc k() {
      return this.c.b();
   }

   public ehn l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cjf n() {
      return this.e;
   }

   @Nullable
   public cbu o() {
      return this.a;
   }

   public bgx p() {
      return this.b;
   }

   public cpv q() {
      return this.d;
   }

   public hc g() {
      return this.a == null ? hc.c : this.a.cD();
   }

   public boolean h() {
      return this.a != null && this.a.fH();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dB();
   }
}
