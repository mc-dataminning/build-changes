public class afa implements zp<ace> {
   public static final zg<wf, afa> a = zp.a(afa::a, afa::new);
   private final double b;
   private final double c;
   private final long d;

   public afa(dxa $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private afa(wf $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zr<afa> a() {
      return agt.at;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }
}
