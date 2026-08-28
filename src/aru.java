public record aru(long j, boolean k, aru.a l) {
   public static final int a = 0;
   public static final aru b = a("start", 0L, false, aru.a.c);
   public static final aru c = a("dragon", 0L, false, aru.a.c);
   public static final aru d = a("player_loading", 0L, false, aru.a.a);
   public static final aru e = a("player_simulation", 0L, false, aru.a.b);
   public static final aru f = a("forced", 0L, true, aru.a.c);
   public static final aru g = a("portal", 300L, true, aru.a.c);
   public static final aru h = a("ender_pearl", 40L, false, aru.a.c);
   public static final aru i = a("unknown", 1L, false, aru.a.a);

   private static aru a(String $$0, long $$1, boolean $$2, aru.a $$3) {
      return kf.a(md.aC, $$0, new aru($$1, $$2, $$3));
   }

   public boolean a() {
      return this.l == aru.a.a || this.l == aru.a.c;
   }

   public boolean b() {
      return this.l == aru.a.b || this.l == aru.a.c;
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

   public aru.a f() {
      return this.l;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
