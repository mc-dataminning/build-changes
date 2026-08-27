public class agt implements yp<afn> {
   public static final yg<vi, agt> a = yp.a(agt::a, agt::new);
   private final cok b;
   private final boolean c;
   private final boolean d;

   public agt(cok $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agt(vi $$0) {
      this.b = $$0.b(cok.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yr<agt> a() {
      return afl.bL;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public cok b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
