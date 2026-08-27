public class ahf implements ze<agd> {
   public static final yv<vx, ahf> a = ze.a(ahf::a, ahf::new);
   private final int b;
   private final akm c;
   private final boolean d;

   public ahf(int $$0, cxw<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahf(vx $$0) {
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
   public zg<ahf> a() {
      return agb.bH;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public akm e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
