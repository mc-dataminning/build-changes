import javax.annotation.Nullable;

public class epx {
   private final dbk a;
   @Nullable
   private final epw b;
   private final ir c;
   private final ir.a d = new ir.a();

   public epx(dbk $$0, bsq $$1) {
      this.a = $$0;
      if ($$1.dU() instanceof aqt $$2) {
         this.b = $$2.I();
      } else {
         this.b = null;
      }

      this.c = $$1.du();
   }

   public epv a(int $$0, int $$1, int $$2) {
      ir $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eqa.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dtc a(ir $$0) {
      return this.a.a_($$0);
   }

   public dbk a() {
      return this.a;
   }

   public ir b() {
      return this.c;
   }
}
