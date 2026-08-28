public record aav(aav.a c) implements aao {
   public static final zc<wb, aav> a = aao.a(aav::a, aav::new);
   public static final aao.b<aav> b = aao.a("debug/hive");

   private aav(wb $$0) {
      this(new aav.a($$0));
   }

   private void a(wb $$0) {
      this.c.a($$0);
   }

   @Override
   public aao.b<aav> a() {
      return b;
   }

   public aav.a b() {
      return this.c;
   }

   public static record a(jf a, String b, int c, int d, boolean e) {
      public a(wb $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(wb $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.q(this.c);
         $$0.q(this.d);
         $$0.a(this.e);
      }
   }
}
