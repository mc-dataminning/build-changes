public class ahf implements yp<afn> {
   public static final yg<vi, ahf> a = yp.a(ahf::a, ahf::new);
   private static final int b = 384;
   private final id c;
   private final String[] d;
   private final boolean e;

   public ahf(id $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.c = $$0;
      this.e = $$1;
      this.d = new String[]{$$2, $$3, $$4, $$5};
   }

   private ahf(vi $$0) {
      this.c = $$0.e();
      this.e = $$0.readBoolean();
      this.d = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.d[$$1] = $$0.d(384);
      }
   }

   private void a(vi $$0) {
      $$0.a(this.c);
      $$0.a(this.e);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.d[$$1]);
      }
   }

   @Override
   public yr<ahf> a() {
      return afl.bX;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public id b() {
      return this.c;
   }

   public boolean e() {
      return this.e;
   }

   public String[] f() {
      return this.d;
   }
}
