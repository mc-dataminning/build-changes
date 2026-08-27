public class adm implements wk<acl> {
   private final int a;
   private final agi b;
   private final boolean c;

   public adm(int $$0, coq<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public adm(tu $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tu $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public agi d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
