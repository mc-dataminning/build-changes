public record aaw(long c, jf d) implements aao {
   public static final zc<wb, aaw> a = aao.a(aaw::a, aaw::new);
   public static final aao.b<aaw> b = aao.a("debug/neighbors_update");

   private aaw(wb $$0) {
      this($$0.m(), $$0.e());
   }

   private void a(wb $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aao.b<aaw> a() {
      return b;
   }

   public long b() {
      return this.c;
   }

   public jf c() {
      return this.d;
   }
}
