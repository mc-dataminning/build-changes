public class afj implements ze<abq> {
   public static final yv<wi, afj> a = ze.a(afj::a, afj::new);
   private final ix<avg> b;
   private final avi c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afj(ix<avg> $$0, avi $$1, bru $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.al();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afj(wi $$0) {
      this.b = avg.d.decode($$0);
      this.c = $$0.b(avi.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wi $$0) {
      avg.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zg<afj> a() {
      return agb.aR;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public ix<avg> b() {
      return this.b;
   }

   public avi e() {
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
