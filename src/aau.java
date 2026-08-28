import java.util.List;

public record aau(int c, jf d, List<aau.a> e) implements aao {
   public static final zc<wb, aau> a = aao.a(aau::a, aau::new);
   public static final aao.b<aau> b = aao.a("debug/goal_selector");

   private aau(wb $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aau.a::new));
   }

   private void a(wb $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aao.b<aau> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public jf c() {
      return this.d;
   }

   public List<aau.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(wb $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wb $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
