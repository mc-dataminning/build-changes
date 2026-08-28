import java.util.List;

public record aba(int c, jh d, List<aba.a> e) implements aau {
   public static final zi<wh, aba> a = aau.a(aba::a, aba::new);
   public static final aau.b<aba> b = aau.a("debug/goal_selector");

   private aba(wh $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aba.a::new));
   }

   private void a(wh $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aau.b<aba> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public jh c() {
      return this.d;
   }

   public List<aba.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(wh $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wh $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
