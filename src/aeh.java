public class aeh implements xd<adg> {
   private final int a;
   private final ahd b;
   private final boolean c;

   public aeh(int $$0, cpx<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public aeh(ug $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ug $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public ahd d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
