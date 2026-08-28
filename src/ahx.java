public class ahx implements zo<agu> {
   public static final zf<we, ahx> a = zo.a(ahx::a, ahx::new);
   private final int b;
   private final alh c;
   private final boolean d;

   public ahx(int $$0, dal<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahx(we $$0) {
      this.b = $$0.x();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.f(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq<ahx> a() {
      return ags.bL;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public alh e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
