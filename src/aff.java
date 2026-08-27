public class aff implements zb<abm> {
   public static final ys<wf, aff> a = zb.a(aff::a, aff::new);
   private final iw<avb> b;
   private final avd c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public aff(iw<avb> $$0, avd $$1, brh $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.aj();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private aff(wf $$0) {
      this.b = avb.d.decode($$0);
      this.c = $$0.b(avd.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wf $$0) {
      avb.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zd<aff> a() {
      return afx.aR;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public iw<avb> b() {
      return this.b;
   }

   public avd e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public long i() {
      return this.g;
   }
}
