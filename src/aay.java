import java.util.List;

public record aay(int c, jh d, List<aay.a> e) implements aas {
   public static final zg<wf, aay> a = aas.a(aay::a, aay::new);
   public static final aas.b<aay> b = aas.a("debug/goal_selector");

   private aay(wf $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aay.a::new));
   }

   private void a(wf $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aas.b<aay> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public jh c() {
      return this.d;
   }

   public List<aay.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(wf $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wf $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
