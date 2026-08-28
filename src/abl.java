import java.util.List;

public record abl(int c, jh d, List<abl.a> e) implements abf {
   public static final zt<ws, abl> a = abf.a(abl::a, abl::new);
   public static final abf.b<abl> b = abf.a("debug/goal_selector");

   private abl(ws $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(abl.a::new));
   }

   private void a(ws $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public abf.b<abl> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public jh c() {
      return this.d;
   }

   public List<abl.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(ws $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(ws $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
