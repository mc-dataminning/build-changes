public class adq implements wo<acp> {
   private final int a;
   private final agm b;
   private final boolean c;

   public adq(int $$0, cov<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public adq(ty $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ty $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public agm d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
