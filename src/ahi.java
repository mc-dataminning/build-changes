public class ahi implements zb<agb> {
   public static final ys<vr, ahi> a = zb.a(ahi::a, ahi::new);
   private final cqt b;
   private final boolean c;
   private final boolean d;

   public ahi(cqt $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahi(vr $$0) {
      this.b = $$0.b(cqt.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<ahi> a() {
      return afz.bN;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public cqt b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
