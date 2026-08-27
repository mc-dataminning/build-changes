public class ahg implements ze<age> {
   public static final yv<vx, ahg> a = ze.a(ahg::a, ahg::new);
   private final int b;
   private final akn c;
   private final boolean d;

   public ahg(int $$0, cxy<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahg(vx $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zg<ahg> a() {
      return agc.bI;
   }

   public void a(age $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public akn e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
