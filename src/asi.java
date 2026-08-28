public record asi(long j, boolean k, asi.a l) {
   public static final long a = 0L;
   public static final asi b = a("start", 0L, false, asi.a.c);
   public static final asi c = a("dragon", 0L, false, asi.a.c);
   public static final asi d = a("player_loading", 0L, false, asi.a.a);
   public static final asi e = a("player_simulation", 0L, false, asi.a.b);
   public static final asi f = a("forced", 0L, true, asi.a.c);
   public static final asi g = a("portal", 300L, true, asi.a.c);
   public static final asi h = a("ender_pearl", 40L, false, asi.a.c);
   public static final asi i = a("unknown", 1L, false, asi.a.a);

   private static asi a(String $$0, long $$1, boolean $$2, asi.a $$3) {
      return jt.a(mh.aA, $$0, new asi($$1, $$2, $$3));
   }

   public boolean a() {
      return this.l == asi.a.a || this.l == asi.a.c;
   }

   public boolean b() {
      return this.l == asi.a.b || this.l == asi.a.c;
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

   public asi.a f() {
      return this.l;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
