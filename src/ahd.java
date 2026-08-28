public class ahd implements zb<agb> {
   public static final ys<vr, ahd> a = zb.a(ahd::a, ahd::new);
   private final int b;
   private final akk c;
   private final boolean d;

   public ahd(int $$0, cyk<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahd(vr $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<ahd> a() {
      return afz.bI;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public akk e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
