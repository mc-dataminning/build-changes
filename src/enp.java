import javax.annotation.Nullable;

public class enp {
   private final daj a;
   @Nullable
   private final eno b;
   private final io c;
   private final io.a d = new io.a();

   public enp(daj $$0, bss $$1) {
      this.a = $$0;
      if ($$1.dP() instanceof aqn $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dp();
   }

   public enn a(int $$0, int $$1, int $$2) {
      io $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? ens.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public drd a(io $$0) {
      return this.a.a_($$0);
   }

   public daj a() {
      return this.a;
   }

   public io b() {
      return this.c;
   }
}
