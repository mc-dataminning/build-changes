public class ael implements xg<adk> {
   private final int a;
   private final ahh b;
   private final boolean c;

   public ael(int $$0, cqm<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public ael(uj $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(uj $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public ahh d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
