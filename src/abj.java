public record abj(iz c, int d) implements aax {
   public static final zn<wm, abj> a = aax.a(abj::a, abj::new);
   public static final aax.b<abj> b = aax.a("debug/poi_ticket_count");

   private abj(wm $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(wm $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
   }

   @Override
   public aax.b<abj> a() {
      return b;
   }

   public iz b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
