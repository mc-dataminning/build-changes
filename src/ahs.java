public class ahs implements zc<agm> {
   public static final yt<vr, ahs> a = zc.a(ahs::a, ahs::new);
   private final jj b;
   private final jo c;
   private final ahs.a d;
   private final int e;

   public ahs(ahs.a $$0, jj $$1, jo $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahs(ahs.a $$0, jj $$1, jo $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahs(vr $$0) {
      this.d = $$0.b(ahs.a.class);
      this.b = $$0.e();
      this.c = jo.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vr $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public ze<ahs> a() {
      return agk.bS;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public jj b() {
      return this.b;
   }

   public jo e() {
      return this.c;
   }

   public ahs.a f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
