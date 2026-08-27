public class aan implements ve<wx> {
   private final he<apf> a;
   private final aph b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public aan(he<apf> $$0, aph $$1, biw $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.ah();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public aan(so $$0) {
      this.a = $$0.a(jb.c.t(), apf::b);
      this.b = $$0.b(aph.class);
      this.c = $$0.n();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(so $$0) {
      $$0.a(jb.c.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.b(this.f);
   }

   public he<apf> a() {
      return this.a;
   }

   public aph d() {
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

   public long h() {
      return this.f;
   }

   public void a(wx $$0) {
      $$0.a(this);
   }
}
