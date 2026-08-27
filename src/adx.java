public class adx implements wu<acw> {
   private final int a;
   private final agt b;
   private final boolean c;

   public adx(int $$0, cpn<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public adx(ue $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ue $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public agt d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
