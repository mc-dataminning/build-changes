public record abn(long c, jh d) implements abf {
   public static final zt<ws, abn> a = abf.a(abn::a, abn::new);
   public static final abf.b<abn> b = abf.a("debug/neighbors_update");

   private abn(ws $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(ws $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public abf.b<abn> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public jh c() {
      return this.d;
   }
}
