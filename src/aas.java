import java.util.List;

public record aas(int c, ir d, List<aas.a> e) implements aam {
   public static final zc<we, aas> a = aam.a(aas::a, aas::new);
   public static final aam.b<aas> b = aam.a("debug/goal_selector");

   private aas(we $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aas.a::new));
   }

   private void a(we $$0) {
      $$0.p(this.c);
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

   public ir c() {
      return this.d;
   }

   public List<aas.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(we $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(we $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
