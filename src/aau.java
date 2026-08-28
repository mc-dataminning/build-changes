public record aau(iv c, String d, int e) implements aak {
   public static final yy<vw, aau> a = aak.a(aau::a, aau::new);
   public static final aak.b<aau> b = aak.a("debug/poi_added");

   private aau(vw $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.q(this.e);
   }

   @Override
   public aak.b<aau> a() {
      return b;
   }

   public iv b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
