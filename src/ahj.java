public class ahj implements zf<agh> {
   public static final yw<vv, ahj> a = zf.a(ahj::a, ahj::new);
   private final int b;
   private final akq c;
   private final boolean d;

   public ahj(int $$0, cyz<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahj(vv $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(vv $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zh<ahj> a() {
      return agf.bI;
   }

   public void a(agh $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public akq e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
