public record aat(int c, eyc d, float e) implements aak {
   public static final yy<vw, aat> a = aak.a(aat::a, aat::new);
   public static final aak.b<aat> b = aak.a("debug/path");

   private aat(vw $$0) {
      this($$0.readInt(), eyc.b($$0), $$0.readFloat());
   }

   private void a(vw $$0) {
      $$0.q(this.c);
      this.d.a($$0);
      $$0.a(this.e);
   }

   @Override
   public aak.b<aat> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public eyc c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
