import javax.annotation.Nullable;

public class emk {
   private final cze a;
   @Nullable
   private final emj b;
   private final im c;
   private final im.a d = new im.a();

   public emk(cze $$0, brg $$1) {
      this.a = $$0;
      if ($$1.dN() instanceof aqe $$2) {
         this.b = $$2.H();
      } else {
         this.b = null;
      }

      this.c = $$1.dn();
   }

   public emi a(int $$0, int $$1, int $$2) {
      im $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? emn.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public dpy a(im $$0) {
      return this.a.a_($$0);
   }

   public cze a() {
      return this.a;
   }

   public im b() {
      return this.c;
   }
}
