import javax.annotation.Nullable;

public class enn {
   private final dah a;
   @Nullable
   private final enm b;
   private final io c;
   private final io.a d = new io.a();

   public enn(dah $$0, bsq $$1) {
      this.a = $$0;
      if ($$1.dP() instanceof aqm $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dp();
   }

   public enl a(int $$0, int $$1, int $$2) {
      io $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? enq.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public drb a(io $$0) {
      return this.a.a_($$0);
   }

   public dah a() {
      return this.a;
   }

   public io b() {
      return this.c;
   }
}
