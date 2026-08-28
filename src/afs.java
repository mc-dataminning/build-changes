public class afs implements zd<abs> {
   public static final yu<wh, afs> a = zd.a(afs::a, afs::new);
   private final je<awk> b;
   private final awm c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afs(je<awk> $$0, awm $$1, bwa $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ar();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afs(wh $$0) {
      this.b = awk.d.decode($$0);
      this.c = $$0.b(awm.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wh $$0) {
      awk.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zf<afs> a() {
      return agl.aV;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public je<awk> b() {
      return this.b;
   }

   public awm e() {
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
