public record aac(id c, int d) implements zq {
   public static final yg<vi, aac> a = zq.a(aac::a, aac::new);
   public static final zq.b<aac> b = zq.a("debug/poi_ticket_count");

   private aac(vi $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vi $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public zq.b<aac> a() {
      return b;
   }

   public id b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
