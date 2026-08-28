public class adh implements zf<abu> {
   public static final yw<vu, adh> a = zf.a(adh::a, adh::new);
   private final int b;
   private final iu c;
   private final int d;
   private final boolean e;

   public adh(int $$0, iu $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private adh(vu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
   }

   @Override
   public zh<adh> a() {
      return agn.L;
   }

   public void a(abu $$0) {
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

   public iu g() {
      return this.c;
   }
}
