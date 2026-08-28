public record arv(long j, boolean k, arv.a l) {
   public static final int a = 0;
   public static final arv b = a("start", 0L, false, arv.a.c);
   public static final arv c = a("dragon", 0L, false, arv.a.c);
   public static final arv d = a("player_loading", 0L, false, arv.a.a);
   public static final arv e = a("player_simulation", 0L, false, arv.a.b);
   public static final arv f = a("forced", 0L, true, arv.a.c);
   public static final arv g = a("portal", 300L, true, arv.a.c);
   public static final arv h = a("ender_pearl", 40L, false, arv.a.c);
   public static final arv i = a("unknown", 1L, false, arv.a.a);

   private static arv a(String $$0, long $$1, boolean $$2, arv.a $$3) {
      return jr.a(mf.aA, $$0, new arv($$1, $$2, $$3));
   }

   public boolean a() {
      return this.l == arv.a.a || this.l == arv.a.c;
   }

   public boolean b() {
      return this.l == arv.a.b || this.l == arv.a.c;
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

   public arv.a f() {
      return this.l;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
