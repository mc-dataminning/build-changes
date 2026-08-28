import java.util.List;

public record aao(int c, iu d, List<aao.a> e) implements aai {
   public static final yw<vu, aao> a = aai.a(aao::a, aao::new);
   public static final aai.b<aao> b = aai.a("debug/goal_selector");

   private aao(vu $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aao.a::new));
   }

   private void a(vu $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aai.b<aao> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public iu c() {
      return this.d;
   }

   public List<aao.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vu $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vu $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
