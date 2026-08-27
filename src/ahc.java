public class ahc implements yp<afn> {
   public static final yg<vt, ahc> a = yp.a(ahc::a, ahc::new);
   private final int b;
   private final crs c;

   public ahc(int $$0, crs $$1) {
      this.b = $$0;
      this.c = $$1.r();
   }

   private ahc(vt $$0) {
      this.b = $$0.readShort();
      this.c = crs.e.decode($$0);
   }

   private void a(vt $$0) {
      $$0.l(this.b);
      crs.e.encode($$0, this.c);
   }

   @Override
   public yr<ahc> a() {
      return afl.bU;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public crs e() {
      return this.c;
   }
}
