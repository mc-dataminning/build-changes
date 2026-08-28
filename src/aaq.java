public record aaq(ji c, float d, float e, float f, float g, float h) implements zz {
   public static final yn<vl, aaq> a = zz.a(aaq::a, aaq::new);
   public static final zz.b<aaq> b = zz.a("debug/worldgen_attempt");

   private aaq(vl $$0) {
      this($$0.e(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
   }

   @Override
   public zz.b<aaq> a() {
      return b;
   }

   public ji b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }
}
