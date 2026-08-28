import java.util.UUID;

public record aat(aat.a c) implements aau {
   public static final zi<wh, aat> a = aau.a(aat::a, aat::new);
   public static final aau.b<aat> b = aau.a("debug/breeze");

   private aat(wh $$0) {
      this(new aat.a($$0));
   }

   private void a(wh $$0) {
      this.c.a($$0);
   }

   @Override
   public aau.b<aat> a() {
      return b;
   }

   public aat.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jh d) {
      public a(wh $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wh::readInt), $$0.c(jh.b));
      }

      public void a(wh $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, wh::q);
         $$0.a(this.d, jh.b);
      }

      public String a() {
         return agx.a(this.a);
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
