import java.util.List;

public record aaz(int c, iz d, List<aaz.a> e) implements aat {
   public static final zj<wl, aaz> a = aat.a(aaz::a, aaz::new);
   public static final aat.b<aaz> b = aat.a("debug/goal_selector");

   private aaz(wl $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aaz.a::new));
   }

   private void a(wl $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aat.b<aaz> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public iz c() {
      return this.d;
   }

   public List<aaz.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(wl $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wl $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
