import java.util.List;

public record aag(int c, im d, List<aag.a> e) implements aaa {
   public static final yq<vs, aag> a = aaa.a(aag::a, aag::new);
   public static final aaa.b<aag> b = aaa.a("debug/goal_selector");

   private aag(vs $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aag.a::new));
   }

   private void a(vs $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aaa.b<aag> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public im c() {
      return this.d;
   }

   public List<aag.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vs $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vs $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
