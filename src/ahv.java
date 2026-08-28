public class ahv implements zf<agp> {
   public static final yw<vu, ahv> a = zf.a(ahv::a, ahv::new);
   private final iu b;
   private final ja c;
   private final ahv.a d;
   private final int e;

   public ahv(ahv.a $$0, iu $$1, ja $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahv(ahv.a $$0, iu $$1, ja $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahv(vu $$0) {
      this.d = $$0.b(ahv.a.class);
      this.b = $$0.e();
      this.c = ja.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vu $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zh<ahv> a() {
      return agn.bS;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.b;
   }

   public ja e() {
      return this.c;
   }

   public ahv.a f() {
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
