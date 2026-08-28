import java.util.List;

public record aam(int c, iu d, List<aam.a> e) implements aag {
   public static final yu<vs, aam> a = aag.a(aam::a, aam::new);
   public static final aag.b<aam> b = aag.a("debug/goal_selector");

   private aam(vs $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aam.a::new));
   }

   private void a(vs $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aag.b<aam> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public iu c() {
      return this.d;
   }

   public List<aam.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vs $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vs $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
