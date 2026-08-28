public class aid implements zw<agw> {
   public static final zn<wm, aid> a = zw.a(aid::a, aid::new);
   private final crj b;
   private final boolean c;
   private final boolean d;

   public aid(crj $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aid(wm $$0) {
      this.b = $$0.b(crj.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<aid> a() {
      return agu.bN;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public crj b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
