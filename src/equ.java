import javax.annotation.Nullable;

public class equ {
   private final ddb a;
   @Nullable
   private final eqt b;
   private final je c;
   private final je.a d = new je.a();

   public equ(ddb $$0, buh $$1) {
      this.a = $$0;
      if ($$1.dS() instanceof arg $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.ds();
   }

   public eqs a(int $$0, int $$1, int $$2) {
      je $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? eqx.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dua a(je $$0) {
      return this.a.a_($$0);
   }

   public ddb a() {
      return this.a;
   }

   public je b() {
      return this.c;
   }
}
