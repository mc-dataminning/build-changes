public class aif implements zd<agn> {
   public static final yu<vs, aif> a = zd.a(aif::a, aif::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final iu e;
   private final String f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private final dwy.a j;

   public aif(iu $$0, String $$1, dwy.a $$2, boolean $$3, boolean $$4, boolean $$5) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$2;
   }

   private aif(vs $$0) {
      this.e = $$0.e();
      this.f = $$0.p();
      this.j = $$0.b(dwy.a.class);
      int $$1 = $$0.readByte();
      this.g = ($$1 & 1) != 0;
      this.h = ($$1 & 2) != 0;
      this.i = ($$1 & 4) != 0;
   }

   private void a(vs $$0) {
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.j);
      int $$1 = 0;
      if (this.g) {
         $$1 |= 1;
      }

      if (this.h) {
         $$1 |= 2;
      }

      if (this.i) {
         $$1 |= 4;
      }

      $$0.l($$1);
   }

   @Override
   public zf<aif> a() {
      return agl.cd;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.e;
   }

   public String e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public boolean h() {
      return this.i;
   }

   public dwy.a i() {
      return this.j;
   }
}
