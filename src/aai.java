public record aai(int c, euk d, float e) implements zz {
   public static final yn<vl, aai> a = zz.a(aai::a, aai::new);
   public static final zz.b<aai> b = zz.a("debug/path");

   private aai(vl $$0) {
      this($$0.readInt(), euk.b($$0), $$0.readFloat());
   }

   private void a(vl $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public zz.b<aai> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public euk c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
