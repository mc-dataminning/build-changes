public record aaz(aaz.a c) implements aas {
   public static final zg<wf, aaz> a = aas.a(aaz::a, aaz::new);
   public static final aas.b<aaz> b = aas.a("debug/hive");

   private aaz(wf $$0) {
      this(new aaz.a($$0));
   }

   private void a(wf $$0) {
      this.c.a($$0);
   }

   @Override
   public aas.b<aaz> a() {
      return b;
   }

   public aaz.a b() {
      return this.c;
   }

   public static record a(jh a, String b, int c, int d, boolean e) {
      public a(wf $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(wf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.q(this.c);
         $$0.q(this.d);
         $$0.a(this.e);
      }
   }
}
