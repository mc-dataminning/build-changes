public class aht implements zd<agn> {
   public static final yu<vs, aht> a = zd.a(aht::a, aht::new);
   private final iu b;
   private final ja c;
   private final aht.a d;
   private final int e;

   public aht(aht.a $$0, iu $$1, ja $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public aht(aht.a $$0, iu $$1, ja $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aht(vs $$0) {
      this.d = $$0.b(aht.a.class);
      this.b = $$0.e();
      this.c = ja.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vs $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zf<aht> a() {
      return agl.bS;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.b;
   }

   public ja e() {
      return this.c;
   }

   public aht.a f() {
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
