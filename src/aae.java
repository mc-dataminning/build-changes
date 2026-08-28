import java.util.List;

public record aae(int c, ji d, List<aae.a> e) implements zy {
   public static final ym<vl, aae> a = zy.a(aae::a, aae::new);
   public static final zy.b<aae> b = zy.a("debug/goal_selector");

   private aae(vl $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aae.a::new));
   }

   private void a(vl $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zy.b<aae> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ji c() {
      return this.d;
   }

   public List<aae.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vl $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vl $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
