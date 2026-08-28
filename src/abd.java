public record abd(abd.a c) implements aaw {
   public static final zm<wl, abd> a = aaw.a(abd::a, abd::new);
   public static final aaw.b<abd> b = aaw.a("debug/hive");

   private abd(wl $$0) {
      this(new abd.a($$0));
   }

   private void a(wl $$0) {
      this.c.a($$0);
   }

   @Override
   public aaw.b<abd> a() {
      return b;
   }

   public abd.a b() {
      return this.c;
   }

   public static record a(iz a, String b, int c, int d, boolean e) {
      public a(wl $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(wl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
