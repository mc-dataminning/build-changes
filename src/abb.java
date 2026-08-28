import java.util.List;

public record abb(int c, jh d, List<abb.a> e) implements aav {
   public static final zj<wi, abb> a = aav.a(abb::a, abb::new);
   public static final aav.b<abb> b = aav.a("debug/goal_selector");

   private abb(wi $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(abb.a::new));
   }

   private void a(wi $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aav.b<abb> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public jh c() {
      return this.d;
   }

   public List<abb.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(wi $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wi $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
