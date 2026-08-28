import javax.annotation.Nullable;

public class eri {
   private final ddp a;
   @Nullable
   private final erh b;
   private final je c;
   private final je.a d = new je.a();

   public eri(ddp $$0, bum $$1) {
      this.a = $$0;
      if ($$1.dS() instanceof arh $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.ds();
   }

   public erg a(int $$0, int $$1, int $$2) {
      je $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? erl.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public duo a(je $$0) {
      return this.a.a_($$0);
   }

   public ddp a() {
      return this.a;
   }

   public je b() {
      return this.c;
   }
}
