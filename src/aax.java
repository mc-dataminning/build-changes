import java.util.List;

public record aax(int c, jg d, List<aax.a> e) implements aar {
   public static final zf<we, aax> a = aar.a(aax::a, aax::new);
   public static final aar.b<aax> b = aar.a("debug/goal_selector");

   private aax(we $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aax.a::new));
   }

   private void a(we $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aar.b<aax> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public jg c() {
      return this.d;
   }

   public List<aax.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(we $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(we $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
