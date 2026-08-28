public record asb(long j, boolean k, asb.a l) {
   public static final long a = 0L;
   public static final asb b = a("start", 0L, false, asb.a.c);
   public static final asb c = a("dragon", 0L, false, asb.a.c);
   public static final asb d = a("player_loading", 0L, false, asb.a.a);
   public static final asb e = a("player_simulation", 0L, false, asb.a.b);
   public static final asb f = a("forced", 0L, true, asb.a.c);
   public static final asb g = a("portal", 300L, true, asb.a.c);
   public static final asb h = a("ender_pearl", 40L, false, asb.a.c);
   public static final asb i = a("unknown", 1L, false, asb.a.a);

   private static asb a(String $$0, long $$1, boolean $$2, asb.a $$3) {
      return jt.a(mh.aA, $$0, new asb($$1, $$2, $$3));
   }

   public boolean a() {
      return this.l == asb.a.a || this.l == asb.a.c;
   }

   public boolean b() {
      return this.l == asb.a.b || this.l == asb.a.c;
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

   public asb.a f() {
      return this.l;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
