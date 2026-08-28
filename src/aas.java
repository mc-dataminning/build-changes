import java.util.List;

public record aas(int c, iw d, List<aas.a> e) implements aam {
   public static final za<vy, aas> a = aam.a(aas::a, aas::new);
   public static final aam.b<aas> b = aam.a("debug/goal_selector");

   private aas(vy $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aas.a::new));
   }

   private void a(vy $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aam.b<aas> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public iw c() {
      return this.d;
   }

   public List<aas.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vy $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vy $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
