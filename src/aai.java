import java.util.List;

public record aai(int c, in d, List<aai.a> e) implements aac {
   public static final ys<vu, aai> a = aac.a(aai::a, aai::new);
   public static final aac.b<aai> b = aac.a("debug/goal_selector");

   private aai(vu $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aai.a::new));
   }

   private void a(vu $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aac.b<aai> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public in c() {
      return this.d;
   }

   public List<aai.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vu $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vu $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
