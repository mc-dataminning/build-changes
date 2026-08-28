public class aiu implements zp<agv> {
   public static final zg<wf, aiu> a = zp.a(aiu::a, aiu::new);
   private final bsc b;
   private final int c;
   private final float d;
   private final float e;

   public aiu(bsc $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aiu(wf $$0) {
      this.b = $$0.b(bsc.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zr<aiu> a() {
      return agt.cg;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public bsc b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }
}
