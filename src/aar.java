import java.util.UUID;

public record aar(aar.a c) implements aas {
   public static final zg<wf, aar> a = aas.a(aar::a, aar::new);
   public static final aas.b<aar> b = aas.a("debug/breeze");

   private aar(wf $$0) {
      this(new aar.a($$0));
   }

   private void a(wf $$0) {
      this.c.a($$0);
   }

   @Override
   public aas.b<aar> a() {
      return b;
   }

   public aar.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jh d) {
      public a(wf $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wf::readInt), $$0.c(jh.b));
      }

      public void a(wf $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, wf::q);
         $$0.a(this.d, jh.b);
      }

      public String a() {
         return agr.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public Integer d() {
         return this.c;
      }

      public jh e() {
         return this.d;
      }
   }
}
