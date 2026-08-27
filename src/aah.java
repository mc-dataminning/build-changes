public class aah implements uo<zb> {
   private final ccq a;
   private final boolean b;
   private final boolean c;

   public aah(ccq $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aah(sf $$0) {
      this.a = $$0.b(ccq.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.writeBoolean(this.b);
      $$0.writeBoolean(this.c);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public ccq a() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
