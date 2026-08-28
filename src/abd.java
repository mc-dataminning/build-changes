import java.util.List;

public record abd(int c, iz d, List<abd.a> e) implements aax {
   public static final zn<wm, abd> a = aax.a(abd::a, abd::new);
   public static final aax.b<abd> b = aax.a("debug/goal_selector");

   private abd(wm $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(abd.a::new));
   }

   private void a(wm $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aax.b<abd> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public iz c() {
      return this.d;
   }

   public List<abd.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(wm $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wm $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
