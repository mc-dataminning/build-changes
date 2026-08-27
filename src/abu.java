public class abu implements zb<abm> {
   public static final ys<wf, abu> a = zb.a(abu::a, abu::new);
   private final in b;
   private final int c;
   private final int d;
   private final dde e;

   public abu(in $$0, dde $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private abu(wf $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yq.a(le.f).decode($$0);
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      yq.a(le.f).encode($$0, this.e);
   }

   @Override
   public zd<abu> a() {
      return afx.j;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public in b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dde g() {
      return this.e;
   }
}
