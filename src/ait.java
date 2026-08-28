public class ait implements zp<agv> {
   public static final zg<wf, ait> a = zp.a(ait::a, ait::new);
   private final ezj b;
   private final bsc c;
   private final int d;

   public ait(bsc $$0, ezj $$1, int $$2) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
   }

   private ait(wf $$0) {
      this.c = $$0.b(bsc.class);
      this.b = $$0.v();
      this.d = $$0.l();
   }

   private void a(wf $$0) {
      $$0.a(this.c);
      $$0.a(this.b);
      $$0.c(this.d);
   }

   @Override
   public zr<ait> a() {
      return agt.cf;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public bsc b() {
      return this.c;
   }

   public ezj e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }
}
