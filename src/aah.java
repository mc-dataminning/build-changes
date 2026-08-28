public record aah(long c, ji d) implements zz {
   public static final yn<vl, aah> a = zz.a(aah::a, aah::new);
   public static final zz.b<aah> b = zz.a("debug/neighbors_update");

   private aah(vl $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zz.b<aah> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public ji c() {
      return this.d;
   }
}
