public record aix(int b, String c, int d, aiw e) implements zo<aja> {
   public static final zf<we, aix> a = zo.a(aix::a, aix::new);
   private static final int f = 255;

   @Deprecated
   public aix(int b, String c, int d, aiw e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aix(we $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aiw.a($$0.l()));
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zq<aix> a() {
      return aiy.a;
   }

   public void a(aja $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public aiw g() {
      return this.e;
   }
}
