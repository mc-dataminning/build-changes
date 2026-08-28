public class adq implements zo<acd> {
   public static final zf<we, adq> a = zo.a(adq::a, adq::new);
   private final int b;
   private final jg c;
   private final int d;
   private final boolean e;

   public adq(int $$0, jg $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private adq(we $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
   }

   @Override
   public zq<adq> a() {
      return ags.L;
   }

   public void a(acd $$0) {
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

   public jg g() {
      return this.c;
   }
}
