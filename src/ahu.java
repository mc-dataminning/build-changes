public class ahu implements zd<agn> {
   public static final yu<vs, ahu> a = zd.a(ahu::a, ahu::new);
   private final int b;
   private final ahu.a c;
   private final int d;

   public ahu(bwa $$0, ahu.a $$1) {
      this($$0, $$1, 0);
   }

   public ahu(bwa $$0, ahu.a $$1, int $$2) {
      this.b = $$0.ar();
      this.c = $$1;
      this.d = $$2;
   }

   private ahu(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.b(ahu.a.class);
      this.d = $$0.l();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.c(this.d);
   }

   @Override
   public zf<ahu> a() {
      return agl.bT;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ahu.a e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h,
      i;
   }
}
