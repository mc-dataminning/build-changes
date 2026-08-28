public class ahr implements zo<agu> {
   public static final zf<we, ahr> a = zo.a(ahr::a, ahr::new);
   private final jg b;
   private final int c;
   private final boolean d;

   public ahr(jg $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahr(we $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq<ahr> a() {
      return ags.bC;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public jg b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
