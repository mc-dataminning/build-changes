public class acy implements yw<abl> {
   public static final yn<vl, acy> a = yw.a(acy::a, acy::new);
   private final int b;
   private final ji c;
   private final int d;
   private final boolean e;

   public acy(int $$0, ji $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private acy(vl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
   }

   @Override
   public yy<acy> a() {
      return agd.K;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.e;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }

   public ji g() {
      return this.c;
   }
}
