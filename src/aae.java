import java.util.UUID;

public record aae(aae.a c) implements aaf {
   public static final yt<vr, aae> a = aaf.a(aae::a, aae::new);
   public static final aaf.b<aae> b = aaf.a("debug/breeze");

   private aae(vr $$0) {
      this(new aae.a($$0));
   }

   private void a(vr $$0) {
      this.c.a($$0);
   }

   @Override
   public aaf.b<aae> a() {
      return b;
   }

   public aae.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jj d) {
      public a(vr $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vr::readInt), $$0.c(jj.b));
      }

      public void a(vr $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, vr::q);
         $$0.a(this.d, jj.b);
      }

      public String a() {
         return agi.a(this.a);
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

      public jj e() {
         return this.d;
      }
   }
}
