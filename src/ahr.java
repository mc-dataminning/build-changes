public class ahr implements zl<agl> {
   public static final zc<we, ahr> a = zl.a(ahr::a, ahr::new);
   private final cqx b;
   private final boolean c;
   private final boolean d;

   public ahr(cqx $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahr(we $$0) {
      this.b = $$0.b(cqx.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<ahr> a() {
      return agj.bN;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public cqx b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
