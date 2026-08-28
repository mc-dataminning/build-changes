public record aaj(ji c, String d, int e) implements zz {
   public static final yn<vl, aaj> a = zz.a(aaj::a, aaj::new);
   public static final zz.b<aaj> b = zz.a("debug/poi_added");

   private aaj(vl $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public zz.b<aaj> a() {
      return b;
   }

   public ji b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
