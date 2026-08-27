public record ahl(int b, String c, int d, ahk e) implements yn<aho> {
   public static final ye<vg, ahl> a = yn.a(ahl::a, ahl::new);
   private static final int f = 255;

   @Deprecated
   public ahl(int b, String c, int d, ahk e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ahl(vg $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ahk.a($$0.l()));
   }

   private void a(vg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public yp<ahl> a() {
      return ahm.a;
   }

   public void a(aho $$0) {
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

   public ahk g() {
      return this.e;
   }
}
