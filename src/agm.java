public class agm implements yp<afn> {
   public static final yg<vi, agm> a = yp.a(agm::a, agm::new);
   private final boolean b;
   private final boolean c;

   public agm(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agm(vi $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   @Override
   public yr<agm> a() {
      return afl.bE;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
