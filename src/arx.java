public record arx(long j, boolean k, arx.a l) {
   public static final long a = 0L;
   public static final arx b = a("start", 0L, false, arx.a.c);
   public static final arx c = a("dragon", 0L, false, arx.a.c);
   public static final arx d = a("player_loading", 0L, false, arx.a.a);
   public static final arx e = a("player_simulation", 0L, false, arx.a.b);
   public static final arx f = a("forced", 0L, true, arx.a.c);
   public static final arx g = a("portal", 300L, true, arx.a.c);
   public static final arx h = a("ender_pearl", 40L, false, arx.a.c);
   public static final arx i = a("unknown", 1L, false, arx.a.a);

   private static arx a(String $$0, long $$1, boolean $$2, arx.a $$3) {
      return js.a(mg.aA, $$0, new arx($$1, $$2, $$3));
   }

   public boolean a() {
      return this.l == arx.a.a || this.l == arx.a.c;
   }

   public boolean b() {
      return this.l == arx.a.b || this.l == arx.a.c;
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

   public arx.a f() {
      return this.l;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
