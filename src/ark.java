public record ark(long j, boolean k, ark.a l) {
   public static final int a = 0;
   public static final ark b = a("start", 0L, false, ark.a.c);
   public static final ark c = a("dragon", 0L, false, ark.a.c);
   public static final ark d = a("player_loading", 0L, false, ark.a.a);
   public static final ark e = a("player_simulation", 0L, false, ark.a.b);
   public static final ark f = a("forced", 0L, true, ark.a.c);
   public static final ark g = a("portal", 300L, true, ark.a.c);
   public static final ark h = a("ender_pearl", 40L, false, ark.a.c);
   public static final ark i = a("unknown", 1L, false, ark.a.a);

   private static ark a(String $$0, long $$1, boolean $$2, ark.a $$3) {
      return ke.a(mb.aC, $$0, new ark($$1, $$2, $$3));
   }

   public boolean a() {
      return this.l == ark.a.a || this.l == ark.a.c;
   }

   public boolean b() {
      return this.l == ark.a.b || this.l == ark.a.c;
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

   public ark.a f() {
      return this.l;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
