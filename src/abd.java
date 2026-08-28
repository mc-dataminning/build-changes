public record abd(int c, eue d, float e) implements aau {
   public static final zi<wh, abd> a = aau.a(abd::a, abd::new);
   public static final aau.b<abd> b = aau.a("debug/path");

   private abd(wh $$0) {
      this($$0.readInt(), eue.b($$0), $$0.readFloat());
   }

   private void a(wh $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aau.b<abd> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public eue c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
