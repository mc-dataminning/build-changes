public class aff implements zc<abr> {
   public static final yt<vr, aff> a = zc.a(aff::a, aff::new);
   private final float b;
   private final int c;
   private final float d;

   public aff(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aff(vr $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public ze<aff> a() {
      return agk.aK;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
