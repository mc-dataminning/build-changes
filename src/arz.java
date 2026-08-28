public record arz(long j, boolean k, arz.a l) {
   public static final long a = 0L;
   public static final arz b = a("start", 0L, false, arz.a.c);
   public static final arz c = a("dragon", 0L, false, arz.a.c);
   public static final arz d = a("player_loading", 0L, false, arz.a.a);
   public static final arz e = a("player_simulation", 0L, false, arz.a.b);
   public static final arz f = a("forced", 0L, true, arz.a.c);
   public static final arz g = a("portal", 300L, true, arz.a.c);
   public static final arz h = a("ender_pearl", 40L, false, arz.a.c);
   public static final arz i = a("unknown", 1L, false, arz.a.a);

   private static arz a(String $$0, long $$1, boolean $$2, arz.a $$3) {
      return js.a(mg.aA, $$0, new arz($$1, $$2, $$3));
   }

   public boolean a() {
      return this.l == arz.a.a || this.l == arz.a.c;
   }

   public boolean b() {
      return this.l == arz.a.b || this.l == arz.a.c;
   }

   public boolean c() {
      return this.j != 0L;
   }

   public long d() {
      return this.j;
   }

   public boolean e() {
      return this.k;
   }

   public arz.a f() {
      return this.l;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
