public record aal(ji c, int d) implements zz {
   public static final yn<vl, aal> a = zz.a(aal::a, aal::new);
   public static final zz.b<aal> b = zz.a("debug/poi_ticket_count");

   private aal(vl $$0) {
      this($$0.e(), $$0.readInt());
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      $$0.q(this.d);
   }

   @Override
   public zz.b<aal> a() {
      return b;
   }

   public ji b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
