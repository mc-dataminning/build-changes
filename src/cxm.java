import javax.annotation.Nullable;

public class cxm {
   @Nullable
   private final cmh a;
   private final bqc b;
   private final evv c;
   private final dcd d;
   private final cua e;

   public cxm(cmh $$0, bqc $$1, evv $$2) {
      this($$0.dP(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cxm(dcd $$0, @Nullable cmh $$1, bqc $$2, cua $$3, evv $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final evv j() {
      return this.c;
   }

   public ja a() {
      return this.c.a();
   }

   public jf k() {
      return this.c.b();
   }

   public evz l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public cua n() {
      return this.e;
   }

   @Nullable
   public cmh o() {
      return this.a;
   }

   public bqc p() {
      return this.b;
   }

   public dcd q() {
      return this.d;
   }

   public jf g() {
      return this.a == null ? jf.c : this.a.cH();
   }

   public boolean h() {
      return this.a != null && this.a.fN();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dF();
   }
}
