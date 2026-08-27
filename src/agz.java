public class agz implements ze<agd> {
   public static final yv<vx, agz> a = ze.a(agz::a, agz::new);
   private final io b;
   private final int c;
   private final boolean d;

   public agz(io $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agz(vx $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zg<agz> a() {
      return agb.by;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public io b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
