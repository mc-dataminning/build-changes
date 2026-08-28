import java.util.List;

public record aat(int c, je d, List<aat.a> e) implements aan {
   public static final zb<wa, aat> a = aan.a(aat::a, aat::new);
   public static final aan.b<aat> b = aan.a("debug/goal_selector");

   private aat(wa $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aat.a::new));
   }

   private void a(wa $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aan.b<aat> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public je c() {
      return this.d;
   }

   public List<aat.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(wa $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wa $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
